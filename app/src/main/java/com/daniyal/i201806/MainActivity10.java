package com.daniyal.i201806;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity10 extends AppCompatActivity {

    LinearLayout search,chat,profile,home,card;
    ImageView add,edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        search = findViewById(R.id.search);
        chat = findViewById(R.id.chat);
        profile = findViewById(R.id.profile);
        add = findViewById(R.id.add);
        home = findViewById(R.id.home);
        edit = findViewById(R.id.edit);
        card = findViewById(R.id.card);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity10.class);
                startActivity(intent);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity8.class);
                startActivity(intent);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity12.class);
                startActivity(intent);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity13.class);
                startActivity(intent);
            }
        });

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity10.this, MainActivity11.class);
                startActivity(intent);
            }
        });
    }
}