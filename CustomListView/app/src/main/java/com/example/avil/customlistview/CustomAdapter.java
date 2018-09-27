package com.example.avil.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[]array;
    int[]flags;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] array, int[] flags) {
        this.context = context;
        this.array = array;
        this.flags = flags;
    }

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
           inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView=inflater.inflate(R.layout.sample_view,parent,false);



        }
        ImageView imageView= convertView.findViewById(R.id.image_view_id);
        TextView textView= convertView.findViewById(R.id.text_view_id);

        imageView.setImageResource(flags[position]);
        textView.setText(array[position]);

        return convertView;
    }
}
