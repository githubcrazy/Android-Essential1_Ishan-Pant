package com.volansys.fragmentcomm;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyFragment1 extends Fragment {
    TextView txt_frag;
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.frag1,container,false);
    }
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        txt_frag=(TextView)getActivity().findViewById(R.id.txt_frag);

    }
    public void onsaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt();
    }
    public void changeData(String data)
    {
        txt_frag.setText(data);

    }

}
