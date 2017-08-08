package com.volansys.fragmentcomm;

import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.Fragment;

public class MyFragment extends Fragment implements View.OnClickListener{
    communicator comm;
    Button button;
    int count=0;
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null)
        {
            count=0;
        }
        else
        {
           count=savedInstanceState.getInt("count",0);
        }
    }
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.frag,container,false);
    }

    public void onActivityCreated(Bundle savedInstanceState)
    {

        super.onActivityCreated(savedInstanceState);
        comm=(communicator)getActivity();
        button=(Button)getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }
   public void onSaveInstanceState(Bundle outState){
       super.onSaveInstanceState(outState);
       outState.putInt("count",count);
   }

    @Override
    public void onClick(View view) {
        count++;
        comm.respond("The Button Is Pressed" + count + "times");

    }
}
