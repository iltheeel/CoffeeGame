package com.example.liaiwei.coffeegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.TextView;

public class page4 extends AppCompatActivity {
    private TextView Water;
    private TextView Coffee;
    private TextView Creamer;
    private TextView Overall;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        Water=(TextView)findViewById(R.id.textView3);
        Coffee=(TextView)findViewById(R.id.textView4);
        Creamer=(TextView)findViewById(R.id.textView5);
        Overall = (TextView)findViewById(R.id.textView6);
        button = (Button)findViewById(R.id.button);

        Bundle extras = getIntent().getExtras();

        int c =0;

        Boolean test = extras.getBoolean("waterRight");
        Toast.makeText(this, test.toString(),
                Toast.LENGTH_SHORT).show();

        if(extras.getBoolean("waterRight")) {
            Water.setText("You got the water amount right!");
            c++;
            Toast.makeText(this, "yay",
                 Toast.LENGTH_SHORT).show();
        } else {
            Water.setText("You got the water amount wrong!");
        }

        if(extras.getBoolean("coffeeRight")) {
            Coffee.setText("You got the coffee amount right!");
            c++;
        } else {
            Coffee.setText("You got the coffee amount wrong!");
        }

        if(extras.getBoolean("creamerRight")){
            Creamer.setText("You got the creamer right!");
            c++;
        } else {
            Creamer.setText("You got the creamer wrong!");
        }

        if(c==3) {
            Overall.setText("You Win!!!! \nYou get a frappe!");
        } else {
            Overall.setText("You lose :( \nYou get a frappy.");
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
