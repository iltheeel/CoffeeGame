package com.example.liaiwei.coffeegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button startb;
    private int

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        startb = (Button) findViewById(R.id.start);
        startb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                launchActivity();
            }
        });
    }

    private void launchActivity() {
        Intent intent = new Intent(this, page1.class);

        int setCoffee = (int) (3 * Math.random());
        int setWater = (int) (3 * Math.random());
        int setCreamer = (int) (3 * Math.random());
        intent.putExtra("setCoffee", setCoffee);
        intent.putExtra("setWater", setWater);
        intent.putExtra("set")

        startActivity(intent);
        finish();
    }
}
