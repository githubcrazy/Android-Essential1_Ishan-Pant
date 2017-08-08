package com.volansys.listfragdemo;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MyFrag extends Fragment implements AdapterView.OnItemClickListener{
    ListView lv;
    communicator c;

    String items[]={"Cars","Bikes","Scooters"};
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceStack)
    {
        return inflater.inflate(R.layout.frag,container,false);

    }
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        lv=(ListView)getActivity().findViewById(R.id.list);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pos=items[i];
                c=(communicator)getActivity();
                c.respond("You Have Selected:"+pos);

            }
        });


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
