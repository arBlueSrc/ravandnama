package com.appnita.ravandnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.appnita.ravandnama.MainActivity.banners;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final TextView image = findViewById(R.id.imageView);
        final ImageView logo = findViewById(R.id.logo);


        new AsyncTaskBanners("http://appnita.ir/ravand/readbanner.php").execute();

        final Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                image.setVisibility(View.VISIBLE);
                image.startAnimation(animation1);
            }
        }, 500);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                logo.setVisibility(View.VISIBLE);
                logo.startAnimation(animation1);
            }
        }, 500);


        int secondsDelayed = 2;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplashActivity.this, Privacy.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }

}
