package com.example.liaiwei.coffeegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class page3 extends AppCompatActivity {
    private Button choiceOne;
    private Button choiceTwo;
    private Button choiceThree;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        text = (TextView)  findViewById(R.id.textView2);
        text.setText("How much creamer?");

        choiceOne = (Button) findViewById(R.id.choiceOne);
        choiceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(1);
            }
        });

        choiceTwo = (Button) findViewById(R.id.choiceTwo);
        choiceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(2);
            }
        });

        choiceThree = (Button) findViewById(R.id.choiceThree);
        choiceThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchActivity(3);
            }
        });
    }

    private void launchActivity(int i) {
        boolean guessRight = false;
        int correct = (int) (Math.random()*3);
        correct++;

        if(i == correct){
            guessRight = true;
        }

        Bundle extras = getIntent().getExtras();
        Boolean waterAns = extras.getBoolean("waterAns");
        Boolean coffeeAns = extras.getBoolean("coffeeAns");

        Intent intent = new Intent(this, page4.class);
        intent.putExtra("creamerAns", guessRight);
        intent.putExtra("coffeeAns", coffeeAns);
        intent.putExtra("waterAns", waterAns);
        startActivity(intent);
        finish();
    }
}
