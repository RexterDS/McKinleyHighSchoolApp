package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.annotation.SuppressLint;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.os.AsyncTask;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ScrollView;
import android.widget.Toast;

import java.io.IOException;

import static com.mckinleyhigh.mckinleyhighschoolapp20.R.id.bulletin;
import static org.jsoup.Jsoup.connect;

public class BulletinActivity extends AppCompatActivity {

    WebView bulletinWeb;

    private String url = "https://sites.google.com/a/mckinleyhs.k12.hi.us/home/daily-bulletin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulletin);

        bulletinWeb = (WebView) findViewById(R.id.bulletinWebview);

        bulletinWeb.getSettings().setJavaScriptEnabled(true);

        bulletinWeb.setWebViewClient(new WebViewClient(){

            public void onLoadResource(WebView view, String url){

                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-chrome-header-wrapper')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('sites-header-nav')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-chrome-adminfooter-container')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('sites-adminfooter')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-chrome-horizontal-nav')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-chrome-header-horizontal-nav-container')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-chrome-header')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-chrome-userheader')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('sites-header-primary-row')[0].style.display='none'; })()");


                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-embedded')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-butter-container')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('flip-butter')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('flip-contents')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-contents flip-list-view')[0].style.display='none'; })()");

                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-list-header')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-list-title-header')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-list-last-modified-header')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByClassName('flip-entries')[0].style.display='none'; })()");


                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsClassName('sites-embed-align-left-wrapping-off')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsClassName('sites-embed-border-off sites-embed sites-embed-full-width')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsByName('Daily Bulletin')[0].style.display='none'; })()");


                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsClassName('sites-embed-title')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsClassName('sites-embed-object-title')[0].style.display='none'; })()");
                bulletinWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsClassName('flip-butter-container')[0].style.display='none'; })()");

            }
        });
       bulletinWeb.loadUrl(url);
    }
}