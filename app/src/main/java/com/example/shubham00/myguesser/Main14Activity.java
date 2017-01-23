package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main14Activity extends AppCompatActivity {

    public int x,a;
    public Button yes;
    public   Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        Intent ai=getIntent();
        a=ai.getIntExtra("a",0);
        addListenerOnButton();
        addListenerOnButton2();

    }

    public void addListenerOnButton() {

        final Context context = this;

        yes = (Button) findViewById(R.id.button03);

        yes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                x=3;
                Intent intent = new Intent(context, Main12Activity.class);
                intent.putExtra("a",a);
                intent.putExtra("b",x);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton2() {

        final Context context = this;

        no = (Button) findViewById(R.id.button04);

        no.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Main16Activity.class);
                intent.putExtra("a",a);
                startActivity(intent);

            }

        });

    }

}

