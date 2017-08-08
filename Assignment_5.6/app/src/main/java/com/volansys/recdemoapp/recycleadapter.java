package com.volansys.recdemoapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ishan on 2/8/17.
 */

public class recycleadapter extends RecyclerView.Adapter<recycleadapter.MyViewHolder> {
    private AppCompatActivity activity;
   private LayoutInflater inflater;
    List<information> data= Collections.emptyList();
    public recycleadapter(Context context, List<information> data)
    {
        inflater=LayoutInflater.from(context);
        this.data=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.single_row,parent,false);
        MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        information current=data.get(position);
       holder.title.setText(current.title);
        holder.imgid.setImageResource(current.imgid);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView imgid;

        public MyViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.textView);
            imgid=(ImageView)itemView.findViewById(R.id.imageView2);

        }
    }
}
