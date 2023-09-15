package com.daniyal.i201806;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    LinearLayout image,video;
    ImageView exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        image = findViewById(R.id.image);
        video = findViewById(R.id.video);
        exit = findViewById(R.id.exit);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity12.this, MainActivity5.class);
                startActivity(intent);
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity12.this, MainActivity15.class);
                startActivity(intent);
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MainActivity (go back to the first screen)
                Intent intent = new Intent(MainActivity12.this, MainActivity16.class);
                startActivity(intent);
            }
        });


    }
}