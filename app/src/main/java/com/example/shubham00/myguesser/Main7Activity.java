package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main7Activity extends AppCompatActivity {
    public Button yes3;
    public   Button no3;
    public int y;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        addListenerOnButton23();
        addListenerOnButton223();

    }


    public void addListenerOnButton23() {

        final Context context = this;

        yes3= (Button) findViewById(R.id.button12);

        yes3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                y=5;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton223() {

        final Context context = this;

        no3 = (Button) findViewById(R.id.button13);

        no3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

               y=7;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);

            }

        });

    }
}
