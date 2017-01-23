package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {


    public Button yes5;
    public   Button no5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        addListenerOnButton2301();
        addListenerOnButton22301();

    }


    public void addListenerOnButton2301() {

        final Context context = this;

        yes5= (Button) findViewById(R.id.button8);

        yes5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main4Activity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton22301() {

        final Context context = this;

        no5= (Button) findViewById(R.id.button7);

        no5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main9Activity.class);
                startActivity(intent);

            }

        });

    }
}


