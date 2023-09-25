package io.sorabh86.android.myuipractise.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import io.sorabh86.android.myuipractise.R;

/**
 * Author: sorabh86 <sorabh86.github.com>
 * @Date: 25-09-2023
 */
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private int animals[];
    private LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] animals) {
        this.context = applicationContext;
        this.animals = animals;
        inflater = LayoutInflater.from(applicationContext);
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.gridview_item, null);
        ImageView itemIcon = view.findViewById(R.id.itemIcon);
        itemIcon.setImageResource(animals[i]);
        TextView itemTitle = view.findViewById(R.id.itemTitle);
        String path = context.getResources().getString(animals[i]);
//        String[] pathArr = path.split("/");
//        String title = pathArr[pathArr.length-1];
        String title = path.substring(path.lastIndexOf('/')+1);
        itemTitle.setText(title);
        return view;
    }
}
