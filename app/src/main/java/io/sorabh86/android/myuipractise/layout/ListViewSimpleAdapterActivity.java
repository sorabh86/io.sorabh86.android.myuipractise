package io.sorabh86.android.myuipractise.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

import io.sorabh86.android.myuipractise.R;
import io.sorabh86.android.myuipractise.service.DataService;

public class ListViewSimpleAdapterActivity extends AppCompatActivity {

    ListView simpleListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_simple_adapter);

        simpleListView = findViewById(R.id.simpleListView);

        List<Map<String, Object>> animalsList = DataService.getAnimalsList();
        String[] from = {"name", "image"};
        int[] to = {R.id.simple_text, R.id.simple_image};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, animalsList, R.layout.listview_item_simple_item, from, to);
        simpleListView.setAdapter(simpleAdapter);

        simpleListView.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast.makeText(getApplicationContext(), ((Map)animalsList.get(i)).get("name").toString(), Toast.LENGTH_SHORT).show();
        });
    }
}