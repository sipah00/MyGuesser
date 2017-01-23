package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    public Button yes1;
    public   Button no1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        addListenerOnButton1();
        addListenerOnButton21();

    }


    public void addListenerOnButton1() {

        final Context context = this;

        yes1 = (Button) findViewById(R.id.button3);

        yes1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main8Activity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton21() {

        final Context context = this;

        no1 = (Button) findViewById(R.id.button4);

        no1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main6Activity.class);
                startActivity(intent);

            }

        });

    }
}
