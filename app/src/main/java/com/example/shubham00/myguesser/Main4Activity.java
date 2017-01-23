package com.example.shubham00.myguesser;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    public int y;
    public Button yes51;
    public   Button no51;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        addListenerOnButton23013();
        addListenerOnButton223013();

    }


    public void addListenerOnButton23013() {

        final Context context = this;

        yes51= (Button) findViewById(R.id.button6);

        yes51.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Main10Activity.class);
                startActivity(intent);

            }

        });

    }

    public void addListenerOnButton223013() {

        final Context context = this;

        no51= (Button) findViewById(R.id.button5);

        no51.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
               y=4;
                Intent intent = new Intent(context, Main21Activity.class);
                intent.putExtra("a",y);
                startActivity(intent);


            }

        });

    }
}
