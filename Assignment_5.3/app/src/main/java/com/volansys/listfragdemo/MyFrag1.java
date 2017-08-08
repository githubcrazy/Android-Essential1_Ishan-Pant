package com.volansys.listfragdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFrag1 extends Fragment {
    TextView txt;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
        {
            return inflater.inflate(R.layout.frag1,container,false);

    }
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        txt=(TextView)getActivity().findViewById(R.id.txt);

    }
    public void changeText(String data)
    {
        txt.setText(data);
    }

}
