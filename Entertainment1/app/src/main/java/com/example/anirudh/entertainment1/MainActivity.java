package com.example.anirudh.entertainment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final  Button a=(Button)findViewById(R.id.b1);
        final CheckBox b=(CheckBox) findViewById(R.id.r1) ;
        final   CheckBox c=(CheckBox)findViewById(R.id.r2) ;
        final   CheckBox d=(CheckBox) findViewById(R.id.r3) ;
        final Intent e=new Intent("x1");
        final Intent f=new Intent("x2");
        final  Intent g=new Intent("x3");


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b.isChecked())
                {
                    startActivity(e);
                }
                if(c.isChecked())
                {
                    startActivity(f);
                }
                if(d.isChecked())
                {
                    startActivity(g);
                }
            }
        });
    }
}
