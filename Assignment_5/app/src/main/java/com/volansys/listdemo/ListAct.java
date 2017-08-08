package com.volansys.listdemo;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListAct extends AppCompatActivity {
String[] titles;
    String[] descriptions;
    int[] images={R.drawable.afghanistan,R.drawable.bhutan,R.drawable.brazil,R.drawable.canada,R.drawable.denmark,R.drawable.iceland,R.drawable.india,R.drawable.japan,R.drawable.mongolia,R.drawable.nigeria,R.drawable.russia,R.drawable.southkorea,R.drawable.spain,R.drawable.sweden,R.drawable.switzerland,R.drawable.syria};
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Resources res=getResources();
        titles=res.getStringArray(R.array.titles);
        descriptions=res.getStringArray(R.array.descriptions);
        list=(ListView)findViewById(R.id.list);
        LiistAdapter adapter=new LiistAdapter(this,titles,descriptions,images);
        list.setAdapter(adapter);
    }

}
class LiistAdapter extends ArrayAdapter{
    Context context;
    int[] images;
    String[] titles;
    String[] descriptions;
    public LiistAdapter(Context context, String[] titles,String[] descriptions, int images[])
    {
        super(context,R.layout.simple_layout,R.id.textView2,titles);
        this.context=context;
        this.images=images;
        this.titles=titles;
        this.descriptions=descriptions;


    }
    public View getView(int position,View convertView,ViewGroup parent)
    {
        View row=convertView;
       if(row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.simple_layout, parent, false);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
        ImageView myimage=(ImageView)row.findViewById(R.id.imageView2);
        TextView mytitle=(TextView)row.findViewById(R.id.textView2);
        TextView mydescription=(TextView)row.findViewById(R.id.textView3);
        myimage.setImageResource(images[position]);
        mytitle.setText(titles[position]);
        mydescription.setText(descriptions[position]);
        return row;

    }
}
