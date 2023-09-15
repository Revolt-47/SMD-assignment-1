package com.daniyal.i201806;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity9 extends AppCompatActivity {

    ImageView back,call,vcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        back = findViewById(R.id.back);
        call = findViewById(R.id.call);
        vcall = findViewById(R.id.vcall);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        vcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity9.this, MainActivity17.class);
                startActivity(intent);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity9.this, MainActivity18.class);
                startActivity(intent);
            }
        });
    }
}