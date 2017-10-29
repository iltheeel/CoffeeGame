package com.example.liaiwei.coffeegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity {
    private Button startb;

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
//sets random number of coffee/water/creamer
        Integer setCoffee = (int) (3 * Math.random()) +1;
        int setWater = (int) (3 * Math.random())+1;
        int setCreamer = (int) (3 * Math.random())+1;
        Toast.makeText(this, setCoffee.toString(),
                Toast.LENGTH_SHORT).show();
        intent.putExtra("setCoffee", setCoffee);
        intent.putExtra("setWater", setWater);
        intent.putExtra("setCreamer", setCreamer);

        startActivity(intent);
        finish();
    }
}
