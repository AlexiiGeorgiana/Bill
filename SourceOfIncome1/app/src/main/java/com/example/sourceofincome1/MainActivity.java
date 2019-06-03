package com.example.sourceofincome1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;




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

        Button SIPage=(Button)  findViewById(R.id.toSourceOfIncome);

        btn_add_source_of_income.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=source_of_income_add_text.getText().toString().toLowerCase();
                name=capitalizeFirstLetter(name);
                long row_inserted=dbOpenHelper.insertDataToSourceOFIncome(name);
                Context context =MainActivity.this ;
                if(row_inserted != -1) {

                    Toast.makeText(context,"New row added with value " +name,Toast.LENGTH_SHORT).show();
                    }
                else
                    Toast.makeText( context,"Something wrong. Please try again.", Toast.LENGTH_SHORT).show();

            }
        });


        SIPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSourcesOfIncomePage();  }  });

        btn_delete_all_data_si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbOpenHelper.emptyTable();
            }
        });




    }

    private void openSourcesOfIncomePage() {
        Intent intent=new Intent(MainActivity.this, SourceOfIncome.class);
        MainActivity.this.startActivity(intent);
    }


    public String capitalizeFirstLetter(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }
        return original.substring(0, 1).toUpperCase() + original.substring(1);
    }
}
