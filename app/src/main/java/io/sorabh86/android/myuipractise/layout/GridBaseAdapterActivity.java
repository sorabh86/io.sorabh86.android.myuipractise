package io.sorabh86.android.myuipractise.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import io.sorabh86.android.myuipractise.R;
import io.sorabh86.android.myuipractise.adapters.CustomAdapter;
import io.sorabh86.android.myuipractise.service.DataService;

public class GridBaseAdapterActivity extends AppCompatActivity {

    GridView simpleGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_base_adapter);

        simpleGridView = findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), DataService.getAnimals());
        simpleGridView.setAdapter(customAdapter);
    }
}