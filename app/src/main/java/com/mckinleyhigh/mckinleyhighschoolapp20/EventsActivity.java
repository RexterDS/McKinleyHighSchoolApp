package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    public static ArrayList<String> nameOfEvent;
    public static ArrayList<String> startDate;
    public static ArrayList<String> endDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);



    }
}
