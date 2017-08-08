package com.volansys.griddemo;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAct extends AppCompatActivity {
GridView grid;
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        grid=(GridView)findViewById(R.id.grid);

        grid.setAdapter(new gridadapter(this));


    }

    class country
    {
        int imagesid;
        String countries;
        country(int imagesid,String countries)
        {
            this.imagesid=imagesid;
            this.countries=countries;
        }
    }
    class gridadapter extends BaseAdapter{
        ArrayList<country> list;
        Context context;
        gridadapter(Context c)
        {
            context=c;
            list=new ArrayList<country>();
            Resources res=context.getResources();
            String temp[]=res.getStringArray(R.array.countries);
            int images[]={R.drawable.iceland,R.drawable.switzerland};
            for(int i=0;i<2;i++)
            {

                list.add(new country(images[i],temp[i]));
            }

        }
        @Override
        public int getCount()
        {
            return list.size();
        }

        @Override
        public Object getItem(int i)
        {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View convertView, ViewGroup viewGroup) {
            View v=convertView;
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            View row=inflater.inflate(R.layout.single_item,viewGroup,false);
            ImageView myImage=(ImageView)row.findViewById(R.id.imageView);
            TextView myTitle=(TextView)row.findViewById(R.id.textView);
            country c=list.get(i);
            myImage.setImageResource(c.imagesid);
            myTitle.setText(c.countries);

            return row;

        }
    }
}
