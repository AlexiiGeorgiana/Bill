package com.example.nbill1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Butoanele
        Button add_button=(Button)  findViewById(R.id.add_button);
        final Button income_vs_spent_chart=(Button)findViewById(R.id.income_spent_chart_button) ;
        Button tags_chart=(Button)findViewById(R.id.tags_chart_button);
        Button tags_page=(Button)findViewById(R.id.tags_button);
        Button ocr=(Button)findViewById(R.id.ocr_scan);


        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddActivity();  }  });

        income_vs_spent_chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIncomeSpentActivity();  }});

        tags_chart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTagsChartActivity();
            }
        });

        tags_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTagsPageActivity();
            }
        });


    }

    private void openTagsPageActivity() {
        Intent intent=new Intent(MainActivity.this, TagsPage.class);
        MainActivity.this.startActivity(intent);
    }

    private void openTagsChartActivity() {
        Intent intent=new Intent(MainActivity.this, TagsChartPage.class);
        MainActivity.this.startActivity(intent);
    }


    public  void openAddActivity(){
        Intent intent=new Intent(MainActivity.this, Add.class);
        MainActivity.this.startActivity(intent);}


    public  void openIncomeSpentActivity(){
        Intent intent=new Intent(MainActivity.this, IncomeSpentPage.class);
        MainActivity.this.startActivity(intent);}

}
