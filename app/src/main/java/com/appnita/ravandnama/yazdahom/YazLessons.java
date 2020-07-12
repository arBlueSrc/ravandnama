package com.appnita.ravandnama.yazdahom;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar;
import com.appnita.ravandnama.DataBaseCheck;
import com.appnita.ravandnama.R;


public class YazLessons extends AppCompatActivity {

    LinearLayout farsi,arabi,dini,zaban,
            hesab,hendese,amar,fizik,shimi,
            riazit,zist
            ,dinie,fonon,riazie,tari,jame,jogh,ravan,fals;
    RoundCornerProgressBar progress11, progress12, progress13
                            ,progress21, progress22, progress23
                            ,progress31, progress32, progress33
                            ,progress41, progress42, progress43
                            ,progress51, progress52, progress53
                            ,progress61, progress62, progress63
                            ,progress71, progress72, progress73
                            ,progress81, progress82, progress83
                            ,progress91, progress92, progress93
                            ,progress101, progress102, progress103
                            ,progress111, progress112, progress113
                            ,progress121, progress122, progress123
                            ,progress131, progress132, progress133
                            ,progress141, progress142, progress143
                            ,progress151, progress152, progress153
                            ,progress161, progress162, progress163
                            ,progress171, progress172, progress173
                            ,progress181, progress182, progress183
                            ,progress191, progress192, progress193;

