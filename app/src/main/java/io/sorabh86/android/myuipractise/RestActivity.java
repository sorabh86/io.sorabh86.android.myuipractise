package io.sorabh86.android.myuipractise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.NetworkOnMainThreadException;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import io.sorabh86.android.myuipractise.utils.MyUtils;

public class RestActivity extends AppCompatActivity {

    private static String TAG = "RestActivity";
    private static int API_SUCCESSS = 1;
    private static int API_FAILURE = 2;


    TextView rest_act_textview;
    ProgressBar rest_act_progressbar;
    Button rest_act_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);

        rest_act_textview = (TextView) findViewById(R.id.rest_act_textview);
        rest_act_progressbar = (ProgressBar) findViewById(R.id.rest_act_progressbar);
        rest_act_btn = (Button) findViewById(R.id.rest_act_btn);

        rest_act_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // HttpAsyncTask ast = new HttpAsyncTask();
                // ast.execute();

//                ExecutorService executor = Executors.newSingleThreadExecutor();
//                executor.execute(new HttpRunnable(null, rest_act_textview));

//                both of below throw NetworkOnMainThreadException
//                runOnUiThread(new HttpRunnable(rest_act_textview));

                getDataFromURL();
            }
        });


    }

    private void getDataFromURL() {
        Handler handler = new Handler(Looper.getMainLooper());
        
        (new Thread(new Runnable() {
            String uri = "http://172.24.64.1:8080/courses.json";

            @Override
            public void run() {
                String res = MyUtils.fetchHttp(uri);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Log.i(TAG, "run: "+res);
                        rest_act_textview.setText(res);
                    }
                });
            }
        })).start();
    }

    // depricated
    private class HttpAsyncTask extends AsyncTask<Void, Void, String> {
        String uri = "http://172.24.64.1:8080/courses.json";

        @Override
        protected String doInBackground(Void... voids) {
            String res = MyUtils.fetchHttp(uri);
            Log.i(TAG, "doInBackground: "+res);
            return res;
        }
    }
}