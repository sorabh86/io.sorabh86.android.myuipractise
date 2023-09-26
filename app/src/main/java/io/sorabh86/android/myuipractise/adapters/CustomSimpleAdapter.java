package io.sorabh86.android.myuipractise.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.List;
import java.util.Map;

import io.sorabh86.android.myuipractise.R;

/**
 * Author: sorabh86 <sorabh86.github.io> 26-09-2023
 */
public class CustomSimpleAdapter extends SimpleAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<? extends Map<String,?>> data;

    public CustomSimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.context = context;
        this.data = data;
        inflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        ImageView imageView = view.findViewById(R.id.csa_image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, data.get(position).get("name").toString(), Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
