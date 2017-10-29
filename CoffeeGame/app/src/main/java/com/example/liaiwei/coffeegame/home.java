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

        startActivity(intent);
        finish();
    }
}
