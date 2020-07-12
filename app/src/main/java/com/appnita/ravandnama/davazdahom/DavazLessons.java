package com.appnita.ravandnama.davazdahom;

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
import com.appnita.ravandnama.yazdahom.Yazdaholist;


public class DavazLessons extends AppCompatActivity {
    LinearLayout farsi,arabi,dini,zaban,
            hesab,hendese,gosas,fizik,shimi,
            riazit,zist,fizikt
            ,fonon,riazie,tari,jame,jogh,fals;

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
                            ,progress181, progress182, progress183;

    DataBaseCheck dataBaseCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_davaz_lessons);

        SharedPreferences prefs = getSharedPreferences("smajor", MODE_PRIVATE);
        int major = prefs.getInt("major", 0);

        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);

        dataBaseCheck = new DataBaseCheck(this);

        farsi = findViewById(R.id.farsibtn_12);
        arabi = findViewById(R.id.arabibtn_12);
        dini = findViewById(R.id.dinibtn_12);
        zaban = findViewById(R.id.zabanbtn_12);
        hesab = findViewById(R.id.hesabbtn_12);
        hendese = findViewById(R.id.hendesebtn_12);
        fizik = findViewById(R.id.fizikbtn_12);
        shimi = findViewById(R.id.shimibtn_12);
        gosas = findViewById(R.id.gosasbtn_12);
        riazit = findViewById(R.id.riazitbtn_12);
        zist = findViewById(R.id.zistbtn_12);
        fizikt = findViewById(R.id.fiziktbtn_12);
        fonon = findViewById(R.id.fononbtn_12);
        riazie = findViewById(R.id.riaziebtn_12);
        tari = findViewById(R.id.taribtn_12);
        jogh = findViewById(R.id.joghbtn_12);
        jame = findViewById(R.id.jamebtn_12);
        fals = findViewById(R.id.falsbtn_12);

        progress11 = findViewById(R.id.p11_12);
        progress12 = findViewById(R.id.p12_12);
        progress13 = findViewById(R.id.p13_12);

        progress21 = findViewById(R.id.p21_12);
        progress22 = findViewById(R.id.p22_12);
        progress23 = findViewById(R.id.p23_12);

        progress31 = findViewById(R.id.p31_12);
        progress32 = findViewById(R.id.p32_12);
        progress33 = findViewById(R.id.p33_12);

        progress41 = findViewById(R.id.p41_12);
        progress42 = findViewById(R.id.p42_12);
        progress43 = findViewById(R.id.p43_12);

        progress51 = findViewById(R.id.p51_12);
        progress52 = findViewById(R.id.p52_12);
        progress53 = findViewById(R.id.p53_12);

        progress61 = findViewById(R.id.p61_12);
        progress62 = findViewById(R.id.p62_12);
        progress63 = findViewById(R.id.p63_12);

        progress71 = findViewById(R.id.p71_12);
        progress72 = findViewById(R.id.p72_12);
        progress73 = findViewById(R.id.p73_12);

        progress81 = findViewById(R.id.p81_12);
        progress82 = findViewById(R.id.p82_12);
        progress83 = findViewById(R.id.p83_12);

        progress91 = findViewById(R.id.p91_12);
        progress92 = findViewById(R.id.p92_12);
        progress93 = findViewById(R.id.p93_12);

        progress101 = findViewById(R.id.p101_12);
        progress102 = findViewById(R.id.p102_12);
        progress103 = findViewById(R.id.p103_12);

        progress111 = findViewById(R.id.p111_12);
        progress112 = findViewById(R.id.p112_12);
        progress113 = findViewById(R.id.p113_12);

        progress121 = findViewById(R.id.p121_12);
        progress122 = findViewById(R.id.p122_12);
        progress123 = findViewById(R.id.p123_12);

        progress131 = findViewById(R.id.p131_12);
        progress132 = findViewById(R.id.p132_12);
        progress133 = findViewById(R.id.p133_12);

        progress141 = findViewById(R.id.p141_12);
        progress142 = findViewById(R.id.p142_12);
        progress143 = findViewById(R.id.p143_12);

        progress151 = findViewById(R.id.p151_12);
        progress152 = findViewById(R.id.p152_12);
        progress153 = findViewById(R.id.p153_12);

        progress161 = findViewById(R.id.p161_12);
        progress162 = findViewById(R.id.p162_12);
        progress163 = findViewById(R.id.p163_12);

        progress171 = findViewById(R.id.p171_12);
        progress172 = findViewById(R.id.p172_12);
        progress173 = findViewById(R.id.p173_12);

        progress181 = findViewById(R.id.p181_12);
        progress182 = findViewById(R.id.p182_12);
        progress183 = findViewById(R.id.p183_12);


        progress11.setProgress(dataBaseCheck.isChecked("farsi_12"));
        progress12.setProgress(dataBaseCheck.isSumed("farsi_12"));
        progress13.setProgress(dataBaseCheck.isTested("farsi_12"));

        progress21.setProgress(dataBaseCheck.isChecked("arabi_12"));
        progress22.setProgress(dataBaseCheck.isSumed("arabi_12"));
        progress23.setProgress(dataBaseCheck.isTested("arabi_12"));

        progress31.setProgress(dataBaseCheck.isChecked("dini_12"));
        progress32.setProgress(dataBaseCheck.isSumed("dini_12"));
        progress33.setProgress(dataBaseCheck.isTested("dini_12"));

        progress41.setProgress(dataBaseCheck.isChecked("zaban_12"));
        progress42.setProgress(dataBaseCheck.isSumed("zaban_12"));
        progress43.setProgress(dataBaseCheck.isTested("zaban_12"));

        progress51.setProgress(dataBaseCheck.isChecked("hesab_12"));
        progress52.setProgress(dataBaseCheck.isSumed("hesab_12"));
        progress53.setProgress(dataBaseCheck.isTested("hesab_12"));

        progress61.setProgress(dataBaseCheck.isChecked("hendese_12"));
        progress62.setProgress(dataBaseCheck.isSumed("hendese_12"));
        progress63.setProgress(dataBaseCheck.isTested("hendese_12"));

        progress71.setProgress(dataBaseCheck.isChecked("gosas_12"));
        progress72.setProgress(dataBaseCheck.isSumed("gosas_12"));
        progress73.setProgress(dataBaseCheck.isTested("gosas_12"));

        progress81.setProgress(dataBaseCheck.isChecked("fizik_12"));
        progress82.setProgress(dataBaseCheck.isSumed("fizik_12"));
        progress83.setProgress(dataBaseCheck.isTested("fizik_12"));

        progress91.setProgress(dataBaseCheck.isChecked("shimi_12"));
        progress92.setProgress(dataBaseCheck.isSumed("shimi_12"));
        progress93.setProgress(dataBaseCheck.isTested("shimi_12"));

        progress101.setProgress(dataBaseCheck.isChecked("riazit_12"));
        progress102.setProgress(dataBaseCheck.isSumed("riazit_12"));
        progress103.setProgress(dataBaseCheck.isTested("riazit_12"));

        progress111.setProgress(dataBaseCheck.isChecked("zist_12"));
        progress112.setProgress(dataBaseCheck.isSumed("zist_12"));
        progress113.setProgress(dataBaseCheck.isTested("zist_12"));

        progress121.setProgress(dataBaseCheck.isChecked("fizikt_12"));
        progress122.setProgress(dataBaseCheck.isSumed("fizikt_12"));
        progress123.setProgress(dataBaseCheck.isTested("fizikt_12"));

        progress131.setProgress(dataBaseCheck.isChecked("fonon_12"));
        progress132.setProgress(dataBaseCheck.isSumed("fonon_12"));
        progress133.setProgress(dataBaseCheck.isTested("fonon_12"));

        progress141.setProgress(dataBaseCheck.isChecked("riazie_12"));
        progress142.setProgress(dataBaseCheck.isSumed("riazie_12"));
        progress143.setProgress(dataBaseCheck.isTested("riazie_12"));

        progress151.setProgress(dataBaseCheck.isChecked("tari_12"));
        progress152.setProgress(dataBaseCheck.isSumed("tari_12"));
        progress153.setProgress(dataBaseCheck.isTested("tari_12"));

        progress161.setProgress(dataBaseCheck.isChecked("jame_12"));
        progress162.setProgress(dataBaseCheck.isSumed("jame_12"));
        progress163.setProgress(dataBaseCheck.isTested("jame_12"));

        progress171.setProgress(dataBaseCheck.isChecked("jogh_12"));
        progress172.setProgress(dataBaseCheck.isSumed("jogh_12"));
        progress173.setProgress(dataBaseCheck.isTested("jogh_12"));

        progress181.setProgress(dataBaseCheck.isChecked("fals_12"));
        progress182.setProgress(dataBaseCheck.isSumed("fals_12"));
        progress183.setProgress(dataBaseCheck.isTested("fals_12"));

        switch (major){
            case 0:
                riazit.setVisibility(View.GONE);
                zist.setVisibility(View.GONE);
                fizikt.setVisibility(View.GONE);
                fonon.setVisibility(View.GONE);
                riazie.setVisibility(View.GONE);
                tari.setVisibility(View.GONE);
                jame.setVisibility(View.GONE);
                jogh.setVisibility(View.GONE);
                fals.setVisibility(View.GONE);
                break;
            case 1:
                hesab.setVisibility(View.GONE);
                hendese.setVisibility(View.GONE);
                gosas.setVisibility(View.GONE);
                fizik.setVisibility(View.GONE);
                fonon.setVisibility(View.GONE);
                riazie.setVisibility(View.GONE);
                tari.setVisibility(View.GONE);
                jame.setVisibility(View.GONE);
                jogh.setVisibility(View.GONE);
                fals.setVisibility(View.GONE);
                break;
            case 2:
                hendese.setVisibility(View.GONE);
                hesab.setVisibility(View.GONE);
                gosas.setVisibility(View.GONE);
                fizik.setVisibility(View.GONE);
                shimi.setVisibility(View.GONE);
                zist.setVisibility(View.GONE);
                riazit.setVisibility(View.GONE);
                fizikt.setVisibility(View.GONE);
                break;
        }


        farsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","farsi");
                startActivityForResult(intent,1);
            }
        });

        arabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","arabi");
                startActivityForResult(intent,1);
            }
        });

        dini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","dini");
                startActivityForResult(intent,1);
            }
        });

        zaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","zaban");
                startActivityForResult(intent,1);
            }
        });

        hesab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","hesab");
                startActivityForResult(intent,1);
            }
        });

        hendese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","hendese");
                startActivityForResult(intent,1);
            }
        });

        fizik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","fizik");
                startActivityForResult(intent,1);
            }
        });

        shimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","shimi");
                startActivityForResult(intent,1);
            }
        });

        gosas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","gosas");
                startActivityForResult(intent,1);
            }
        });

        riazit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","riazit");
                startActivityForResult(intent,1);
            }
        });

        zist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","zist");
                startActivityForResult(intent,1);
            }
        });

        fizikt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","fizikt");
                startActivityForResult(intent,1);
            }
        });

        fonon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","fonon");
                startActivityForResult(intent,1);
            }
        });

        riazie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","riazie");
                startActivityForResult(intent,1);
            }
        });

        tari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","tari");
                startActivityForResult(intent,1);
            }
        });

        jame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","jame");
                startActivityForResult(intent,1);
            }
        });

        jogh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","jogh");
                startActivityForResult(intent,1);
            }
        });


        fals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DavazLessons.this , DavazdahomList.class);
                intent.putExtra("lesson","fals");
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        progress11.setProgress(dataBaseCheck.isChecked("farsi_12"));
        progress12.setProgress(dataBaseCheck.isSumed("farsi_12"));
        progress13.setProgress(dataBaseCheck.isTested("farsi_12"));

        progress21.setProgress(dataBaseCheck.isChecked("arabi_12"));
        progress22.setProgress(dataBaseCheck.isSumed("arabi_12"));
        progress23.setProgress(dataBaseCheck.isTested("arabi_12"));

        progress31.setProgress(dataBaseCheck.isChecked("dini_12"));
        progress32.setProgress(dataBaseCheck.isSumed("dini_12"));
        progress33.setProgress(dataBaseCheck.isTested("dini_12"));

        progress41.setProgress(dataBaseCheck.isChecked("zaban_12"));
        progress42.setProgress(dataBaseCheck.isSumed("zaban_12"));
        progress43.setProgress(dataBaseCheck.isTested("zaban_12"));

        progress51.setProgress(dataBaseCheck.isChecked("hesab_12"));
        progress52.setProgress(dataBaseCheck.isSumed("hesab_12"));
        progress53.setProgress(dataBaseCheck.isTested("hesab_12"));

        progress61.setProgress(dataBaseCheck.isChecked("hendese_12"));
        progress62.setProgress(dataBaseCheck.isSumed("hendese_12"));
        progress63.setProgress(dataBaseCheck.isTested("hendese_12"));

        progress71.setProgress(dataBaseCheck.isChecked("gosas_12"));
        progress72.setProgress(dataBaseCheck.isSumed("gosas_12"));
        progress73.setProgress(dataBaseCheck.isTested("gosas_12"));

        progress81.setProgress(dataBaseCheck.isChecked("fizik_12"));
        progress82.setProgress(dataBaseCheck.isSumed("fizik_12"));
        progress83.setProgress(dataBaseCheck.isTested("fizik_12"));

        progress91.setProgress(dataBaseCheck.isChecked("shimi_12"));
        progress92.setProgress(dataBaseCheck.isSumed("shimi_12"));
        progress93.setProgress(dataBaseCheck.isTested("shimi_12"));

        progress101.setProgress(dataBaseCheck.isChecked("riazit_12"));
        progress102.setProgress(dataBaseCheck.isSumed("riazit_12"));
        progress103.setProgress(dataBaseCheck.isTested("riazit_12"));

        progress111.setProgress(dataBaseCheck.isChecked("zist_12"));
        progress112.setProgress(dataBaseCheck.isSumed("zist_12"));
        progress113.setProgress(dataBaseCheck.isTested("zist_12"));

        progress121.setProgress(dataBaseCheck.isChecked("fizikt_12"));
        progress122.setProgress(dataBaseCheck.isSumed("fizikt_12"));
        progress123.setProgress(dataBaseCheck.isTested("fizikt_12"));

        progress131.setProgress(dataBaseCheck.isChecked("fonon_12"));
        progress132.setProgress(dataBaseCheck.isSumed("fonon_12"));
        progress133.setProgress(dataBaseCheck.isTested("fonon_12"));

        progress141.setProgress(dataBaseCheck.isChecked("riazie_12"));
        progress142.setProgress(dataBaseCheck.isSumed("riazie_12"));
        progress143.setProgress(dataBaseCheck.isTested("riazie_12"));

        progress151.setProgress(dataBaseCheck.isChecked("tari_12"));
        progress152.setProgress(dataBaseCheck.isSumed("tari_12"));
        progress153.setProgress(dataBaseCheck.isTested("tari_12"));

        progress161.setProgress(dataBaseCheck.isChecked("jame_12"));
        progress162.setProgress(dataBaseCheck.isSumed("jame_12"));
        progress163.setProgress(dataBaseCheck.isTested("jame_12"));

        progress171.setProgress(dataBaseCheck.isChecked("jogh_12"));
        progress172.setProgress(dataBaseCheck.isSumed("jogh_12"));
        progress173.setProgress(dataBaseCheck.isTested("jogh_12"));

        progress181.setProgress(dataBaseCheck.isChecked("fals_12"));
        progress182.setProgress(dataBaseCheck.isSumed("fals_12"));
        progress183.setProgress(dataBaseCheck.isTested("fals_12"));
    }

}

