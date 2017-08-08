package com.volansys.classdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
class person implements Serializable
        {
            private static final long serialVersionUID = 1L;

            private String name;
            private int age;
            public String getname()
            {
                return name;
            }
            public void setname(String name)
            {
                this.name=name;
            }
            public int getAge()
            {
                return age;
            }
            public void setAge(int age)
            {
                this.age=age;
            }
            public String toString()
            {
                return name;
            }
            public int age()
            {
                return age;
            }

        }
public class PojoAct extends AppCompatActivity {
TextView txt_name, txt_age;
    EditText et_name,et_age;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pojo);
        txt_name=(TextView)findViewById(R.id.txt_name);
        txt_age=(TextView)findViewById(R.id.txt_age);
        et_name=(EditText)findViewById(R.id.et_name);
        et_age=(EditText)findViewById(R.id.et_age);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ename=((EditText)findViewById(R.id.et_name)).getText().toString();
                String eage=((EditText)findViewById(R.id.et_age)).getText().toString();
                Intent intent=new Intent(PojoAct.this,PojoDispAct.class);
                intent.putExtra("ename",ename);
                intent.putExtra("eage",eage);
                startActivity(intent);
            }
        });
    }
}
