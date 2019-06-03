package com.example.nbill1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CalendarView myCalendarView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        //Set the current date
//        long selectedDate=myCalendarView.getDate();
//        myCalendarView.setDate(selectedDate);






        //Buttons
        Button add_button= findViewById(R.id.add_button);
        Button income_vs_spent_chart= findViewById(R.id.income_spent_chart_button);
        Button tags_chart= findViewById(R.id.tags_chart_button);
        Button tags_page= findViewById(R.id.tags_button);
        Button ocr= findViewById(R.id.ocr_scan);
        Button settings= findViewById(R.id.settings);
        //Calendar
        myCalendarView=(findViewById(R.id.calendarView));

        //Listeners for buutons
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
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsPageActivity();
            }
        });


    }
    //Functions for opening the activity pages accesible from mainPage
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

    public  void openSettingsPageActivity(){
        Intent intent=new Intent(MainActivity.this, SettingsPage.class);
        MainActivity.this.startActivity(intent);}

}
