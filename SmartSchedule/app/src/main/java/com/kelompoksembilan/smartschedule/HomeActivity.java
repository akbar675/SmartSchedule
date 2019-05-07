package com.kelompoksembilan.smartschedule;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    CardView card1, card2, card3, card4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card1 = (CardView) findViewById(R.id.cardview1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMySchedule();
                Toast.makeText(getApplicationContext(), "Opening My Schedule", Toast.LENGTH_LONG).show();
            }
        });

        card2 = (CardView) findViewById(R.id.cardview2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAddSchedule();
                Toast.makeText(getApplicationContext(), "Opening Add Schedule", Toast.LENGTH_LONG).show();
            }
        });

        card3 = (CardView) findViewById(R.id.cardview3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
                Toast.makeText(getApplicationContext(), "Opening Help", Toast.LENGTH_LONG).show();
            }
        });

        card4 = (CardView) findViewById(R.id.cardview4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutUs();
                Toast.makeText(getApplicationContext(), "Opening About Us", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void openMySchedule() {
        Intent intent1 = new Intent(this, MyScheduleActivity.class);
        startActivity(intent1);
    }
    public void openAddSchedule() {
        Intent intent2 = new Intent(this, AddActivity.class);
        startActivity(intent2);
    }
    public void openHelp() {
        Intent intent3 = new Intent(this, HelpActivity.class);
        startActivity(intent3);
    }
    public void openAboutUs() {
        Intent intent4 = new Intent(this, AboutUsActivity.class);
        startActivity(intent4);
    }
}
