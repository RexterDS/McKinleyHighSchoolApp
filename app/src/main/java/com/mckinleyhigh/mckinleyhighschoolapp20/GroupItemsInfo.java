package com.mckinleyhigh.mckinleyhighschoolapp20;

import java.util.ArrayList;

public class GroupItemsInfo {

    private String listMonth;
    private ArrayList<ChildItemsInfo> list = new ArrayList<ChildItemsInfo>();

    public String getMonth() {

        return listMonth;
    }

    public void setMonth(String monthName){

        this.listMonth = monthName;
    }

    public ArrayList<ChildItemsInfo> getMonthName(){
        return list;
    }

    public void setMonthName(ArrayList<ChildItemsInfo> nameMonth){

        this.list = nameMonth;
    }



}