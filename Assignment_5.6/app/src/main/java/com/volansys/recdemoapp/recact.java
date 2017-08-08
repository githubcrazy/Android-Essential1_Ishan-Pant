package com.volansys.recdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import static com.volansys.recdemoapp.recadapter.getData;

public class recact extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_recadapter);
        recyclerView=(RecyclerView)findViewById(R.id.recycler);

       // recadapter r = (recadapter)
           //     getSupportFragmentManager().findFragmentById(R.layout.fragment_recadapter);
        //drawerFragment.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_Layout), toolbar);
    }
    }

