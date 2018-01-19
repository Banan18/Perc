package com.bananarepublick.banan.perc.Adapters;

/**
 * Created by Banan on 19.01.2018.
 */

public class Prod {

    int name;
    String price;
    int image;

    public Prod(int _name, int _price, int _image){
        name = _name;
        price = String.valueOf(_price)+" "+"\u20BD";
        image = _image;

    }
}
