package com.example.hrmnt.listview;

/**
 * Created by hrmnt on 5/25/17.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Drink[] drinks ={
            new Drink("Latte","An esspresso with milk",R.drawable.latte),new Drink("Capucino","An esspresso with water",R.drawable.capucino),new Drink("Esspresso","Main of other drinks",R.drawable.esspresso)
    };

    private Drink(String name,String description,int imageResourceId){
        this.name=name;
        this.description=description;
        this.imageResourceId=imageResourceId;
    }

    public  String getDescription(){
        return description;
    }
    public String getName(){
        return  name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public  String toString(){
        return  this.name;
    }
}
