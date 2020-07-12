package com.appnita.ravandnama.davazdahom;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.appnita.ravandnama.DataBaseCheck;
import com.appnita.ravandnama.LessonAdapter;
import com.appnita.ravandnama.LessonModel;
import com.appnita.ravandnama.R;

import java.util.ArrayList;
import java.util.List;

public class DavazdahomList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LessonAdapter customAdapter;
    private String lesson;
    private int counter;
    private TextView lessonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_davazdahomlist);

        Intent returnIntent = new Intent();
        setResult(Activity.RESULT_CANCELED, returnIntent);

        Bundle bundle = getIntent().getExtras();
        lesson = bundle.getString("lesson");

        DataBaseCheck dataBaseCheck = new DataBaseCheck(this);
        dataBaseCheck.addlessons(model(),lesson+"_12");

        lessonName = findViewById(R.id.lesson_name_12);
        switch (lesson){
            case "farsi":
                lessonName.setText("فارسی");
                break;
            case "arabi":
                lessonName.setText("عربی");
                break;
            case "dini":
                lessonName.setText("دین و زندگی");
                break;
            case "zaban":
                lessonName.setText("زبان انگلیسی");
                break;
            case "hesab":
                lessonName.setText("حسابان");
                break;
            case "hendese":
                lessonName.setText("هندسه");
                break;
            case "gosas":
                lessonName.setText("ریاضیات گسسته");
                break;
            case "fizik":
                lessonName.setText("فیزیک");
                break;
            case "shimi":
                lessonName.setText("شیمی");
                break;
            case "riazit":
                lessonName.setText("ریاضی");
                break;
            case "zist":
                lessonName.setText("زیست شناسی");
                break;
            case "fizikt":
                lessonName.setText("فیزیک تجربی");
                break;
            case "fonon":
                lessonName.setText("علوم و فنون");
                break;
            case "riazie":
                lessonName.setText("ریاضی انسانی");
                break;
            case "tari":
                lessonName.setText("تاریخ");
                break;
            case "jame":
                lessonName.setText("جامعه شناسی");
                break;
            case "jogh":
                lessonName.setText("جغرافیا");
                break;
            case "fals":
                lessonName.setText("فلسفه");
                break;
        }

        setupRecyclerView();
        getLessonsFronDatabase();
    }

    private ArrayList<LessonModel> model() {
        ArrayList<LessonModel> list = new ArrayList<>();
        switch (lesson){
            case "farsi":
                counter = 17;
                break;
            case "arabi":
                counter = 4;
                break;
            case "dini":
                counter = 10;
                break;
            case "zaban":
                counter = 3;
                break;
            case "hesab":
                counter = 5;
                break;
            case "hendese":
                counter = 3;
                break;
            case "gosas":
                counter = 3;
                break;
            case "fizik":
                counter = 6;
                break;
            case "shimi":
                counter = 4;
                break;
            case "riazit":
                counter = 7;
                break;
            case "zist":
                counter = 8;
                break;
            case "fizikt":
                counter = 4;
                break;
            case "fonon":
                counter = 12;
                break;
            case "riazie":
                counter = 3;
                break;
            case "tari":
                counter = 12;
                break;
            case "jame":
                counter = 10;
                break;
            case "jogh":
                counter = 6;
                break;
            case "fals":
                counter = 12;
                break;
        }
        for (int i = 0; i < counter; i++) {
            LessonModel model = new LessonModel();
            model.setId(i);
            model.setLesson(i);
            model.setIsRead(0);
            model.setIssum(0);
            model.setIsRead(0);
            list.add(model);
        }
        return list;
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recycler12);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

    }

    public void getLessonsFronDatabase() {
        DataBaseCheck dataBaseCheck = new DataBaseCheck(this);
        List<LessonModel> models = dataBaseCheck.getlessons("tbl_"+lesson+"_12");
        customAdapter = new LessonAdapter(this, (ArrayList<LessonModel>) models,lesson+"_12");
        recyclerView.setAdapter(customAdapter);
    }
}
