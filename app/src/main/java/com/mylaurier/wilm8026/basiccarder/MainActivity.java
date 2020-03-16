package com.mylaurier.wilm8026.basiccarder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int Count = 0;
    static int cardsOut = 0;
    static int decks = 6;
    @SuppressWarnings("RedundantCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView count = (TextView) findViewById(R.id.count);
        final TextView real = (TextView) findViewById(R.id.real);

        Button low = (Button) findViewById(R.id.low);
        Button zero = (Button) findViewById(R.id.zero);
        Button high = (Button) findViewById(R.id.high);

        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count+=1;
                cardsOut+=1;
                updateCount(count,real);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cardsOut+=1;
                updateCount(count,real);
            }
        });

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Count-=1;
                cardsOut+=1;
                updateCount(count,real);
            }
        });


    }
    public void updateCount(TextView count, TextView real){
        if(cardsOut%52==0){
            decks-=1;
        }
        String foo = "count is "+Count;
        String bar = "Real: "+Count/decks;
        count.setText(foo);
        real.setText(bar);
    }

}


