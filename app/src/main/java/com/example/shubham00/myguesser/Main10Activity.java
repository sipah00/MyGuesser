package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main10Activity extends AppCompatActivity {
    public Button yes37;
    public   Button no37;
    public int y;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        addListenerOnButton239();
        addListenerOnButton2239();

    }


    public void addListenerOnButton239() {

        final Context context = this;

        yes37= (Button) findViewById(R.id.button15);

        yes37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                y=2;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);


            }

        });

    }

    public void addListenerOnButton2239() {

        final Context context = this;

        no37 = (Button) findViewById(R.id.button16);

        no37.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                y=0;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);


            }

        });

    }
}
