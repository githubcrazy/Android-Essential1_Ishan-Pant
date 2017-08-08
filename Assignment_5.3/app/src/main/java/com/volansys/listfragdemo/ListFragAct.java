package com.volansys.listfragdemo;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


interface communicator
{
    public void respond(String data);
}

public class ListFragAct extends AppCompatActivity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_frag);

    }

    @Override
    public void respond(String data) {
        FragmentManager manager=getFragmentManager();
        MyFrag1 f1=(MyFrag1)manager.findFragmentById(R.id.fragment2);
        f1.changeText(data);
    }
}
