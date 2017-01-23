package com.example.shubham00.myguesser;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
public class Main12Activity extends AppCompatActivity {
    public Button reset;
     int  a,b,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        TextView rest=(TextView)findViewById(R.id.textView13);
        Intent ae=getIntent();
        b=ae.getIntExtra("a",0);
        Intent ai=getIntent();
        a=ai.getIntExtra("b",0);
        r=10*a+b;
       // TextView result=(TextView)findViewById(R.id.textView12);
        rest.setText(Integer.toString(r));
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        final Context context = this;

        reset= (Button) findViewById(R.id.button);

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);

            }

        });

    }
}
