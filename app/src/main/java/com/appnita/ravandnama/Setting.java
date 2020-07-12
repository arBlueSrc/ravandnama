package com.appnita.ravandnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnReg;
    private EditText phonenumber, username;

    ImageView back;

    private SharedPreferences sharedPreferences;

    private RadioButton riazi , tajrobi , ensani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        sharedPreferences = getSharedPreferences("smajor", Context.MODE_PRIVATE);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.radio);
        btnReg = (Button) findViewById(R.id.btnreg);
        riazi = findViewById(R.id.m_riazi);
        tajrobi = findViewById(R.id.m_tajrobi);
        ensani = findViewById(R.id.m_ensani);
        back = findViewById(R.id.back);

        username = findViewById(R.id.username10);
        phonenumber = findViewById(R.id.phone_number);

        String uname = sharedPreferences.getString("name",null);
        String number = sharedPreferences.getString("number", null);

        username.setText(uname);
        phonenumber.setText(number);

        int id = sharedPreferences.getInt("major" , 0);

        switch (id){
            case 0:
                riazi.setChecked(true);
                break;
            case 1:
                tajrobi.setChecked(true);
                break;
            case 2:
                ensani.setChecked(true);
                break;
        }



        btnReg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);

                String selected = radioButton.getText().toString();

                Toast.makeText(Setting.this,
                        radioButton.getText(), Toast.LENGTH_SHORT).show();

                SharedPreferences.Editor editor = sharedPreferences.edit();

                final String usename = username.getText().toString().trim();
                final String phone = phonenumber.getText().toString().trim();

                if(usename.equals(null)){
                    Toast.makeText(Setting.this, "لطفا نام خود را وارد کنید", Toast.LENGTH_SHORT).show();
                }else {
                    switch (selected){
                        case "ریاضی":
                            editor.putInt("major",0);
                            break;
                        case "تجربی":
                            editor.putInt("major",1);
                            break;
                        case "انسانی":
                            editor.putInt("major",2);
                            break;
                    }

                    editor.putString("name",usename);
                    editor.putString("number",phone);
                    editor.commit();

                    startActivity(new Intent(Setting.this, MainActivity.class));
                    finish();
                }

            }

        });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(Setting.this, MainActivity.class));
        finish();
        super.onBackPressed();
    }
}