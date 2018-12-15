package com.example.azhar.starbuzz;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.id;
import static android.R.attr.y;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //First instantiate arrayadapter, as that is the adapter we are using to bind the Drinks array to this list
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(
                //simply pass it 3 parameters - the context(usually 'this' is the activity you're working in)
                this,
                android.R.layout.simple_list_item_1, //...the way you want to display the list, simple_list_item_1 is part of android resources
                Drink.drinks);//...and finally the array itself

        //after it has been created we still need to apply the adapter we just created to the list view, just like the listener
        ListView l = getListView();
        l.setAdapter(listAdapter);
    }

    //as this is a list Activity - no need for onListItemClickListener as this is a list activity it does this by default
    public void onListItemClick(ListView listView, View itemView, int position, long ID){

        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
        //pass in ID - passing in id means that when the user clicks on it the id for this drink
        //will be recognised and the relevant information will be passed on. - EXTRA_DRINKNO is a constant that we will create in Drink Activity
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) ID);
        startActivity(intent);
    }



}
