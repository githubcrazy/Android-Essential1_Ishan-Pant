package com.volansys.fragmanagerapp;

//import android.support.v4.app.FragmentManager;
import android.app.Fragment;
import android.app.*;
//import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R.*;


public class FragManagerAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_manager);
        MyFragment frag=new MyFragment();
        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();

        transaction.add(R.id.txt_relate,frag,"vivzfragment");
        transaction.commit();


    }
}
