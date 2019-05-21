package com.example.bill;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;



public class MainActivity extends AppCompatActivity {
    DatabaseHelper myDB;
    private TextView mTextMessage;
    Calendar calendar;
    CalendarView mCalendarView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDB=new DatabaseHelper(this);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);






        mCalendarView=(findViewById(R.id.calendarView));

        //Set the current date
        long selectedDate=mCalendarView.getDate();
        mCalendarView.setDate(selectedDate);

        //week of the year
        mCalendarView.setShowWeekNumber(true);

        //The week starts on monday
        mCalendarView.setFirstDayOfWeek(Calendar.MONDAY);


    }

    }


