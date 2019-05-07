package com.kelompoksembilan.smartschedule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_schedule);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
