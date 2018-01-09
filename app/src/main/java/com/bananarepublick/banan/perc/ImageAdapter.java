package com.bananarepublick.banan.perc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Banan on 30.11.2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;


    private int mParam1 = 1;


    public ImageAdapter(Context context) {
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

    public void setId(int code) {
        if (code != 0) {
            this.mParam1 = code;


        }
    }


    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        View grid;


        if (convertView == null) {
            grid = new View(context);
            //LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            assert inflater != null;
            grid = inflater.inflate(R.layout.cellgrid, parent, false);
        } else {
            grid = (View) convertView;

        }
        switch (mParam1) {


            case 1:

                ImageView imageView = (ImageView) grid.findViewById(R.id.imagepart);
            TextView textView = (TextView) grid.findViewById(R.id.textpart);
            imageView.setImageResource(mThumbIds[position]);
            textView.setText(mTextIds[position]);
            break;

            case 2:
                imageView = (ImageView) grid.findViewById(R.id.imagepart);
                textView = (TextView) grid.findViewById(R.id.textpart);
                textView.setText(mTextActionIds[position]);
                textView = (TextView) grid.findViewById(R.id.textpart2);
                textView.setText(mTextActionDopIds[position]);
            imageView.setImageResource(mAction[position]);

            break;
            case 3:
                imageView = (ImageView) grid.findViewById(R.id.imagepart);
                imageView.setImageResource(mRestIds[position]);
                break;



        }

        return grid;
    }

    // references to our images
    private Integer[] mThumbIds = {R.drawable.pizza_menu, R.drawable.pasta_menu,
            R.drawable.salat_menu, R.drawable.dessert_menu};

    private Integer[] mRestIds = {R.drawable.ic_perc, R.drawable.ic_krem,
            R.drawable.ic_formagi, R.drawable.ic_baran};

    private Integer[] mAction = {R.drawable.action1, R.drawable.action2,
            R.drawable.action3, R.drawable.action4};

    private Integer[] mTextIds = {R.string.cat1, R.string.cat2, R.string.cat3, R.string.cat4};
    private Integer[] mTextActionIds = {R.string.act1, R.string.act2, R.string.act3, R.string.act4};
    private Integer[] mTextActionDopIds = {R.string.act1_1, R.string.act1_1, R.string.act1_1, R.string.act1_1};



}
