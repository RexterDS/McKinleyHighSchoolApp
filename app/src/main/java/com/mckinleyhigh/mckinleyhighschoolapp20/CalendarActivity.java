package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


public class CalendarActivity extends AppCompatActivity {


    WebView webViewCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        WebView webViewCalendar = (WebView) findViewById(R.id.CalendarView);
        webViewCalendar.loadUrl("https://calendar.google.com/calendar/b/2/htmlembed?src=mckinleyhs.k12.hi.us_00ugishkav9s0ubl7sqkd8v6ok@group.calendar.google.com&color=%238997A5&src=mckinleyhs.k12.hi.us_ib27of65e6edl3h9le3uutuepo@group.calendar.google.com&color=%23E0C240&src=mckinleyhs.k12.hi.us_58c4o185rupaft778hqa0ulj2s@group.calendar.google.com&color=%23668CD9&ctz=Pacific/Honolulu&showTitle=1&showNav=1&showDate=1&showTabs=1&showCalendars=0&hl=en");


    }
}
