package com.example.shubham00.myguesser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class Main2Activity extends AppCompatActivity {
    public Button yes;
    public   Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        addListenerOnButton();
        addListenerOnButton2();

    }

    public void addListenerOnButton() {

        final Context context = this;

        yes = (Button) findViewById(R.id.button1);

        yes.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main3Activity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton2() {

        final Context context = this;

        no = (Button) findViewById(R.id.button2);

        no.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main5Activity.class);
                startActivity(intent);

            }

        });

    }

}

