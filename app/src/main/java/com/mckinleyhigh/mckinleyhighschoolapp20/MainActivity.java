package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button switchToBulletin, switchToEvents, switchToLunch, switchToCalendar,
            switchToInfo, switchToAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToBulletin = (Button) findViewById(R.id.bulletin);
        switchToEvents = (Button) findViewById(R.id.events);
        switchToLunch = (Button) findViewById(R.id.lunch);
        switchToCalendar = (Button) findViewById(R.id.calendar);
        switchToInfo = (Button) findViewById(R.id.info);
        switchToAbout = (Button) findViewById(R.id.about);

        switchToBulletin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launchBulletin();
            }
        });

        switchToEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launchEvents();
            }
        });

        switchToLunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launchLunch();
            }
        });

        switchToCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launchCalendar();
            }
        });
        switchToInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launchInfo();
            }
        });
        switchToAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launchAbout();
            }
        });
    }

    private void launchBulletin() {

        Intent intent = new Intent(this, BulletinActivity.class);
        startActivity(intent);
    }
    private void launchEvents() {
        Intent intent = new Intent(this, EventsActivity.class);
        startActivity(intent);
    }
    private void launchLunch() {
        Intent intent = new Intent(this, LunchActivity.class);
        startActivity(intent);
    }
    private void launchCalendar() {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
    private void launchInfo() {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
    private void launchAbout() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

}
