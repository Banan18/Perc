package com.bananarepublick.banan.perc.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bananarepublick.banan.perc.R;

import java.util.ArrayList;

/**
 * Created by Banan on 30.11.2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater lInflater;
    private ArrayList<Rest> objects;
    private int mParam1 = 0;


    public ImageAdapter(Context context, ArrayList<Rest> objects) {

        this.context = context;
        this.objects = objects;
        lInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    @Override
    public int getCount() {
        return objects.size();
    }

    @Override
    public Object getItem(int position) {
        return objects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(convertView == null){


                view = lInflater.inflate(R.layout.gridmenu, parent, false);


        }
        Rest r = getRest(position);

        ((ImageView) view.findViewById(R.id.imagepart1)).setImageResource(r.image);
        ((TextView) view.findViewById(R.id.textmenu)).setText(r.name);




        return view;
    }

     private Rest getRest(int position){
        return ((Rest)getItem(position));
    }
}









