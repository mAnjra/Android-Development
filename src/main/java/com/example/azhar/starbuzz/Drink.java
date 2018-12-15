package com.example.azhar.starbuzz;

/**
 * Created by Azhar on 28/04/2017.
 */

public class Drink {

    //each drink has a Name, description, and Image resource ID
    private String name;
    private String description;
    private int imageResourceID;


    //Constructor: each drink needs a name, description and image resource ID
    private Drink (String name, String description, int  imageResourceID){
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }


    //array of 3 drinks - array needs 3 parameters as we have these chosen in the constructor
    public static final Drink[] drinks = {
      new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
      new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
      new Drink("Filter","Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };


    //get methods
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceID(){
        return imageResourceID;
    }

    public String toString(){
        return this.name;
    }

}
