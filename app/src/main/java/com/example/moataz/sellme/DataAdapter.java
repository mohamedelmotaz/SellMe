package com.example.moataz.sellme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends ArrayAdapter<data> {
    ImageView imageView;
    TextView textView1,textView2;
    public DataAdapter( Context context, List<data> objects) {
        super(context,0, objects);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        convertView=LayoutInflater.from(getContext()).inflate(R.layout.custom_row,parent,false);
        imageView=convertView.findViewById(R.id.img);
        textView1=convertView.findViewById(R.id.title);
        textView2=convertView.findViewById(R.id.description);
        data data=getItem(position);
        imageView.setImageResource(data.getImgId());
        textView1.setText(data.getTitle());
        textView2.setText(data.getDescription());
        return convertView;
    }
}
