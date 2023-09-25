package io.sorabh86.android.myuipractise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class UITopicActivity extends AppCompatActivity {

    private TextView _textViewTopic;
    private Spinner _spinnerCourses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_topic);

//        setupUI();

//        String[] string = getResources().getStringArray(R.array.res_val_layouts);
    }

    private void setupUI() {
        _textViewTopic = findViewById(R.id.textview_topic);
    }
}