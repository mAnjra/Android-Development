package com.example.azhar.starbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {

    //here is the constant that will help pass in the drink id
    public static final String EXTRA_DRINKNO = "drinkNo";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //STEP 1: GET THE DRINK FROM THE INTENT

        //get the intent, get the extra information from the intent which is the drink ID
        //pass that into the variable drinkNumber
        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);

        //instantiate class 'Drink' and pass in the variable drinkNumber(which now is the ID number of what the user clicked)
        //this will then look up what is the index in the array and
        Drink drink = Drink.drinks[drinkNo];//we put the index number into drink

        //now we have to populate the 3 different views we added to our layout,
        //image view, textview, textview

        //STEP 2 : POPULATE VIEWS FROM GETTERS WE CREATED IN THE DRINK CLASS

        //Populate drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceID());
        photo.setContentDescription(drink.getName());

        //Populate name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        //Populate description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());


    }
}
