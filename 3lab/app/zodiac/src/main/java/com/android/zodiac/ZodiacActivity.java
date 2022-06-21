package com.android.zodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZodiacActivity extends AppCompatActivity {

    private Button gotozodiaclist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);
        AddListenerOnButton();
    }

    public void AddListenerOnButton (){
        gotozodiaclist = (Button)findViewById(R.id.gotozodiaclist);

        gotozodiaclist.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ZodiacList");
                        startActivity(intent);
                    }
                }
        );
    }
}