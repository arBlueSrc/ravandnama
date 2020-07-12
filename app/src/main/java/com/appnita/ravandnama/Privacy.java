package com.appnita.ravandnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class Privacy extends AppCompatActivity {

    CheckBox checkBox;
    Button button;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);

        checkBox = findViewById(R.id.checkbox1);
        button = findViewById(R.id.button_next);

        sharedPreferences = getSharedPreferences("smajor", Context.MODE_PRIVATE);

        String phonenumber = sharedPreferences.getString("number","0");

        if(!phonenumber.equals("0"))
        {
            startActivity(new Intent(Privacy.this,MainActivity.class));
            finish();
        }


        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(checkBox.isChecked()){
                    button.setVisibility(View.VISIBLE);
                }else{
                    button.setVisibility(View.INVISIBLE);
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Privacy.this,LoginPage.class));
            }
        });
    }
}