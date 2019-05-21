package com.example.bill2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public  class DatabaseHelper extends SQLiteOpenHelper {

    public final static String Database_name="database.db";
    public final static String TABLE_NAME="TAGS";
    public final static String COL_1="ID";
    public final static String COL_2="TAG_NAME";
    public final static String COL_3="DATA_CUMPARARII";
    public final static String COL_4="BUCATI";



    public DatabaseHelper(Context context){
        super(context,Database_name, null, 1);
        SQLiteDatabase db=this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME +"( ID INTEGER, TAG_NAME TEXT PRIMARY KEY, DATA_CUMPARARII DATE, BUCATI INTEGER) ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
