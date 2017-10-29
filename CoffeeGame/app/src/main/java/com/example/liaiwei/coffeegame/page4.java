package com.example.liaiwei.coffeegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.res.Resources;

public class page4 extends AppCompatActivity {
    private TextView Water;
    private TextView Coffee;
    private TextView Creamer;
    private TextView Overall;
    private Button button;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        Water=(TextView)findViewById(R.id.textView3);
        Coffee=(TextView)findViewById(R.id.textView4);
        Creamer=(TextView)findViewById(R.id.textView5);
        Overall = (TextView)findViewById(R.id.textView6);
        button = (Button)findViewById(R.id.button);
        image = (ImageView) findViewById(R.id.imageView6);

        Bundle extras = getIntent().getExtras();
        int c =0;


        if(extras.getBoolean("waterAns") ) {
            Water.setText("You got the water amount right!");
            c++;
        } else {
            Water.setText("You got the water amount wrong!");
        }

        if(extras.getBoolean("coffeeAns")) {
            Coffee.setText("You got the coffee amount right!");
            c++;
        } else {
            Coffee.setText("You got the coffee amount wrong!");
        }

        if(extras.getBoolean("creamerAns")){
            Creamer.setText("You got the creamer amount right!");
            c++;
        } else {
            Creamer.setText("You got the creamer amount wrong!");
        }

        if(c==3) {
            Overall.setText("You Win!!!! \nYou get a frappe!");
            image.setImageResource(R.drawable.frappeimg);

        } else {
            Overall.setText("You lose :( \nYou get a frappy.");
            image.setImageResource(R.drawable.frappyimg);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });

    }


    private void launchActivity() {

        Intent intent = new Intent(this, home.class);
        startActivity(intent);
        finish();
    }

}
