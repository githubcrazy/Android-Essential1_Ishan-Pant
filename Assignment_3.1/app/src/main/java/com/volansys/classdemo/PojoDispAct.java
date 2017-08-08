package com.volansys.classdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PojoDispAct extends AppCompatActivity {
TextView text_name;
    TextView text_age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pojo_disp);
        text_name=(TextView)findViewById(R.id.text_name);
        text_age=(TextView)findViewById(R.id.text_age);
        Intent intent2=getIntent();
        String ename=intent2.getStringExtra("ename");
        String eage=intent2.getStringExtra("eage");
        text_name.setText(ename);
        text_age.setText(eage);
    }
}
