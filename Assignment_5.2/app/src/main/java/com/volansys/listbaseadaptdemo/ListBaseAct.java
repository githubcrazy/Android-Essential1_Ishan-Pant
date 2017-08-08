package com.volansys.listbaseadaptdemo;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListBaseAct extends AppCompatActivity {
ListView list;
    String[] titles;
    String[] descriptions;
    int[] images={R.drawable.afghanistan,R.drawable.bhutan,R.drawable.brazil,R.drawable.canada,R.drawable.denmark,R.drawable.iceland,R.drawable.india,R.drawable.japan,R.drawable.mongolia,R.drawable.nigeria,R.drawable.russia,R.drawable.southkorea,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_base);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(new LiistAdapter(this));

    }
}
class country
{
    String title;
    String description;
    int image;
    country(String title,String description,int image)
    {
        this.title=title;
        this.description=description;
        this.image=image;
    }
}
 class LiistAdapter extends BaseAdapter
{
    ArrayList<country> list;
    Context context;
    LiistAdapter(Context c)
    {
        context=c;
        list=new ArrayList<country>();
        Resources res=c.getResources();
        String[] titles=res.getStringArray(R.array.titles);
        String[] descriptions=res.getStringArray(R.array.descriptions);
        int[] images={R.drawable.afghanistan,R.drawable.bhutan,R.drawable.brazil,R.drawable.canada,R.drawable.denmark,R.drawable.iceland,R.drawable.india,R.drawable.japan,R.drawable.mongolia,R.drawable.nigeria,R.drawable.russia,R.drawable.southkorea,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria};
        for(int i=0;i<16;i++)
        {
            list.add(new country(titles[i],descriptions[i],images[i]));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }





    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row=inflater.inflate(R.layout.single_row,viewGroup,false);
        ImageView myImage=(ImageView)row.findViewById(R.id.imageView);
        TextView myTitle=(TextView)row.findViewById(R.id.textView);
        TextView myDescription=(TextView)row.findViewById(R.id.textView2);
        country c=list.get(i);
        myImage.setImageResource(c.image);
        myTitle.setText(c.title);
        myDescription.setText(c.description);
        return row;
    }
}
