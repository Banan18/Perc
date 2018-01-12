package com.bananarepublick.banan.perc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Banan on 10.01.2018.
 */

public class ImageAdapterTwo extends BaseAdapter {

    private Context context;

    public ImageAdapterTwo(Context context) {
        this.context = context;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return position;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View grid;

        if (convertView == null) {
            grid = new View(context);
            //LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            assert inflater != null;
            grid = inflater.inflate(R.layout.gridmenu, parent, false);
        } else {
            grid = (View) convertView;
        }

        ImageView imageView = (ImageView) grid.findViewById(R.id.imagepart1);
        imageView.setImageResource(mThumbIds[position]);
        TextView textView = (TextView) grid.findViewById(R.id.textmenu);
        textView.setText(mTextIds[position]);


        return grid;
    }

    // references to our images
    private Integer[] mThumbIds = {R.drawable.pizza_menu, R.drawable.pasta_menu,
           R.drawable.raviol_menu,R.drawable.laz_menu, R.drawable.salat_menu, R.drawable.dessert_menu};
    private Integer[] mTextIds = {R.string.cat1, R.string.cat2, R.string.cat3, R.string.cat4, R.string.cat5, R.string.cat6};
}
