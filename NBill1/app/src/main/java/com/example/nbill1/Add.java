package com.example.nbill1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static com.example.nbill1.R.layout.activity_add;

public class Add extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_add);


        Spinner income_spent_spinner= findViewById(R.id.income_spent_spinner);
        ArrayAdapter<String> income_spent_adaptor= new ArrayAdapter<>(
                Add.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.incomeSPENT));
         income_spent_adaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         income_spent_spinner.setAdapter(income_spent_adaptor);


    }
}
