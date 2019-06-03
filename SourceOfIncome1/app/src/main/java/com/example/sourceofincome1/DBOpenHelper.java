package com.example.sourceofincome1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {
    public static String db_name="billdatabase.db";
    public  static int VERSION=1;

    //Sources of income table
    public static String source_income_table_name="source_of_income_table";
    public static final String si_name="si_name";


    //create table Source of income
    public static final String CREATE_TABLE_SOURCE_INCOME="Create table "+ source_income_table_name+ "( "+ si_name+" text UNIQUE);";




    public DBOpenHelper(Context context) {
        super(context,db_name,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_SOURCE_INCOME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " +source_income_table_name);
        onCreate(db);    }


    public long insertDataToSourceOFIncome(String source_name){
        ContentValues contentValues=new ContentValues();
        contentValues.put(si_name,source_name);
        SQLiteDatabase sqLiteDb=this.getWritableDatabase();
        long row_inserted=sqLiteDb.insert(source_income_table_name,null,contentValues);
        sqLiteDb.close();
        return row_inserted;    }

    public void emptyTable(){
        SQLiteDatabase sqLiteDb=this.getWritableDatabase();
        sqLiteDb.delete(source_income_table_name,null,null);
        //sqLiteDb.execSQL("DELETE FROM " + source_income_table_name);
        //sqLiteDb.execSQL("vacuum");
        sqLiteDb.close();    }

     //Method to show all sources of income data
    public Cursor showSourcesOfIncomeData(){
        SQLiteDatabase db=this.getReadableDatabase();
        String query="SELECT * FROM "+ source_income_table_name;
        Cursor cursorSI=db.rawQuery(query,null);
        return cursorSI;
    }

}
