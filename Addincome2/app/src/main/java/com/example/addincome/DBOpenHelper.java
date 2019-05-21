package com.example.addincome;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {
    public static String db_name="billsqlit.db";
    public  static int VERSION=1;

    public static String source_income_table_name="source_of_income_table"; //SI
    public static final String si_id="si_id";
    public static final String si_name="si_name";


    //create table Source of income
    private static final String CREATE_TABLE_SOURCE_INCOME_command = new StringBuilder().append("Create table ").append(source_income_table_name).append("( ").append(si_id).append(" integer primary key autoincrement, ").append(si_name).append(" text UNIQUE);").toString();




    public DBOpenHelper(Context context) {
        super(context,db_name,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREATE_TABLE_SOURCE_INCOME_command);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " +source_income_table_name);
        onCreate(db);

    }


    public long insertDataToSourceOFIncome(String source_name){

        ContentValues contentValues=new ContentValues();
        contentValues.put(si_name,source_name);
        SQLiteDatabase sqLiteDb=this.getWritableDatabase();
        long row_inserted=sqLiteDb.insert(source_income_table_name,null,contentValues);
        sqLiteDb.close();
        return row_inserted;

    }

    public void emptyTable(String numele_tabelului) {
        SQLiteDatabase sqLiteDb = this.getWritableDatabase();
        sqLiteDb.delete(numele_tabelului, null, null);
        //sqLiteDb.execSQL("DELETE FROM " + source_income_table_name);
        sqLiteDb.execSQL("vacuum");
        //sqLiteDb.close();


    }
}
