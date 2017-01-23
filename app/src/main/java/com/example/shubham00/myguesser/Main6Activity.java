package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main6Activity extends AppCompatActivity {

    public Button yes4;
    public   Button no4;
    public int y;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        addListenerOnButton230();
        addListenerOnButton2230();

    }


    public void addListenerOnButton230() {

        final Context context = this;

        yes4= (Button) findViewById(R.id.button9);

        yes4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                y=9;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton2230() {

        final Context context = this;

        no4 = (Button) findViewById(R.id.button10);

        no4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                y=1;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }
}

