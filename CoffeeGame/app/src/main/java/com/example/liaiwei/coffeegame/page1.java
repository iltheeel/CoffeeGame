package com.example.liaiwei.coffeegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class page1 extends AppCompatActivity {
    private Button choiceOne;
    private Button choiceTwo;
    private Button choiceThree;
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        text = (TextView)  findViewById(R.id.textView2);
        text.setText("How much water?");

        choiceOne = (Button) findViewById(R.id.choiceOne);
        choiceOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity(1);
            }
        });

        choiceTwo = (Button) findViewById(R.id.choiceTwo);
        choiceTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity(2);
            }
        });

        choiceThree = (Button) findViewById(R.id.choiceThree);
        choiceThree.setOnClickListener(new View.OnClickListener(){
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

        //Toast.makeText(this, "water check " + i + " correct is "+ correct,
              //  Toast.LENGTH_SHORT).show();

        if(i == correct){
            guessRight = true;
        }

        Intent intent = new Intent(this, page2.class);
        intent.putExtra("waterAns", guessRight);
        startActivity(intent);
        finish();
    }
}