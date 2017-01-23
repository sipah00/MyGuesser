package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main8Activity extends AppCompatActivity {

    public Button yes2;
    public   Button no2;
    public int y;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        addListenerOnButton2();
        addListenerOnButton22();

    }


    public void addListenerOnButton2() {

        final Context context = this;

        yes2 = (Button) findViewById(R.id.button13);

        yes2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
             y=3;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton22() {

        final Context context = this;

        no2 = (Button) findViewById(R.id.button14);

        no2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main7Activity.class);
                startActivity(intent);

            }

        });

    }
}
