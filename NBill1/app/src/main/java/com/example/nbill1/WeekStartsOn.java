package com.example.nbill1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.Calendar;

public class WeekStartsOn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_starts_on);


        //Buttons
        Button monday = (Button) findViewById(R.id.monday);
        Button tuesday = (Button) findViewById(R.id.tuesday);
        Button wednesday = (Button) findViewById(R.id.wednesday);
        Button thursday = (Button) findViewById(R.id.thursday);
        Button friday = (Button) findViewById(R.id.friday);
        Button saturday = (Button) findViewById(R.id.saturday);
        Button sunday = (Button) findViewById(R.id.sunday);


        //Listeners for butons

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.MONDAY);
                Context context =WeekStartsOn.this ;
                Toast.makeText(context,"MONDAY is first day of the week!" ,Toast.LENGTH_SHORT).show();}  }) ;

        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.TUESDAY);
                    Context context =WeekStartsOn.this ;
                    Toast.makeText(context,"TUESDAY is first day of the week!" ,Toast.LENGTH_SHORT).show();}  });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.WEDNESDAY);
                    Context context =WeekStartsOn.this ;
                    Toast.makeText(context,"WEDNESDAY is first day of the week!" ,Toast.LENGTH_SHORT).show();     }     });

        thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.THURSDAY);
                Context context =WeekStartsOn.this ;
                Toast.makeText(context,"THURSDAY is first day of the week!" ,Toast.LENGTH_SHORT).show(); } });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.FRIDAY);
                Context context =WeekStartsOn.this ;
                Toast.makeText(context,"FRIDAY is first day of the week!" ,Toast.LENGTH_SHORT).show();

            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.SATURDAY);
                Context context =WeekStartsOn.this ;
                Toast.makeText(context,"SATURDAY is first day of the week!" ,Toast.LENGTH_SHORT).show();

            }
        });
        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.myCalendarView.setFirstDayOfWeek(Calendar.SUNDAY);
                Context context =WeekStartsOn.this ;
                Toast.makeText(context,"SUNDAY is first day of the week!" ,Toast.LENGTH_SHORT).show();

            }
        });




        //Functions for opening the activity pages accessible from SettingsPage



    }

}
