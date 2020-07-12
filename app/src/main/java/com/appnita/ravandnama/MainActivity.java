package com.appnita.ravandnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.appnita.ravandnama.dahom.DahLesson;
import com.appnita.ravandnama.davazdahom.DavazLessons;
import com.appnita.ravandnama.davazdahom.DavazdahomList;
import com.appnita.ravandnama.yazdahom.YazLessons;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {

    LinearLayout dahom, yazdahom ,davazdahom;

    ImageView aboutUs,setting;

    ArrayList<String> urlpics;

    public static String banners="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dahom = findViewById(R.id.dahombtn);
        yazdahom = findViewById(R.id.yazdahombtn);
        davazdahom = findViewById(R.id.davazdahombtn);

        aboutUs = findViewById(R.id.about_us);
        setting = findViewById(R.id.setting);

        dahom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, DahLesson.class), 1);
            }
        });

        yazdahom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, YazLessons.class), 1);
            }
        });

        davazdahom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, DavazLessons.class),1);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this, AboutUs.class), 1);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainActivity.this , Setting.class),1);
            }
        });

        // --------- slider ----------- //

        SliderLayout sliderShow = (SliderLayout) findViewById(R.id.slider);
        urlpics = new ArrayList<>();

        new AsyncTaskBanners("http://appnita.ir/ravand/readbanner.php").execute();

        try {
            JSONArray jsonArray=new JSONArray(banners);
            for(int i=0;i<jsonArray.length();i++){

                JSONObject object=jsonArray.getJSONObject(i);

                String pic=object.getString("pic");
                String picUrl="https://www.appnita.ir/banner/"+pic;
                urlpics.add(picUrl);

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }


        for (int i = 0; i < urlpics.size(); i++) {
            TextSliderView textSliderView = new TextSliderView(this);
            textSliderView.image(urlpics.get(i))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());

            sliderShow.addSlider(textSliderView);

        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        Toast.makeText(this, slider.getBundle().get("extra") + "", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

}
