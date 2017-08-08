package com.volansys.listactivitydemo;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listactapp extends ListActivity{
ListView listView;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listactapp);
        listView=getListView();
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,days);
        listView.setAdapter(adapter);
    }
}
