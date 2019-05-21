package com.example.sourceofincome;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText source_of_income_add_text;
    Button btn_add_source_of_income;
    Button btn_delete_all_data_si;
    DBOpenHelper dbOpenHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbOpenHelper=new DBOpenHelper(this);
        source_of_income_add_text=(EditText)findViewById(R.id.add_spurce_of_income_input) ;


        btn_add_source_of_income=(Button)findViewById(R.id.add_to_db_source_of_income_name);
        btn_delete_all_data_si=(Button)findViewById(R.id.delete_all_data_from_si_db);


        btn_add_source_of_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=source_of_income_add_text.getText().toString();

                long row_inserted=dbOpenHelper.insertDataToSourceOFIncome(name);
                Context context =MainActivity.this ;
                if(row_inserted != -1) {

                    Toast.makeText(context,"New row added with value. " +name,Toast.LENGTH_SHORT).show();            }
                else
                    Toast.makeText( context,"Something wrong", Toast.LENGTH_SHORT).show();

            }
        });




        btn_delete_all_data_si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbOpenHelper.emptyTable();
            }
        });

    }
    }
