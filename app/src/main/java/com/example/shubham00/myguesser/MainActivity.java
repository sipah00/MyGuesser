package com.example.shubham00.myguesser;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button but;

    public void init() {
        but = (Button) findViewById(R.id.button0);
        but.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (v.getId() == R.id.button0) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);

                }
            }

        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }


}
