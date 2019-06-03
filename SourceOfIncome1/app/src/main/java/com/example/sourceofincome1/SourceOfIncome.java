package com.example.sourceofincome1;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SourceOfIncome extends AppCompatActivity {

    DBOpenHelper db;
    ArrayList<String> listItemsSi;
    ArrayAdapter adapter;
    ListView SI_list_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source_of_income);


       SI_list_view= findViewById(R.id.source_of_income_listView);

        db=new DBOpenHelper(this);
        listItemsSi=new ArrayList<>();
        viewData();


//        SI_list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String text=SI_list_view.getItemAtPosition(position).toString();
//                Toast.makeText(SourceOfIncome.this, ""+text,Toast.LENGTH_SHORT);
//            }
//        });



    }

    private void viewData() {
        Cursor cursor=db.showSourcesOfIncomeData();
        if(cursor.getCount()==0){
            Toast.makeText(this, "No data ro show", Toast.LENGTH_LONG).show();
        }
        else {
            while(cursor.moveToNext()){
                listItemsSi.add((cursor.getString(0))); //Indexul coloanei pe care o arati
            }

        }

        adapter= new ArrayAdapter<>(this,R.layout.activity_source_of_income,listItemsSi);
        SI_list_view.setAdapter(adapter);

    }
}
