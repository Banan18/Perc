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
 * Created by Banan on 10.01.2018.
 */

public class ImageAdapterTwo extends BaseAdapter {

    private Context context;
    private LayoutInflater lInflater;
    private ArrayList<Prod> objects;
    int mParam1 = 0;


    public ImageAdapterTwo(Context context, ArrayList<Prod> objects) {

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


            view = lInflater.inflate(R.layout.cellgrid, parent, false);


        }
        Prod p = getProd(position);

        ((ImageView) view.findViewById(R.id.imagepart)).setImageResource(p.image);
        ((TextView) view.findViewById(R.id.textmenu1)).setText(p.name);
        ((TextView) view.findViewById(R.id.textpart)).setText(p.price);




        return view;
    }

    private Prod getProd(int position){
        return ((Prod)getItem(position));
    }
}
