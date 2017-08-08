package com.volansys.fragmentcomm;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
interface communicator
{
    public void respond(String data);
}
public class fragmentcommact extends AppCompatActivity implements communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentcommact);


    }

    @Override
    public void respond(String data) {
        FragmentManager manager=getFragmentManager();
        MyFragment1 f1 = (MyFragment1)manager.findFragmentById(R.id.fragment2);
        f1.changeData(data);


    }
}
