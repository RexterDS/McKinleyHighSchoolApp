package com.mckinleyhigh.mckinleyhighschoolapp20;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SimpleExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//import static com.mckinleyhigh.mckinleyhighschoolapp20.R.drawable.februarybreakfastmenu;
import static com.mckinleyhigh.mckinleyhighschoolapp20.R.id.childItem;

public class LunchActivity extends AppCompatActivity{


    private LinkedHashMap<String, GroupItemsInfo> songsList = new LinkedHashMap<String, GroupItemsInfo>();
    private ArrayList<GroupItemsInfo> deptList = new ArrayList<GroupItemsInfo>();

    private MyExpandableListAdapter myExpandableListAdapter;
    private ExpandableListView simpleExpandableListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        loadData();

        //get reference of the ExpandableListView
        simpleExpandableListView = (ExpandableListView) findViewById(R.id.expandList);
        // create the adapter by passing your ArrayList data
        myExpandableListAdapter = new MyExpandableListAdapter(LunchActivity.this, deptList);
        // attach the adapter to the expandable list view
        simpleExpandableListView.setAdapter(myExpandableListAdapter);

        // setOnChildClickListener listener for child row click or song name click
        simpleExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                //get the group header
                GroupItemsInfo headerInfo = deptList.get(groupPosition);
                //get the child info
                ChildItemsInfo detailInfo = headerInfo.getMonthName().get(childPosition);
                //display it or do something with it
                return false;
            }
        });
        // setOnGroupClickListener listener for group Song List click
        simpleExpandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                //get the group header
                GroupItemsInfo headerInfo = deptList.get(groupPosition);
                //display it or do something with it

                return false;
            }
        });

    }

    // load some initial data into out list
    private void loadData() {

        Drawable fLunch, fBreak, mLunch, mBreak;

        fBreak = getResources().getDrawable(R.drawable.februarybreakfastmenu);
        fLunch = getResources().getDrawable(R.drawable.februarylunchmenu);

        mBreak = getResources().getDrawable(R.drawable.marchbreakfastmenu);
        mLunch = getResources().getDrawable(R.drawable.marchlunchmenu);


        addProduct("February", fBreak);
        addProduct("February", fLunch);

        addProduct("March", mBreak);
        addProduct("March", mLunch);
    }

    private int addProduct(String getMontName, Drawable menu) {

        int groupPosition = 0;

        //check the hashmap if the group already exists
        GroupItemsInfo headerInfo = songsList.get(getMontName);
        //add the group if doesn't exists
        if (headerInfo == null) {
            headerInfo = new GroupItemsInfo();
            headerInfo.setMonth(getMontName);
            songsList.put(getMontName, headerInfo);
            deptList.add(headerInfo);
        }

        // get the children for the group
        ArrayList<ChildItemsInfo> productList = headerInfo.getMonthName();
        // size of the children list
        int listSize = productList.size();
        // add to the counter
        listSize++;

        // create a new child and add that to the group
        ChildItemsInfo detailInfo = new ChildItemsInfo();
        detailInfo.setMenu(menu);
        productList.add(detailInfo);
        headerInfo.setMonthName(productList);

        // find the group position inside the list
        groupPosition = deptList.indexOf(headerInfo);
        return groupPosition;
    }
}

