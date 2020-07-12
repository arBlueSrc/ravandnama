package com.appnita.ravandnama.dahom;

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


public class DahLesson extends AppCompatActivity {

    LinearLayout farsi,arabi,dini,zaban,riazi,hendese,fizik,shimi,zist
                    ,fonon,riazie,tari,jame,jogh,egh,mant;

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
                            ,progress161, progress162, progress163;

    DataBaseCheck dataBaseCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dahom_lessons);

        SharedPreferences prefs = getSharedPreferences("smajor", MODE_PRIVATE);
        int major = prefs.getInt("major", 0);

        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);

        dataBaseCheck = new DataBaseCheck(this);

        farsi = findViewById(R.id.farsibtn_10);
        arabi = findViewById(R.id.arabibtn_10);
        dini = findViewById(R.id.dinibtn_10);
        zaban = findViewById(R.id.zabanbtn_10);
        riazi = findViewById(R.id.riazibtn_10);
        hendese = findViewById(R.id.hendesebtn_10);
        fizik = findViewById(R.id.fizikbtn_10);
        shimi = findViewById(R.id.shimibtn_10);
        zist = findViewById(R.id.zistbtn_10);
        fonon = findViewById(R.id.fononbtn_10);
        riazie = findViewById(R.id.riaziebtn_10);
        tari = findViewById(R.id.taribtn_10);
        jame = findViewById(R.id.jamebtn_10);
        jogh = findViewById(R.id.joghbtn_10);
        egh = findViewById(R.id.eghbtn_10);
        mant = findViewById(R.id.mantbtn_10);

        progress11 = findViewById(R.id.p11);
        progress12 = findViewById(R.id.p12);
        progress13 = findViewById(R.id.p13);

        progress21 = findViewById(R.id.p21);
        progress22 = findViewById(R.id.p22);
        progress23 = findViewById(R.id.p23);

        progress31 = findViewById(R.id.p31);
        progress32 = findViewById(R.id.p32);
        progress33 = findViewById(R.id.p33);

        progress41 = findViewById(R.id.p41);
        progress42 = findViewById(R.id.p42);
        progress43 = findViewById(R.id.p43);

        progress51 = findViewById(R.id.p51);
        progress52 = findViewById(R.id.p52);
        progress53 = findViewById(R.id.p53);

        progress61 = findViewById(R.id.p61);
        progress62 = findViewById(R.id.p62);
        progress63 = findViewById(R.id.p63);

        progress71 = findViewById(R.id.p71);
        progress72 = findViewById(R.id.p72);
        progress73 = findViewById(R.id.p73);

        progress81 = findViewById(R.id.p81);
        progress82 = findViewById(R.id.p82);
        progress83 = findViewById(R.id.p83);

        progress91 = findViewById(R.id.p91);
        progress92 = findViewById(R.id.p92);
        progress93 = findViewById(R.id.p93);

        progress101 = findViewById(R.id.p101);
        progress102 = findViewById(R.id.p102);
        progress103 = findViewById(R.id.p103);

        progress111 = findViewById(R.id.p111);
        progress112 = findViewById(R.id.p112);
        progress113 = findViewById(R.id.p113);

        progress121 = findViewById(R.id.p121);
        progress122 = findViewById(R.id.p122);
        progress123 = findViewById(R.id.p123);

        progress131 = findViewById(R.id.p131);
        progress132 = findViewById(R.id.p132);
        progress133 = findViewById(R.id.p133);

        progress141 = findViewById(R.id.p141);
        progress142 = findViewById(R.id.p142);
        progress143 = findViewById(R.id.p143);

        progress151 = findViewById(R.id.p151);
        progress152 = findViewById(R.id.p152);
        progress153 = findViewById(R.id.p153);

        progress161 = findViewById(R.id.p161);
        progress162 = findViewById(R.id.p162);
        progress163 = findViewById(R.id.p163);



        progress11.setProgress(dataBaseCheck.isChecked("farsi"));
        progress12.setProgress(dataBaseCheck.isSumed("farsi"));
        progress13.setProgress(dataBaseCheck.isTested("farsi"));

        progress21.setProgress(dataBaseCheck.isChecked("arabi"));
        progress22.setProgress(dataBaseCheck.isSumed("arabi"));
        progress23.setProgress(dataBaseCheck.isTested("arabi"));

        progress31.setProgress(dataBaseCheck.isChecked("dini"));
        progress32.setProgress(dataBaseCheck.isSumed("dini"));
        progress33.setProgress(dataBaseCheck.isTested("dini"));

        progress41.setProgress(dataBaseCheck.isChecked("zaban"));
        progress42.setProgress(dataBaseCheck.isSumed("zaban"));
        progress43.setProgress(dataBaseCheck.isTested("zaban"));

        progress51.setProgress(dataBaseCheck.isChecked("riazi"));
        progress52.setProgress(dataBaseCheck.isSumed("riazi"));
        progress53.setProgress(dataBaseCheck.isTested("riazi"));

        progress61.setProgress(dataBaseCheck.isChecked("hendese"));
        progress62.setProgress(dataBaseCheck.isSumed("hendese"));
        progress63.setProgress(dataBaseCheck.isTested("hendese"));

        progress71.setProgress(dataBaseCheck.isChecked("fizik"));
        progress72.setProgress(dataBaseCheck.isSumed("fizik"));
        progress73.setProgress(dataBaseCheck.isTested("fizik"));

        progress81.setProgress(dataBaseCheck.isChecked("shimi"));
        progress82.setProgress(dataBaseCheck.isSumed("shimi"));
        progress83.setProgress(dataBaseCheck.isTested("shimi"));

        progress91.setProgress(dataBaseCheck.isChecked("zist"));
        progress92.setProgress(dataBaseCheck.isSumed("zist"));
        progress93.setProgress(dataBaseCheck.isTested("zist"));

        progress101.setProgress(dataBaseCheck.isChecked("fonon"));
        progress102.setProgress(dataBaseCheck.isSumed("fonon"));
        progress103.setProgress(dataBaseCheck.isTested("fonon"));

        progress111.setProgress(dataBaseCheck.isChecked("riazie"));
        progress112.setProgress(dataBaseCheck.isSumed("riazie"));
        progress113.setProgress(dataBaseCheck.isTested("riazie"));

        progress121.setProgress(dataBaseCheck.isChecked("tari"));
        progress122.setProgress(dataBaseCheck.isSumed("tari"));
        progress123.setProgress(dataBaseCheck.isTested("tari"));

        progress131.setProgress(dataBaseCheck.isChecked("jame"));
        progress132.setProgress(dataBaseCheck.isSumed("jame"));
        progress133.setProgress(dataBaseCheck.isTested("jame"));

        progress141.setProgress(dataBaseCheck.isChecked("jogh"));
        progress142.setProgress(dataBaseCheck.isSumed("jogh"));
        progress143.setProgress(dataBaseCheck.isTested("jogh"));

        progress151.setProgress(dataBaseCheck.isChecked("egh"));
        progress152.setProgress(dataBaseCheck.isSumed("egh"));
        progress153.setProgress(dataBaseCheck.isTested("egh"));

        progress161.setProgress(dataBaseCheck.isChecked("mant"));
        progress162.setProgress(dataBaseCheck.isSumed("mant"));
        progress163.setProgress(dataBaseCheck.isTested("mant"));

        switch (major){
            case 0:
                zist.setVisibility(View.GONE);
                fonon.setVisibility(View.GONE);
                riazie.setVisibility(View.GONE);
                tari.setVisibility(View.GONE);
                jame.setVisibility(View.GONE);
                jogh.setVisibility(View.GONE);
                egh.setVisibility(View.GONE);
                mant.setVisibility(View.GONE);
                break;
            case 1:
                hendese.setVisibility(View.GONE);
                fonon.setVisibility(View.GONE);
                riazie.setVisibility(View.GONE);
                tari.setVisibility(View.GONE);
                jame.setVisibility(View.GONE);
                jogh.setVisibility(View.GONE);
                egh.setVisibility(View.GONE);
                mant.setVisibility(View.GONE);
                break;
            case 2:
                hendese.setVisibility(View.GONE);
                riazi.setVisibility(View.GONE);
                fizik.setVisibility(View.GONE);
                shimi.setVisibility(View.GONE);
                zist.setVisibility(View.GONE);
                break;
        }

        farsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","farsi");
                startActivityForResult(intent,1);
            }
        });

        arabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","arabi");
                startActivityForResult(intent,1);
            }
        });

        dini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","dini");
                startActivityForResult(intent,1);
            }
        });

        zaban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","zaban");
                startActivityForResult(intent,1);
            }
        });

        riazi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","riazi");
                startActivityForResult(intent,1);
            }
        });

        hendese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","hendese");
                startActivityForResult(intent,1);
            }
        });

        fizik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","fizik");
                startActivityForResult(intent,1);
            }
        });

        shimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","shimi");
                startActivityForResult(intent,1);
            }
        });

        zist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","zist");
                startActivityForResult(intent,1);
            }
        });

        fonon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","fonon");
                startActivityForResult(intent,1);
            }
        });

        riazie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","riazie");
                startActivityForResult(intent,1);
            }
        });

        tari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","tari");
                startActivityForResult(intent,1);
            }
        });

        jame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","jame");
                startActivityForResult(intent,1);
            }
        });

        jogh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","jogh");
                startActivityForResult(intent,1);
            }
        });

        egh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","egh");
                startActivityForResult(intent,1);
            }
        });

        mant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DahLesson.this , DahomList.class);
                intent.putExtra("lesson","mant");
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        progress11.setProgress(dataBaseCheck.isChecked("farsi"));
        progress12.setProgress(dataBaseCheck.isSumed("farsi"));
        progress13.setProgress(dataBaseCheck.isTested("farsi"));

        progress21.setProgress(dataBaseCheck.isChecked("arabi"));
        progress22.setProgress(dataBaseCheck.isSumed("arabi"));
        progress23.setProgress(dataBaseCheck.isTested("arabi"));

        progress31.setProgress(dataBaseCheck.isChecked("dini"));
        progress32.setProgress(dataBaseCheck.isSumed("dini"));
        progress33.setProgress(dataBaseCheck.isTested("dini"));

        progress41.setProgress(dataBaseCheck.isChecked("zaban"));
        progress42.setProgress(dataBaseCheck.isSumed("zaban"));
        progress43.setProgress(dataBaseCheck.isTested("zaban"));

        progress51.setProgress(dataBaseCheck.isChecked("riazi"));
        progress52.setProgress(dataBaseCheck.isSumed("riazi"));
        progress53.setProgress(dataBaseCheck.isTested("riazi"));

        progress61.setProgress(dataBaseCheck.isChecked("hendese"));
        progress62.setProgress(dataBaseCheck.isSumed("hendese"));
        progress63.setProgress(dataBaseCheck.isTested("hendese"));

        progress71.setProgress(dataBaseCheck.isChecked("fizik"));
        progress72.setProgress(dataBaseCheck.isSumed("fizik"));
        progress73.setProgress(dataBaseCheck.isTested("fizik"));

        progress81.setProgress(dataBaseCheck.isChecked("shimi"));
        progress82.setProgress(dataBaseCheck.isSumed("shimi"));
        progress83.setProgress(dataBaseCheck.isTested("shimi"));

        progress91.setProgress(dataBaseCheck.isChecked("zist"));
        progress92.setProgress(dataBaseCheck.isSumed("zist"));
        progress93.setProgress(dataBaseCheck.isTested("zist"));

        progress101.setProgress(dataBaseCheck.isChecked("fonon"));
        progress102.setProgress(dataBaseCheck.isSumed("fonon"));
        progress103.setProgress(dataBaseCheck.isTested("fonon"));

        progress111.setProgress(dataBaseCheck.isChecked("riazie"));
        progress112.setProgress(dataBaseCheck.isSumed("riazie"));
        progress113.setProgress(dataBaseCheck.isTested("riazie"));

        progress121.setProgress(dataBaseCheck.isChecked("tari"));
        progress122.setProgress(dataBaseCheck.isSumed("tari"));
        progress123.setProgress(dataBaseCheck.isTested("tari"));

        progress131.setProgress(dataBaseCheck.isChecked("jame"));
        progress132.setProgress(dataBaseCheck.isSumed("jame"));
        progress133.setProgress(dataBaseCheck.isTested("jame"));

        progress141.setProgress(dataBaseCheck.isChecked("jogh"));
        progress142.setProgress(dataBaseCheck.isSumed("jogh"));
        progress143.setProgress(dataBaseCheck.isTested("jogh"));

        progress151.setProgress(dataBaseCheck.isChecked("egh"));
        progress152.setProgress(dataBaseCheck.isSumed("egh"));
        progress153.setProgress(dataBaseCheck.isTested("egh"));

        progress161.setProgress(dataBaseCheck.isChecked("mant"));
        progress162.setProgress(dataBaseCheck.isSumed("mant"));
        progress163.setProgress(dataBaseCheck.isTested("mant"));

    }

}
