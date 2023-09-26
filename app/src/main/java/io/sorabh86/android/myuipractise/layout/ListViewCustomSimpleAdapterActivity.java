package io.sorabh86.android.myuipractise.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.Arrays;

import io.sorabh86.android.myuipractise.R;
import io.sorabh86.android.myuipractise.adapters.CustomSimpleAdapter;
import io.sorabh86.android.myuipractise.service.DataService;

public class ListViewCustomSimpleAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_custom_simple_adapter);

        String[] from = {"name", "image"};
        int[] to = {R.id.csa_text, R.id.csa_image};
        CustomSimpleAdapter csa = new CustomSimpleAdapter(
                this, DataService.getAnimalsList(),
                R.layout.listview_item_custom_simple_adapter, from, to);
        ListView csa_listView = findViewById(R.id.csa_listView);
        csa_listView.setAdapter(csa);

    }
}