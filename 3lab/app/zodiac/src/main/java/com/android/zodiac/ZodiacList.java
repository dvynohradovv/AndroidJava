package com.android.zodiac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZodiacList extends AppCompatActivity {

    private Button Scorpio;
    private Button Cancer;
    private Button leo;
    private Button Virgo;
    private Button Libra;
    private Button Sagittarius;
    private Button Capricorn;
    private Button Aquarius;
    private Button Pisces;
    private Button check;
    private Button info_button;
    private Button love_button;
    private Button handlines_button;
    private Button fulltest_button;
    private Button zodcomp_button;
    private Button namcomp_button;
    private Button datcomp_button;
    private Button lovcomp_button;

    String zodtext;
    String tittletext;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_list);
        AddListenerOnButton();
    }

    public void AddListenerOnButton (){
        Scorpio = (Button)findViewById(R.id.Scorpio);
        Cancer = (Button)findViewById(R.id.Cancer);
        leo = (Button)findViewById(R.id.leo);
        Virgo = (Button)findViewById(R.id.Virgo);
        Libra = (Button)findViewById(R.id.Libra);
        Sagittarius = (Button)findViewById(R.id.Sagittarius);
        Capricorn = (Button)findViewById(R.id.Capricorn);
        Aquarius = (Button)findViewById(R.id.Aquarius);
        Pisces = (Button)findViewById(R.id.Pisces);
        check = (Button)findViewById(R.id.check);
        info_button = (Button)findViewById(R.id.info_button);
        love_button = (Button)findViewById(R.id.love_button);
        handlines_button = (Button)findViewById(R.id.handlines_button);
        fulltest_button = (Button)findViewById(R.id.fulltest_button);
        zodcomp_button = (Button)findViewById(R.id.zodcomp_button);
        namcomp_button = (Button)findViewById(R.id.namcomp_button);
        datcomp_button = (Button)findViewById(R.id.datcomp_button);
        lovcomp_button = (Button)findViewById(R.id.lovcomp_button);

        Scorpio.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FFD700"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Scorpio.getText().toString();
                        tittletext = "Scorpio";
                    }
                }
        );

        Pisces.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FFD700"));
                        zodtext = Pisces.getText().toString();
                        tittletext = "Pisces";
                    }
                }
        );

        Aquarius.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FFD700"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Aquarius.getText().toString();
                        tittletext = "Aquarius";
                    }
                }
        );

        Capricorn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FFD700"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Capricorn.getText().toString();
                        tittletext = "Capricorn";
                    }
                }
        );

        Sagittarius.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FFD700"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Sagittarius.getText().toString();
                        tittletext = "Sagittarius";
                    }
                }
        );

        Libra.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FFD700"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Libra.getText().toString();
                        tittletext = "Libra";
                    }
                }
        );

        Virgo.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FFD700"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Virgo.getText().toString();
                        tittletext = "Virgo";
                    }
                }
        );

        leo.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FF000000"));
                        leo.setTextColor(Color.parseColor("#FFD700"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = leo.getText().toString();
                        tittletext = "Leo";
                    }
                }
        );

        Cancer.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Scorpio.setTextColor(Color.parseColor("#FF000000"));
                        Cancer.setTextColor(Color.parseColor("#FFD700"));
                        leo.setTextColor(Color.parseColor("#FF000000"));
                        Virgo.setTextColor(Color.parseColor("#FF000000"));
                        Libra.setTextColor(Color.parseColor("#FF000000"));
                        Sagittarius.setTextColor(Color.parseColor("#FF000000"));
                        Capricorn.setTextColor(Color.parseColor("#FF000000"));
                        Aquarius.setTextColor(Color.parseColor("#FF000000"));
                        Pisces.setTextColor(Color.parseColor("#FF000000"));
                        zodtext = Cancer.getText().toString();
                        tittletext = "Cancer";
                    }
                }
        );

        check.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", zodtext);
                        intent.putExtra("tittletext", tittletext);
                        startActivity(intent);
                    }
                }
        );

        info_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", info_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        love_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", love_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        handlines_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", handlines_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        fulltest_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", fulltest_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        zodcomp_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", zodcomp_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        namcomp_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", namcomp_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        datcomp_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", datcomp_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );

        lovcomp_button.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Intent intent = new Intent("com.android.zodiac.ChosenButton");
                        intent.putExtra("zodtext", lovcomp_button.getText().toString());
                        intent.putExtra("tittletext", "");
                        startActivity(intent);
                    }
                }
        );
    }
}