package com.example.azhar.starbuzz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Azhar on 29/03/2018.
 */

public class StarbuzzDatabaseHelper extends SQLiteOpenHelper {

    //VARIABLES
    public static final String DB_NAME = "starbuzz";
    public static final int DB_VERSION = 1;


    //CONSTRUCTOR

    public StarbuzzDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, DB_VERSION);
        //null - this is an advanced feature to do with cursors. this will be covered later on in the book.
    }

    //METHODS

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE DRINK ("
    + "_id PRIMARY KEY AUTOINCREMENT, "
    + "NAME TEXT, "
    + "DESCRIPTION TEXT, "
    + "IMAGE_RESOURCE_ID INTEGER) ;");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
