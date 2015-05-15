package com.example.nezar.androidclubtask2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nezar on 5/4/2015.
 */public class MyArrayAdapter1 extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;
    private final int[] images;
    public MyArrayAdapter1(Context context, String[] values,int [] images) {
        super(context, R.layout.listitem1, values);
        this.context = context;
        this.values = values;
        this.images=images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listitem1, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        textView.setText(values[position]);
        imageView.setImageResource(images[position]);






        return rowView;
    }

}