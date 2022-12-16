package com.example.codex_thecodingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Switch switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = findViewById(R.id.switch1);
        SharedPreferences sharedPreferences = null;

        sharedPreferences = getSharedPreferences("night",0);
        Boolean booleanValue = sharedPreferences.getBoolean("night_mode",true);

        if(booleanValue){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            switch1.setChecked(true);


        }

        SharedPreferences finalSharedPreferences = sharedPreferences;
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    switch1.setChecked(true);
                    SharedPreferences.Editor editor = finalSharedPreferences.edit();
                    editor.putBoolean("night_mode",true);
                    editor.commit();
                }
                else{
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    switch1.setChecked(false);
                    SharedPreferences.Editor editor = finalSharedPreferences.edit();
                    editor.putBoolean("night_mode",false);
                    editor.commit();
                }
            }
        });
    }
    public void webAndroid(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, webAndroid.class);
        startActivity(intent);

    }
    public void web3(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, web3.class);
        startActivity(intent);
    }
    public void blockchain(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, blockchain.class);
        startActivity(intent);
    }
    public void aiml(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, aiml.class);
        startActivity(intent);
    }
    public void dataScience(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, dataScience.class);
        startActivity(intent);
    }

    public void cybersecurity(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, cybersecurity.class);
        startActivity(intent);
    }
    public void uiux(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, uiux.class);
        startActivity(intent);
    }
    public void cloudcomputing(View view){
        Toast.makeText(this, "Best of luck, mate!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, cloudcomputing.class);
        startActivity(intent);
    }


}