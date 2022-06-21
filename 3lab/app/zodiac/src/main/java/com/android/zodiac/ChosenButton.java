package com.android.zodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ChosenButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen_button);
        String titlezod = getIntent().getExtras().getString("tittletext");
        if (titlezod == ""){
            getSupportActionBar().setTitle("Zodiac");
        }
        else {
            getSupportActionBar().setTitle("Zodiac: " + titlezod);
        }
        getSupportActionBar().setTitle("Zodiac " + titlezod);
        String zodiac = getIntent().getExtras().getString("zodtext");

        TextView ZodiacText = (TextView)findViewById(R.id.Zodiactext);
        ZodiacText.setText(zodiac);
    }
}