package com.example.nbill1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        //Buttons
        Button weekStartsOn=(Button)findViewById(R.id.week_starts_on_btn);

        //Listeners for butons
        weekStartsOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWeekStartsOnActivity();  }  });

    }

    //Functions for opening the activity pages accessible from SettingsPage
    private void openWeekStartsOnActivity() {
        Intent intent;
        intent = new Intent(SettingsPage.this, WeekStartsOn.class);
        SettingsPage.this.startActivity(intent);
    }



}