    DataBaseCheck dataBaseCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaz_lessons);

        SharedPreferences prefs = getSharedPreferences("smajor", MODE_PRIVATE);
        int major = prefs.getInt("major", 0);

        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);

        dataBaseCheck = new DataBaseCheck(this);

        farsi = findViewById(R.id.farsibtn_11);
        arabi = findViewById(R.id.arabibtn_11);
        dini = findViewById(R.id.dinibtn_11);
        zaban = findViewById(R.id.zabanbtn_11);
        hesab = findViewById(R.id.hesabbtn_11);
        hendese = findViewById(R.id.hendesebtn_11);
        fizik = findViewById(R.id.fizikbtn_11);
        shimi = findViewById(R.id.shimibtn_11);
        amar = findViewById(R.id.amarbtn_11);
        riazit = findViewById(R.id.riazitbtn_11);
        zist = findViewById(R.id.zistbtn_11);
        dinie = findViewById(R.id.diniebtn_11);
        fonon = findViewById(R.id.fononbtn_11);
        riazie = findViewById(R.id.riaziebtn_11);
        tari = findViewById(R.id.taribtn_11);
        jogh = findViewById(R.id.joghbtn_11);
        jame = findViewById(R.id.jamebtn_11);
        ravan = findViewById(R.id.ravanbtn_11);
        fals = findViewById(R.id.falsbtn_11);

        progress11 = findViewById(R.id.p11_11);
        progress12 = findViewById(R.id.p12_11);
        progress13 = findViewById(R.id.p13_11);

        progress21 = findViewById(R.id.p21_11);
        progress22 = findViewById(R.id.p22_11);
        progress23 = findViewById(R.id.p23_11);

        progress31 = findViewById(R.id.p31_11);
        progress32 = findViewById(R.id.p32_11);
        progress33 = findViewById(R.id.p33_11);

        progress41 = findViewById(R.id.p41_11);
        progress42 = findViewById(R.id.p42_11);
        progress43 = findViewById(R.id.p43_11);

        progress51 = findViewById(R.id.p51_11);
        progress52 = findViewById(R.id.p52_11);
        progress53 = findViewById(R.id.p53_11);

        progress61 = findViewById(R.id.p61_11);
        progress62 = findViewById(R.id.p62_11);
        progress63 = findViewById(R.id.p63_11);

        progress71 = findViewById(R.id.p71_11);
        progress72 = findViewById(R.id.p72_11);
        progress73 = findViewById(R.id.p73_11);

        progress81 = findViewById(R.id.p81_11);
        progress82 = findViewById(R.id.p82_11);
        progress83 = findViewById(R.id.p83_11);

        progress91 = findViewById(R.id.p91_11);
        progress92 = findViewById(R.id.p92_11);
        progress93 = findViewById(R.id.p93_11);

        progress101 = findViewById(R.id.p101_11);
        progress102 = findViewById(R.id.p102_11);
        progress103 = findViewById(R.id.p103_11);

        progress111 = findViewById(R.id.p111_11);
        progress112 = findViewById(R.id.p112_11);
        progress113 = findViewById(R.id.p113_11);

        progress121 = findViewById(R.id.p121_11);
        progress122 = findViewById(R.id.p122_11);
        progress123 = findViewById(R.id.p123_11);

        progress131 = findViewById(R.id.p131_11);
        progress132 = findViewById(R.id.p132_11);
        progress133 = findViewById(R.id.p133_11);

        progress141 = findViewById(R.id.p141_11);
        progress142 = findViewById(R.id.p142_11);
        progress143 = findViewById(R.id.p143_11);

        progress151 = findViewById(R.id.p151_11);
        progress152 = findViewById(R.id.p152_11);
        progress153 = findViewById(R.id.p153_11);

        progress161 = findViewById(R.id.p161_11);
        progress162 = findViewById(R.id.p162_11);
        progress163 = findViewById(R.id.p163_11);

        progress171 = findViewById(R.id.p171_11);
        progress172 = findViewById(R.id.p172_11);
        progress173 = findViewById(R.id.p173_11);

        progress181 = findViewById(R.id.p181_11);
        progress182 = findViewById(R.id.p182_11);
        progress183 = findViewById(R.id.p183_11);

        progress191 = findViewById(R.id.p191_11);
        progress192 = findViewById(R.id.p192_11);
        progress193 = findViewById(R.id.p193_11);



        progress11.setProgress(dataBaseCheck.isChecked("farsi_11"));
        progress12.setProgress(dataBaseCheck.isSumed("farsi_11"));
        progress13.setProgress(dataBaseCheck.isTested("farsi_11"));

        progress21.setProgress(dataBaseCheck.isChecked("arabi_11"));
        progress22.setProgress(dataBaseCheck.isSumed("arabi_11"));
        progress23.setProgress(dataBaseCheck.isTested("arabi_11"));

        progress31.setProgress(dataBaseCheck.isChecked("dini_11"));
        progress32.setProgress(dataBaseCheck.isSumed("dini_11"));
        progress33.setProgress(dataBaseCheck.isTested("dini_11"));

        progress41.setProgress(dataBaseCheck.isChecked("zaban_11"));
        progress42.setProgress(dataBaseCheck.isSumed("zaban_11"));
        progress43.setProgress(dataBaseCheck.isTested("zaban_11"));

        progress51.setProgress(dataBaseCheck.isChecked("riazi_11"));
        progress52.setProgress(dataBaseCheck.isSumed("riazi_11"));
        progress53.setProgress(dataBaseCheck.isTested("riazi_11"));

        progress61.setProgress(dataBaseCheck.isChecked("hendese_11"));
        progress62.setProgress(dataBaseCheck.isSumed("hendese_11"));
        progress63.setProgress(dataBaseCheck.isTested("hendese_11"));

        progress71.setProgress(dataBaseCheck.isChecked("amar_11"));
        progress72.setProgress(dataBaseCheck.isSumed("amar_11"));
        progress73.setProgress(dataBaseCheck.isTested("amar_11"));

        progress81.setProgress(dataBaseCheck.isChecked("fizik_11"));
        progress82.setProgress(dataBaseCheck.isSumed("fizik_11"));
        progress83.setProgress(dataBaseCheck.isTested("fizik_11"));

        progress91.setProgress(dataBaseCheck.isChecked("shimi_11"));
        progress92.setProgress(dataBaseCheck.isSumed("shimi_11"));
        progress93.setProgress(dataBaseCheck.isTested("shimi_11"));

        progress101.setProgress(dataBaseCheck.isChecked("riazit_11"));
        progress102.setProgress(dataBaseCheck.isSumed("riazit_11"));
        progress103.setProgress(dataBaseCheck.isTested("riazit_11"));

        progress111.setProgress(dataBaseCheck.isChecked("zist_11"));
        progress112.setProgress(dataBaseCheck.isSumed("zist_11"));
        progress113.setProgress(dataBaseCheck.isTested("zist_11"));

        progress121.setProgress(dataBaseCheck.isChecked("dinie_11"));
        progress122.setProgress(dataBaseCheck.isSumed("dinie_11"));
        progress123.setProgress(dataBaseCheck.isTested("dinie_11"));

        progress131.setProgress(dataBaseCheck.isChecked("fonon_11"));
        progress132.setProgress(dataBaseCheck.isSumed("fonon_11"));
        progress133.setProgress(dataBaseCheck.isTested("fonon_11"));

        progress141.setProgress(dataBaseCheck.isChecked("riazie_11"));
        progress142.setProgress(dataBaseCheck.isSumed("riazie_11"));
        progress143.setProgress(dataBaseCheck.isTested("riazie_11"));

        progress151.setProgress(dataBaseCheck.isChecked("tari_11"));
        progress152.setProgress(dataBaseCheck.isSumed("tari_11"));
        progress153.setProgress(dataBaseCheck.isTested("tari_11"));

        progress161.setProgress(dataBaseCheck.isChecked("jame_11"));
        progress162.setProgress(dataBaseCheck.isSumed("jame_11"));
        progress163.setProgress(dataBaseCheck.isTested("jame_11"));

        progress171.setProgress(dataBaseCheck.isChecked("jogh_11"));
        progress172.setProgress(dataBaseCheck.isSumed("jogh_11"));
        progress173.setProgress(dataBaseCheck.isTested("jogh_11"));

        progress181.setProgress(dataBaseCheck.isChecked("ravan_11"));
        progress182.setProgress(dataBaseCheck.isSumed("ravan_11"));
        progress183.setProgress(dataBaseCheck.isTested("ravan_11"));

        progress191.setProgress(dataBaseCheck.isChecked("fals_11"));
        progress192.setProgress(dataBaseCheck.isSumed("fals_11"));
        progress193.setProgress(dataBaseCheck.isTested("fals_11"));


        switch (major){
            case 0:
                riazit.setVisibility(View.GONE);
                zist.setVisibility(View.GONE);
                dinie.setVisibility(View.GONE);
                fonon.setVisibility(View.GONE);
                riazie.setVisibility(View.GONE);
                tari.setVisibility(View.GONE);
                jame.setVisibility(View.GONE);
                jogh.setVisibility(View.GONE);
                ravan.setVisibility(View.GONE);
                fals.setVisibility(View.GONE);
                break;
            case 1:
                hesab.setVisibility(View.GONE);
                hendese.setVisibility(View.GONE);
                amar.setVisibility(View.GONE);
                dinie.setVisibility(View.GONE);
                fonon.setVisibility(View.GONE);
                riazie.setVisibility(View.GONE);
                tari.setVisibility(View.GONE);
                jame.setVisibility(View.GONE);
                jogh.setVisibility(View.GONE);
                ravan.setVisibility(View.GONE);
                fals.setVisibility(View.GONE);
                break;
            case 2:
                hesab.setVisibility(View.GONE);
                hendese.setVisibility(View.GONE);
                amar.setVisibility(View.GONE);
                fizik.setVisibility(View.GONE);
                shimi.setVisibility(View.GONE);
                riazit.setVisibility(View.GONE);
                zist.setVisibility(View.GONE);
                break;

        }


        farsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","farsi");
                startActivityForResult(intent,1);
            }
        });

        arabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","arabi");
                startActivityForResult(intent,1);
            }
        });

        dini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","dini");
                startActivityForResult(intent,1);
            }
        });

        zaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","zaban");
                startActivityForResult(intent,1);
            }
        });

        hesab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","riazi");
                startActivityForResult(intent,1);
            }
        });

        hendese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","hendese");
                startActivityForResult(intent,1);
            }
        });

        fizik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","fizik");
                startActivityForResult(intent,1);
            }
        });

        shimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","shimi");
                startActivityForResult(intent,1);
            }
        });

        amar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","amar");
                startActivityForResult(intent,1);
            }
        });

        riazit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","riazit");
                startActivityForResult(intent,1);
            }
        });

        zist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","zist");
                startActivityForResult(intent,1);
            }
        });

        dinie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","dinie");
                startActivityForResult(intent,1);
            }
        });

        fonon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","fonon");
                startActivityForResult(intent,1);
            }
        });

        riazie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","riazie");
                startActivityForResult(intent,1);
            }
        });

        tari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","tari");
                startActivityForResult(intent,1);
            }
        });

        jame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","jame");
                startActivityForResult(intent,1);
            }
        });

        jogh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","jogh");
                startActivityForResult(intent,1);
            }
        });

        ravan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","ravan");
                startActivityForResult(intent,1);
            }
        });

        fals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YazLessons.this , Yazdaholist.class);
                intent.putExtra("lesson","fals");
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        progress11.setProgress(dataBaseCheck.isChecked("farsi_11"));
        progress12.setProgress(dataBaseCheck.isSumed("farsi_11"));
        progress13.setProgress(dataBaseCheck.isTested("farsi_11"));

        progress21.setProgress(dataBaseCheck.isChecked("arabi_11"));
        progress22.setProgress(dataBaseCheck.isSumed("arabi_11"));
        progress23.setProgress(dataBaseCheck.isTested("arabi_11"));

        progress31.setProgress(dataBaseCheck.isChecked("dini_11"));
        progress32.setProgress(dataBaseCheck.isSumed("dini_11"));
        progress33.setProgress(dataBaseCheck.isTested("dini_11"));

        progress41.setProgress(dataBaseCheck.isChecked("zaban_11"));
        progress42.setProgress(dataBaseCheck.isSumed("zaban_11"));
        progress43.setProgress(dataBaseCheck.isTested("zaban_11"));

        progress51.setProgress(dataBaseCheck.isChecked("riazi_11"));
        progress52.setProgress(dataBaseCheck.isSumed("riazi_11"));
        progress53.setProgress(dataBaseCheck.isTested("riazi_11"));

        progress61.setProgress(dataBaseCheck.isChecked("hendese_11"));
        progress62.setProgress(dataBaseCheck.isSumed("hendese_11"));
        progress63.setProgress(dataBaseCheck.isTested("hendese_11"));

        progress71.setProgress(dataBaseCheck.isChecked("amar_11"));
        progress72.setProgress(dataBaseCheck.isSumed("amar_11"));
        progress73.setProgress(dataBaseCheck.isTested("amar_11"));

        progress81.setProgress(dataBaseCheck.isChecked("fizik_11"));
        progress82.setProgress(dataBaseCheck.isSumed("fizik_11"));
        progress83.setProgress(dataBaseCheck.isTested("fizik_11"));

        progress91.setProgress(dataBaseCheck.isChecked("shimi_11"));
        progress92.setProgress(dataBaseCheck.isSumed("shimi_11"));
        progress93.setProgress(dataBaseCheck.isTested("shimi_11"));

        progress101.setProgress(dataBaseCheck.isChecked("riazit_11"));
        progress102.setProgress(dataBaseCheck.isSumed("riazit_11"));
        progress103.setProgress(dataBaseCheck.isTested("riazit_11"));

        progress111.setProgress(dataBaseCheck.isChecked("zist_11"));
        progress112.setProgress(dataBaseCheck.isSumed("zist_11"));
        progress113.setProgress(dataBaseCheck.isTested("zist_11"));

        progress121.setProgress(dataBaseCheck.isChecked("dinie_11"));
        progress122.setProgress(dataBaseCheck.isSumed("dinie_11"));
        progress123.setProgress(dataBaseCheck.isTested("dinie_11"));

        progress131.setProgress(dataBaseCheck.isChecked("fonon_11"));
        progress132.setProgress(dataBaseCheck.isSumed("fonon_11"));
        progress133.setProgress(dataBaseCheck.isTested("fonon_11"));

        progress141.setProgress(dataBaseCheck.isChecked("riazie_11"));
        progress142.setProgress(dataBaseCheck.isSumed("riazie_11"));
        progress143.setProgress(dataBaseCheck.isTested("riazie_11"));

        progress151.setProgress(dataBaseCheck.isChecked("tari_11"));
        progress152.setProgress(dataBaseCheck.isSumed("tari_11"));
        progress153.setProgress(dataBaseCheck.isTested("tari_11"));

        progress161.setProgress(dataBaseCheck.isChecked("jame_11"));
        progress162.setProgress(dataBaseCheck.isSumed("jame_11"));
        progress163.setProgress(dataBaseCheck.isTested("jame_11"));

        progress171.setProgress(dataBaseCheck.isChecked("jogh_11"));
        progress172.setProgress(dataBaseCheck.isSumed("jogh_11"));
        progress173.setProgress(dataBaseCheck.isTested("jogh_11"));

        progress181.setProgress(dataBaseCheck.isChecked("ravan_11"));
        progress182.setProgress(dataBaseCheck.isSumed("ravan_11"));
        progress183.setProgress(dataBaseCheck.isTested("ravan_11"));

        progress191.setProgress(dataBaseCheck.isChecked("fals_11"));
        progress192.setProgress(dataBaseCheck.isSumed("fals_11"));
        progress193.setProgress(dataBaseCheck.isTested("fals_11"));
    }

}
