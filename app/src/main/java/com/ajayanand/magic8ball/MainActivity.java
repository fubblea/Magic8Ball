package com.ajayanand.magic8ball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button decide_button;
        decide_button = (Button) findViewById(R.id.decide_button);

        final ImageView answer = (ImageView) findViewById(R.id.answer);

        final int[] answer_array = {

            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
        };

        decide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomnumbergenerator = new Random();

                int number = randomnumbergenerator.nextInt(5);
                answer.setImageResource(answer_array[number]);

            }
        });

    }
}
