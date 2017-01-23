package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity {

    public Button yes40;
    public   Button no40;
    public  int y;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        addListenerOnButton2305();
        addListenerOnButton22305();

    }


    public void addListenerOnButton2305() {

        final Context context = this;

        yes40= (Button) findViewById(R.id.button14);

        yes40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                y=8;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton22305() {

        final Context context = this;

        no40 = (Button) findViewById(R.id.button15);

        no40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                y=6;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }
}


