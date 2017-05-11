package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LunchActivity extends AppCompatActivity{

    WebView lunchWeb;

    private String url = "https://sites.google.com/a/mckinleyhs.k12.hi.us/home/lunch-menu";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        lunchWeb = (WebView) findViewById(R.id.lunchWebView);

        lunchWeb.getSettings().setJavaScriptEnabled(true);

        lunchWeb.setWebViewClient(new WebViewClient(){

           public void onLoadResource(WebView view, String url){

               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-chrome-header-wrapper')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsByClassName('sites-header-nav')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-chrome-adminfooter-container')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsByClassName('sites-adminfooter')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-chrome-horizontal-nav')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-chrome-header-horizontal-nav-container')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-chrome-header')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-chrome-userheader')[0].style.display='none'; })()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsByClassName('sites-header-primary-row')[0].style.display='none'; })()");

               lunchWeb.loadUrl("javascript:(function() { " +
                        "document.getElementsById('sites-page-title-header')[0].style.display='none';})()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-page-title')[0].style.display='none';})()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsByClassName('sites-layout-tile sites-tile-name-content-1';})()");
               lunchWeb.loadUrl("javascript:(function() { " +
                       "document.getElementsById('sites-canvas-main')[0].style.display='none';})()");
             }

        });

        lunchWeb.loadUrl(url);
        lunchWeb.getSettings().setLoadWithOverviewMode(true);
        lunchWeb.getSettings().setUseWideViewPort(true);
        lunchWeb.getSettings().setBuiltInZoomControls(true);
    }
}

