package com.appnita.ravandnama;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class LoginPage extends AppCompatActivity {

    EditText number,name;
    Button register;
    public static String  data="";

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        number = findViewById(R.id.edt_reg);
        name = findViewById(R.id.edt_name);
        register = findViewById(R.id.btn_reg);

        sharedPreferences = getSharedPreferences("smajor", Context.MODE_PRIVATE);

        String phonenumber = sharedPreferences.getString("number","0");

        if(!phonenumber.equals("0"))
        {
            startActivity(new Intent(LoginPage.this,MainActivity.class));
            finish();
        }

            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phone = number.getText().toString().trim();
                    String esm = name.getText().toString().trim();

                    SharedPreferences.Editor editor = sharedPreferences.edit();

                    if(phone.length()!= 11){
                        Toast.makeText(LoginPage.this, "شماره تلفن خود را درست وارد کنید!", Toast.LENGTH_SHORT).show();

                    }else{

                        editor.putString("number", phone);
                        editor.putString("name", esm);
                        editor.commit();

                        new AsyncTaskInsertUser("http://appnita.ir/ravand/insertuser.php", phone, esm).execute();

                        final ProgressDialog dialog = new ProgressDialog(LoginPage.this);
                        dialog.setMessage("لطفا منتظر بمانید...");
                        dialog.show();

                        final Timer timer = new Timer();

                        timer.scheduleAtFixedRate(new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (!data.equals("")) {

                                            dialog.cancel();

                                            if (data.equals("not ok")) {
                                                Toast.makeText(LoginPage.this, "متاسفانه ارتباط با سرور برقرار نشد", Toast.LENGTH_SHORT).show();
                                                timer.cancel();

                                            }else if(data.equals("exist")){
                                                Toast.makeText(LoginPage.this,"این شماره قبلا ثبت نام شده است",Toast.LENGTH_SHORT).show();
                                                Intent intent = new Intent(LoginPage.this, Setting.class);
                                                startActivity(intent);
                                                timer.cancel();
                                                finish();

                                            }else {
                                                Toast.makeText(LoginPage.this,"ثبت نام با موفقیت انجام شد",Toast.LENGTH_SHORT).show();
                                                Intent intent = new Intent(LoginPage.this, Setting.class);
                                                startActivity(intent);
                                                timer.cancel();
                                                finish();
                                            }

                                        }
                                    }

                                });
                            }

                        }, 1, 1000);
                    }
                }
            });

    }
}
