package com.example.custom_listview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
    //Public Variables
    Context context;
    String[] listCountry;
    int[] listImages;
    LayoutInflater inflater;

    //Constructor
    public CustomBaseAdapter(Context ctx,String[] countryList,int[] countryImages){
        this.context = ctx;
        this.listCountry = countryList;
        this.listImages = countryImages;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.custom_listview,null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView countryImg = (ImageView) convertView.findViewById(R.id.imageIcon);
        textView.setText(listCountry[position]);
        countryImg.setImageResource(listImages[position]);
        return convertView;
    }
}
