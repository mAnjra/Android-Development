package com.example.azhar.starbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        //WE CANT USE android:onClick, AS THIS CAN ONLY BE USED WITH BUTTONS, AND SUBCLASSES OF BUTTONS SUCH CHECKBOXES
        //RADIO BUTTONS ETC. listView ISN'T A SUBCLASS OF BUTTON THAT IS WHY WE HAVE TO CREATE OUR OWN LISTENER.

        //OnItemClickListener is a nested class with AdapterView class. A ListView is a subclass of AdapterView
        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {

            //pass in the parameters,so we pass in the list view, then we add a reference to the item view, its position in
            //your list and finally the row id.
            public void onItemClick(AdapterView<?> listView,//<----- the view that was clicked,(in this case, the list view)
                                    View itemView,//<---|
                                    int position, //<---|-----> These give you more about which item was clicked in the list view
                                    long id) {    //<---|       such as the item view and its position.

                if (position == 0) {
                    //first you show where the intent is coming from, in this case TopLevelActivity.this
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    //finally what activity it needs to launch
                    startActivity(intent);
                }
            }
        };

        //Finally we must add the listener that has been created above to the list, this step is crucial
        //remember we have only created the listener, now it needs to be added to our list
        //this step tells the listener that an item in the list is being clicked
        ListView listView = (ListView) findViewById(R.id.list_options);//so we get reference to our list view
        listView.setOnItemClickListener(itemClickListener);//and we set the listener we created above to our list

    }

    }

