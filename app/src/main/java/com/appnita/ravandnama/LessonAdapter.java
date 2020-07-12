package com.appnita.ravandnama;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LessonAdapter extends RecyclerView.Adapter<LessonAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    public static ArrayList<LessonModel> arrayList;
    private Context context;
    private String name;

    public LessonAdapter(Context context, ArrayList<LessonModel> arrayList,String name) {
        inflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
        this.context = context;
        this.name = name;
    }

    @Override
    public LessonAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rv_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final LessonAdapter.MyViewHolder holder, final int position) {

        final LessonModel model = arrayList.get(position);
        final DataBaseCheck dataBaseCheck = new DataBaseCheck(context);

        holder.lesson.setText("درس " + (position + 1));

        if (arrayList.get(position).getIsRead() == 1) {
            holder.checkBox1.setChecked(true);
        } else {
            holder.checkBox1.setChecked(false);
        }

        if (arrayList.get(position).getIssum() == 1) {
            holder.checkBox2.setChecked(true);
        } else {
            holder.checkBox2.setChecked(false);
        }

        if (arrayList.get(position).getTest() == 1) {
            holder.checkBox3.setChecked(true);
        } else {
            holder.checkBox3.setChecked(false);
        }

        holder.checkBox1.setTag(position);
        holder.checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notifyItemChanged(position);

                int pos = (Integer) holder.checkBox1.getTag();

                if (arrayList.get(pos).getIsRead() == 1) {
                    arrayList.get(pos).setIsRead(0);
                    holder.checkBox1.setChecked(false);
                    switch (name){
                        case "farsi":
                            dataBaseCheck.setlessonsisread(position,0,"farsi");
                            break;
                        case "arabi":
                            dataBaseCheck.setlessonsisread(position,0,"arabi");
                            break;
                        case "dini":
                            dataBaseCheck.setlessonsisread(position,0,"dini");
                            break;
                        case "zaban":
                            dataBaseCheck.setlessonsisread(position,0,"zaban");
                            break;
                        case "riazi":
                            dataBaseCheck.setlessonsisread(position,0,"riazi");
                            break;
                        case "hendese":
                            dataBaseCheck.setlessonsisread(position,0,"hendese");
                            break;
                        case "fizik":
                            dataBaseCheck.setlessonsisread(position,0,"fizik");
                            break;
                        case "shimi":
                            dataBaseCheck.setlessonsisread(position,0,"shimi");
                            break;
                        case "zist":
                            dataBaseCheck.setlessonsisread(position,0,"zist");
                            break;
                        case "fonon":
                            dataBaseCheck.setlessonsisread(position,0,"fonon");
                            break;
                        case "riazie":
                            dataBaseCheck.setlessonsisread(position,0,"riazie");
                            break;
                        case "tari":
                            dataBaseCheck.setlessonsisread(position,0,"tari");
                            break;
                        case "jame":
                            dataBaseCheck.setlessonsisread(position,0,"jame");
                            break;
                        case "jogh":
                            dataBaseCheck.setlessonsisread(position,0,"jogh");
                            break;
                        case "egh":
                            dataBaseCheck.setlessonsisread(position,0,"egh");
                            break;
                        case "mant":
                            dataBaseCheck.setlessonsisread(position,0,"mant");
                            break;


                            // --- 11 --- //
                        case "farsi_11":
                            dataBaseCheck.setlessonsisread(position,0,"farsi_11");
                            break;
                        case "arabi_11":
                            dataBaseCheck.setlessonsisread(position,0,"arabi_11");
                            break;
                        case "dini_11":
                            dataBaseCheck.setlessonsisread(position,0,"dini_11");
                            break;
                        case "zaban_11":
                            dataBaseCheck.setlessonsisread(position,0,"zaban_11");
                            break;
                        case "riazi_11":
                            dataBaseCheck.setlessonsisread(position,0,"riazi_11");
                            break;
                        case "hendese_11":
                            dataBaseCheck.setlessonsisread(position,0,"hendese_11");
                            break;
                        case "fizik_11":
                            dataBaseCheck.setlessonsisread(position,0,"fizik_11");
                            break;
                        case "amar_11":
                            dataBaseCheck.setlessonsisread(position,0,"amar_11");
                            break;
                        case "riazit_11":
                            dataBaseCheck.setlessonsisread(position,0,"riazit_11");
                            break;
                        case "zist_11":
                            dataBaseCheck.setlessonsisread(position,0,"zist_11");
                            break;
                        case "dinie_11":
                            dataBaseCheck.setlessonsisread(position,0,"dinie_11");
                            break;
                        case "fonon_11":
                            dataBaseCheck.setlessonsisread(position,0,"fonon_11");
                            break;
                        case "riazie_11":
                            dataBaseCheck.setlessonsisread(position,0,"riazie_11");
                            break;
                        case "tari_11":
                            dataBaseCheck.setlessonsisread(position,0,"tari_11");
                            break;
                        case "jame_11":
                            dataBaseCheck.setlessonsisread(position,0,"jame_11");
                            break;
                        case "jogh_11":
                            dataBaseCheck.setlessonsisread(position,0,"jogh_11");
                            break;
                        case "ravan_11":
                            dataBaseCheck.setlessonsisread(position,0,"ravan_11");
                            break;
                        case "fals_11":
                            dataBaseCheck.setlessonsisread(position,0,"fals_11");
                            break;

                        // --- 12 --- //
                        case "farsi_12":
                            dataBaseCheck.setlessonsisread(position,0,"farsi_12");
                            break;
                        case "arabi_12":
                            dataBaseCheck.setlessonsisread(position,0,"arabi_12");
                            break;
                        case "dini_12":
                            dataBaseCheck.setlessonsisread(position,0,"dini_12");
                            break;
                        case "zaban_12":
                            dataBaseCheck.setlessonsisread(position,0,"zaban_12");
                            break;
                        case "hesab_12":
                            dataBaseCheck.setlessonsisread(position,0,"riazi_12");
                            break;
                        case "hendese_12":
                            dataBaseCheck.setlessonsisread(position,0,"hendese_12");
                            break;
                        case "fizik_12":
                            dataBaseCheck.setlessonsisread(position,0,"fizik_12");
                            break;
                        case "gosas_12":
                            dataBaseCheck.setlessonsisread(position,0,"gosas_12");
                            break;
                        case "riazit_12":
                            dataBaseCheck.setlessonsisread(position,0,"riazit_12");
                            break;
                        case "zist_12":
                            dataBaseCheck.setlessonsisread(position,0,"zist_12");
                            break;
                        case "fizikt_12":
                            dataBaseCheck.setlessonsisread(position,0,"fizikt_12");
                            break;
                        case "fonon_12":
                            dataBaseCheck.setlessonsisread(position,0,"fonon_12");
                            break;
                        case "riazie_12":
                            dataBaseCheck.setlessonsisread(position,0,"riazie_12");
                            break;
                        case "tari_12":
                            dataBaseCheck.setlessonsisread(position,0,"tari_12");
                            break;
                        case "jame_12":
                            dataBaseCheck.setlessonsisread(position,0,"jame_12");
                            break;
                        case "jogh_12":
                            dataBaseCheck.setlessonsisread(position,0,"jogh_12");
                            break;
                        case "fals_12":
                            dataBaseCheck.setlessonsisread(position,0,"fals_12");
                            break;

                    }

                } else {
                    arrayList.get(pos).setIsRead(1);
                    holder.checkBox1.setChecked(true);
                    switch (name){
                        case "farsi":
                            dataBaseCheck.setlessonsisread(position,1,"farsi");
                            break;
                        case "arabi":
                            dataBaseCheck.setlessonsisread(position,1,"arabi");
                            break;
                        case "dini":
                            dataBaseCheck.setlessonsisread(position,1,"dini");
                            break;
                        case "zaban":
                            dataBaseCheck.setlessonsisread(position,1,"zaban");
                            break;
                        case "riazi":
                            dataBaseCheck.setlessonsisread(position,1,"riazi");
                            break;
                        case "hendese":
                            dataBaseCheck.setlessonsisread(position,1,"hendese");
                            break;
                        case "fizik":
                            dataBaseCheck.setlessonsisread(position,1,"fizik");
                            break;
                        case "shimi":
                            dataBaseCheck.setlessonsisread(position,1,"shimi");
                            break;
                        case "zist":
                            dataBaseCheck.setlessonsisread(position,1,"zist");
                            break;
                        case "fonon":
                            dataBaseCheck.setlessonsisread(position,1,"fonon");
                            break;
                        case "riazie":
                            dataBaseCheck.setlessonsisread(position,1,"riazie");
                            break;
                        case "tari":
                            dataBaseCheck.setlessonsisread(position,1,"tari");
                            break;
                        case "jame":
                            dataBaseCheck.setlessonsisread(position,1,"jame");
                            break;
                        case "jogh":
                            dataBaseCheck.setlessonsisread(position,1,"jogh");
                            break;
                        case "egh":
                            dataBaseCheck.setlessonsisread(position,1,"egh");
                            break;
                        case "mant":
                            dataBaseCheck.setlessonsisread(position,1,"mant");
                            break;

                            // --- 11 --- //
                        case "farsi_11":
                            dataBaseCheck.setlessonsisread(position,1,"farsi_11");
                            break;
                        case "arabi_11":
                            dataBaseCheck.setlessonsisread(position,1,"arabi_11");
                            break;
                        case "dini_11":
                            dataBaseCheck.setlessonsisread(position,1,"dini_11");
                            break;
                        case "zaban_11":
                            dataBaseCheck.setlessonsisread(position,1,"zaban_11");
                            break;
                        case "riazi_11":
                            dataBaseCheck.setlessonsisread(position,1,"riazi_11");
                            break;
                        case "hendese_11":
                            dataBaseCheck.setlessonsisread(position,1,"hendese_11");
                            break;
                        case "fizik_11":
                            dataBaseCheck.setlessonsisread(position,1,"fizik_11");
                            break;
                        case "shimi_11":
                            dataBaseCheck.setlessonsisread(position,1,"shimi_11");
                            break;
                        case "amar_11":
                            dataBaseCheck.setlessonsisread(position,1,"amar_11");
                            break;
                        case "riazit_11":
                            dataBaseCheck.setlessonsisread(position,1,"riazit_11");
                            break;
                        case "zist_11":
                            dataBaseCheck.setlessonsisread(position,1,"zist_11");
                            break;
                        case "dinie_11":
                            dataBaseCheck.setlessonsisread(position,1,"dinie_11");
                            break;
                        case "fonon_11":
                            dataBaseCheck.setlessonsisread(position,1,"fonon_11");
                            break;
                        case "riazie_11":
                            dataBaseCheck.setlessonsisread(position,1,"riazie_11");
                            break;
                        case "tari_11":
                            dataBaseCheck.setlessonsisread(position,1,"tari_11");
                            break;
                        case "jame_11":
                            dataBaseCheck.setlessonsisread(position,1,"jame_11");
                            break;
                        case "jogh_11":
                            dataBaseCheck.setlessonsisread(position,1,"jogh_11");
                            break;
                        case "ravan_11":
                            dataBaseCheck.setlessonsisread(position,1,"ravan_11");
                            break;
                        case "fals_11":
                            dataBaseCheck.setlessonsisread(position,1,"fals_11");
                            break;

                        // --- 12 --- //
                        case "farsi_12":
                            dataBaseCheck.setlessonsisread(position,1,"farsi_12");
                            break;
                        case "arabi_12":
                            dataBaseCheck.setlessonsisread(position,1,"arabi_12");
                            break;
                        case "dini_12":
                            dataBaseCheck.setlessonsisread(position,1,"dini_12");
                            break;
                        case "zaban_12":
                            dataBaseCheck.setlessonsisread(position,1,"zaban_12");
                            break;
                        case "riazi_12":
                            dataBaseCheck.setlessonsisread(position,1,"riazi_12");
                            break;
                        case "hendese_12":
                            dataBaseCheck.setlessonsisread(position,1,"hendese_12");
                            break;
                        case "fizik_12":
                            dataBaseCheck.setlessonsisread(position,1,"fizik_12");
                            break;
                        case "shimi_12":
                            dataBaseCheck.setlessonsisread(position,1,"shimi_12");
                            break;
                        case "gosas_12":
                            dataBaseCheck.setlessonsisread(position,1,"gosas_12");
                            break;
                        case "riazit_12":
                            dataBaseCheck.setlessonsisread(position,1,"riazit_12");
                            break;
                        case "zist_12":
                            dataBaseCheck.setlessonsisread(position,1,"zist_12");
                            break;
                        case "fizikt_12":
                            dataBaseCheck.setlessonsisread(position,1,"fizikt_12");
                            break;
                        case "fonon_12":
                            dataBaseCheck.setlessonsisread(position,1,"fonon_12");
                            break;
                        case "riazie_12":
                            dataBaseCheck.setlessonsisread(position,1,"riazie_12");
                            break;
                        case "tari_12":
                            dataBaseCheck.setlessonsisread(position,1,"tari_12");
                            break;
                        case "jame_12":
                            dataBaseCheck.setlessonsisread(position,1,"jame_12");
                            break;
                        case "jogh_12":
                            dataBaseCheck.setlessonsisread(position,1,"jogh_12");
                            break;
                        case "fals_12":
                            dataBaseCheck.setlessonsisread(position,1,"fals_12");
                            break;
                    }
                }
            }
        });

        holder.checkBox2.setTag(position);
        holder.checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notifyItemChanged(position);

                int pos = (Integer) holder.checkBox2.getTag();

                if (arrayList.get(pos).getIssum() == 1) {
                    arrayList.get(pos).setIssum(0);
                    holder.checkBox2.setChecked(false);
                    switch (name){
                        case "farsi":
                            dataBaseCheck.setlessonsisSum(position,0,"farsi");
                            break;
                        case "arabi":
                            dataBaseCheck.setlessonsisSum(position,0,"arabi");
                            break;
                        case "dini":
                            dataBaseCheck.setlessonsisSum(position,0,"dini");
                            break;
                        case "zaban":
                            dataBaseCheck.setlessonsisSum(position,0,"zaban");
                            break;
                        case "riazi":
                            dataBaseCheck.setlessonsisSum(position,0,"riazi");
                            break;
                        case "hendese":
                            dataBaseCheck.setlessonsisSum(position,0,"hendese");
                            break;
                        case "fizik":
                            dataBaseCheck.setlessonsisSum(position,0,"fizik");
                            break;
                        case "shimi":
                            dataBaseCheck.setlessonsisSum(position,0,"shimi");
                            break;
                        case "zist":
                            dataBaseCheck.setlessonsisSum(position,0,"zist");
                            break;
                        case "fonon":
                            dataBaseCheck.setlessonsisSum(position,0,"fonon");
                            break;
                        case "riazie":
                            dataBaseCheck.setlessonsisSum(position,0,"riazie");
                            break;
                        case "tari":
                            dataBaseCheck.setlessonsisSum(position,0,"tari");
                            break;
                        case "jame":
                            dataBaseCheck.setlessonsisSum(position,0,"jame");
                            break;
                        case "jogh":
                            dataBaseCheck.setlessonsisSum(position,0,"jogh");
                            break;
                        case "egh":
                            dataBaseCheck.setlessonsisSum(position,0,"egh");
                            break;
                        case "mant":
                            dataBaseCheck.setlessonsisSum(position,0,"mant");
                            break;


                            // --- 11 --- //
                        case "farsi_11":
                            dataBaseCheck.setlessonsisSum(position,0,"farsi_11");
                            break;
                        case "arabi_11":
                            dataBaseCheck.setlessonsisSum(position,0,"arabi_11");
                            break;
                        case "dini_11":
                            dataBaseCheck.setlessonsisSum(position,0,"dini_11");
                            break;
                        case "zaban_11":
                            dataBaseCheck.setlessonsisSum(position,0,"zaban_11");
                            break;
                        case "riazi_11":
                            dataBaseCheck.setlessonsisSum(position,0,"riazi_11");
                            break;
                        case "hendese_11":
                            dataBaseCheck.setlessonsisSum(position,0,"hendese_11");
                            break;
                        case "fizik_11":
                            dataBaseCheck.setlessonsisSum(position,0,"fizik_11");
                            break;
                        case "shimi_11":
                            dataBaseCheck.setlessonsisSum(position,0,"shimi_11");
                            break;
                        case "amar_11":
                            dataBaseCheck.setlessonsisSum(position,0,"amar_11");
                            break;
                        case "riazit_11":
                            dataBaseCheck.setlessonsisSum(position,0,"riazit_11");
                            break;
                        case "zist_11":
                            dataBaseCheck.setlessonsisSum(position,0,"zist_11");
                            break;
                        case "dinie_11":
                            dataBaseCheck.setlessonsisSum(position,0,"dinie_11");
                            break;
                        case "fonon_11":
                            dataBaseCheck.setlessonsisSum(position,0,"fonon_11");
                            break;
                        case "riazie_11":
                            dataBaseCheck.setlessonsisSum(position,0,"riazie_11");
                            break;
                        case "tari_11":
                            dataBaseCheck.setlessonsisSum(position,0,"tari_11");
                            break;
                        case "jame_11":
                            dataBaseCheck.setlessonsisSum(position,0,"jame_11");
                            break;
                        case "jogh_11":
                            dataBaseCheck.setlessonsisSum(position,0,"jogh_11");
                            break;
                        case "ravan_11":
                            dataBaseCheck.setlessonsisSum(position,0,"ravan_11");
                            break;
                        case "fals_11":
                            dataBaseCheck.setlessonsisSum(position,0,"fals_11");
                            break;

                        // --- 12 --- //
                        case "farsi_12":
                            dataBaseCheck.setlessonsisSum(position,0,"farsi_12");
                            break;
                        case "arabi_12":
                            dataBaseCheck.setlessonsisSum(position,0,"arabi_12");
                            break;
                        case "dini_12":
                            dataBaseCheck.setlessonsisSum(position,0,"dini_12");
                            break;
                        case "zaban_12":
                            dataBaseCheck.setlessonsisSum(position,0,"zaban_12");
                            break;
                        case "hesab_12":
                            dataBaseCheck.setlessonsisSum(position,0,"riazi_12");
                            break;
                        case "hendese_12":
                            dataBaseCheck.setlessonsisSum(position,0,"hendese_12");
                            break;
                        case "fizik_12":
                            dataBaseCheck.setlessonsisSum(position,0,"fizik_12");
                            break;
                        case "shimi_12":
                            dataBaseCheck.setlessonsisSum(position,0,"shimi_12");
                            break;
                        case "gosas_12":
                            dataBaseCheck.setlessonsisSum(position,0,"gosas_12");
                            break;
                        case "riazit_12":
                            dataBaseCheck.setlessonsisSum(position,0,"riazit_12");
                            break;
                        case "zist_12":
                            dataBaseCheck.setlessonsisSum(position,0,"zist_12");
                            break;
                        case "fizikt_12":
                            dataBaseCheck.setlessonsisSum(position,0,"fizikt_12");
                            break;
                        case "fonon_12":
                            dataBaseCheck.setlessonsisSum(position,0,"fonon_12");
                            break;
                        case "riazie_12":
                            dataBaseCheck.setlessonsisSum(position,0,"riazie_12");
                            break;
                        case "tari_12":
                            dataBaseCheck.setlessonsisSum(position,0,"tari_12");
                            break;
                        case "jame_12":
                            dataBaseCheck.setlessonsisSum(position,0,"jame_12");
                            break;
                        case "jogh_12":
                            dataBaseCheck.setlessonsisSum(position,0,"jogh_12");
                            break;
                        case "fals_12":
                            dataBaseCheck.setlessonsisSum(position,0,"fals_12");
                            break;
                    }
                } else {
                    arrayList.get(pos).setIssum(1);
                    holder.checkBox2.setChecked(true);
                    switch (name){
                        case "farsi":
                            dataBaseCheck.setlessonsisSum(position,1,"farsi");
                            break;
                        case "arabi":
                            dataBaseCheck.setlessonsisSum(position,1,"arabi");
                            break;
                        case "dini":
                            dataBaseCheck.setlessonsisSum(position,1,"dini");
                            break;
                        case "zaban":
                            dataBaseCheck.setlessonsisSum(position,1,"zaban");
                            break;
                        case "riazi":
                            dataBaseCheck.setlessonsisSum(position,1,"riazi");
                            break;
                        case "hendese":
                            dataBaseCheck.setlessonsisSum(position,1,"hendese");
                            break;
                        case "fizik":
                            dataBaseCheck.setlessonsisSum(position,1,"fizik");
                            break;
                        case "shimi":
                            dataBaseCheck.setlessonsisSum(position,1,"shimi");
                            break;
                        case "zist":
                            dataBaseCheck.setlessonsisSum(position,1,"zist");
                            break;
                        case "fonon":
                            dataBaseCheck.setlessonsisSum(position,1,"fonon");
                            break;
                        case "riazie":
                            dataBaseCheck.setlessonsisSum(position,1,"riazie");
                            break;
                        case "tari":
                            dataBaseCheck.setlessonsisSum(position,1,"tari");
                            break;
                        case "jame":
                            dataBaseCheck.setlessonsisSum(position,1,"jame");
                            break;
                        case "jogh":
                            dataBaseCheck.setlessonsisSum(position,1,"jogh");
                            break;
                        case "egh":
                            dataBaseCheck.setlessonsisSum(position,1,"egh");
                            break;
                        case "mant":
                            dataBaseCheck.setlessonsisSum(position,1,"mant");
                            break;

                            // ---- 11 ---- //
                        case "farsi_11":
                            dataBaseCheck.setlessonsisSum(position,1,"farsi_11");
                            break;
                        case "arabi_11":
                            dataBaseCheck.setlessonsisSum(position,1,"arabi_11");
                            break;
                        case "dini_11":
                            dataBaseCheck.setlessonsisSum(position,1,"dini_11");
                            break;
                        case "zaban_11":
                            dataBaseCheck.setlessonsisSum(position,1,"zaban_11");
                            break;
                        case "riazi_11":
                            dataBaseCheck.setlessonsisSum(position,1,"riazi_11");
                            break;
                        case "hendese_11":
                            dataBaseCheck.setlessonsisSum(position,1,"hendese_11");
                            break;
                        case "fizik_11":
                            dataBaseCheck.setlessonsisSum(position,1,"fizik_11");
                            break;
                        case "shimi_11":
                            dataBaseCheck.setlessonsisSum(position,1,"shimi_11");
                            break;
                        case "amar_11":
                            dataBaseCheck.setlessonsisSum(position,1,"amar_11");
                            break;
                        case "riazit_11":
                            dataBaseCheck.setlessonsisSum(position,1,"riazit_11");
                            break;
                        case "zist_11":
                            dataBaseCheck.setlessonsisSum(position,1,"zist_11");
                            break;
                        case "dinie_11":
                            dataBaseCheck.setlessonsisSum(position,1,"dinie_11");
                            break;
                        case "fonon_11":
                            dataBaseCheck.setlessonsisSum(position,1,"fonon_11");
                            break;
                        case "riazie_11":
                            dataBaseCheck.setlessonsisSum(position,1,"riazie_11");
                            break;
                        case "tari_11":
                            dataBaseCheck.setlessonsisSum(position,1,"tari_11");
                            break;
                        case "jame_11":
                            dataBaseCheck.setlessonsisSum(position,1,"jame_11");
                            break;
                        case "jogh_11":
                            dataBaseCheck.setlessonsisSum(position,1,"jogh_11");
                            break;
                        case "ravan_11":
                            dataBaseCheck.setlessonsisSum(position,1,"ravan_11");
                            break;
                        case "fals_11":
                            dataBaseCheck.setlessonsisSum(position,1,"fals_11");
                            break;

                        // ---- 12 ---- //
                        case "farsi_12":
                            dataBaseCheck.setlessonsisSum(position,1,"farsi_12");
                            break;
                        case "arabi_12":
                            dataBaseCheck.setlessonsisSum(position,1,"arabi_12");
                            break;
                        case "dini_12":
                            dataBaseCheck.setlessonsisSum(position,1,"dini_12");
                            break;
                        case "zaban_12":
                            dataBaseCheck.setlessonsisSum(position,1,"zaban_12");
                            break;
                        case "hesab_12":
                            dataBaseCheck.setlessonsisSum(position,1,"riazi_12");
                            break;
                        case "hendese_12":
                            dataBaseCheck.setlessonsisSum(position,1,"hendese_12");
                            break;
                        case "fizik_12":
                            dataBaseCheck.setlessonsisSum(position,1,"fizik_12");
                            break;
                        case "shimi_12":
                            dataBaseCheck.setlessonsisSum(position,1,"shimi_12");
                            break;
                        case "gosas_12":
                            dataBaseCheck.setlessonsisSum(position,1,"gosas_12");
                            break;
                        case "riazit_12":
                            dataBaseCheck.setlessonsisSum(position,1,"riazit_12");
                            break;
                        case "zist_12":
                            dataBaseCheck.setlessonsisSum(position,1,"zist_12");
                            break;
                        case "fizikt_12":
                            dataBaseCheck.setlessonsisSum(position,1,"fizikt_12");
                            break;
                        case "fonon_12":
                            dataBaseCheck.setlessonsisSum(position,1,"fonon_12");
                            break;
                        case "riazie_12":
                            dataBaseCheck.setlessonsisSum(position,1,"riazie_12");
                            break;
                        case "tari_12":
                            dataBaseCheck.setlessonsisSum(position,1,"tari_12");
                            break;
                        case "jame_12":
                            dataBaseCheck.setlessonsisSum(position,1,"jame_12");
                            break;
                        case "jogh_12":
                            dataBaseCheck.setlessonsisSum(position,1,"jogh_12");
                            break;
                        case "fals_12":
                            dataBaseCheck.setlessonsisSum(position,1,"fals_12");
                            break;

                    }
                }
            }
        });

        holder.checkBox3.setTag(position);
        holder.checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notifyItemChanged(position);

                int pos = (Integer) holder.checkBox3.getTag();

                if (arrayList.get(pos).getTest() == 1) {
                    arrayList.get(pos).setTest(0);
                    holder.checkBox3.setChecked(false);
                    switch (name){
                        case "farsi":
                            dataBaseCheck.setlessonsisTest(position,0,"farsi");
                            break;
                        case "arabi":
                            dataBaseCheck.setlessonsisTest(position,0,"arabi");
                            break;
                        case "dini":
                            dataBaseCheck.setlessonsisTest(position,0,"dini");
                            break;
                        case "zaban":
                            dataBaseCheck.setlessonsisTest(position,0,"zaban");
                            break;
                        case "riazi":
                            dataBaseCheck.setlessonsisTest(position,0,"riazi");
                            break;
                        case "hendese":
                            dataBaseCheck.setlessonsisTest(position,0,"hendese");
                            break;
                        case "fizik":
                            dataBaseCheck.setlessonsisTest(position,0,"fizik");
                            break;
                        case "shimi":
                            dataBaseCheck.setlessonsisTest(position,0,"shimi");
                            break;
                        case "zist":
                            dataBaseCheck.setlessonsisTest(position,0,"zist");
                            break;
                        case "fonon":
                            dataBaseCheck.setlessonsisTest(position,0,"fonon");
                            break;
                        case "riazie":
                            dataBaseCheck.setlessonsisTest(position,0,"riazie");
                            break;
                        case "tari":
                            dataBaseCheck.setlessonsisTest(position,0,"tari");
                            break;
                        case "jame":
                            dataBaseCheck.setlessonsisTest(position,0,"jame");
                            break;
                        case "jogh":
                            dataBaseCheck.setlessonsisTest(position,0,"jogh");
                            break;
                        case "egh":
                            dataBaseCheck.setlessonsisTest(position,0,"egh");
                            break;
                        case "mant":
                            dataBaseCheck.setlessonsisTest(position,0,"mant");
                            break;

                            // --- 11 --- //
                        case "farsi_11":
                            dataBaseCheck.setlessonsisTest(position,0,"farsi_11");
                            break;
                        case "arabi_11":
                            dataBaseCheck.setlessonsisTest(position,0,"arabi_11");
                            break;
                        case "dini_11":
                            dataBaseCheck.setlessonsisTest(position,0,"dini_11");
                            break;
                        case "zaban_11":
                            dataBaseCheck.setlessonsisTest(position,0,"zaban_11");
                            break;
                        case "riazi_11":
                            dataBaseCheck.setlessonsisTest(position,0,"riazi_11");
                            break;
                        case "hendese_11":
                            dataBaseCheck.setlessonsisTest(position,0,"hendese_11");
                            break;
                        case "fizik_11":
                            dataBaseCheck.setlessonsisTest(position,0,"fizik_11");
                            break;
                        case "shimi_11":
                            dataBaseCheck.setlessonsisTest(position,0,"shimi_11");
                            break;
                        case "amar_11":
                            dataBaseCheck.setlessonsisTest(position,0,"amar_11");
                            break;
                        case "riazit_11":
                            dataBaseCheck.setlessonsisTest(position,0,"riazit_11");
                            break;
                        case "zist_11":
                            dataBaseCheck.setlessonsisTest(position,0,"zist_11");
                            break;
                        case "dinie_11":
                            dataBaseCheck.setlessonsisTest(position,0,"dinie_11");
                            break;
                        case "fonon_11":
                            dataBaseCheck.setlessonsisTest(position,0,"fonon_11");
                            break;
                        case "riazie_11":
                            dataBaseCheck.setlessonsisTest(position,0,"riazie_11");
                            break;
                        case "tari_11":
                            dataBaseCheck.setlessonsisTest(position,0,"tari_11");
                            break;
                        case "jame_11":
                            dataBaseCheck.setlessonsisTest(position,0,"jame_11");
                            break;
                        case "jogh_11":
                            dataBaseCheck.setlessonsisTest(position,0,"jogh_11");
                            break;
                        case "ravan_11":
                            dataBaseCheck.setlessonsisTest(position,0,"ravan_11");
                            break;
                        case "fals_11":
                            dataBaseCheck.setlessonsisTest(position,0,"fals_11");
                            break;

                        // --- 12 --- //
                        case "farsi_12":
                            dataBaseCheck.setlessonsisTest(position,0,"farsi_12");
                            break;
                        case "arabi_12":
                            dataBaseCheck.setlessonsisTest(position,0,"arabi_12");
                            break;
                        case "dini_12":
                            dataBaseCheck.setlessonsisTest(position,0,"dini_12");
                            break;
                        case "zaban_12":
                            dataBaseCheck.setlessonsisTest(position,0,"zaban_12");
                            break;
                        case "riazi_12":
                            dataBaseCheck.setlessonsisTest(position,0,"riazi_12");
                            break;
                        case "hendese_12":
                            dataBaseCheck.setlessonsisTest(position,0,"hendese_12");
                            break;
                        case "fizik_12":
                            dataBaseCheck.setlessonsisTest(position,0,"fizik_12");
                            break;
                        case "shimi_12":
                            dataBaseCheck.setlessonsisTest(position,0,"shimi_12");
                            break;
                        case "gosas_12":
                            dataBaseCheck.setlessonsisTest(position,0,"gosas_12");
                            break;
                        case "riazit_12":
                            dataBaseCheck.setlessonsisTest(position,0,"riazit_12");
                            break;
                        case "zist_12":
                            dataBaseCheck.setlessonsisTest(position,0,"zist_12");
                            break;
                        case "fizikt_12":
                            dataBaseCheck.setlessonsisTest(position,0,"fizikt_12");
                            break;
                        case "fonon_12":
                            dataBaseCheck.setlessonsisTest(position,0,"fonon_12");
                            break;
                        case "riazie_12":
                            dataBaseCheck.setlessonsisTest(position,0,"riazie_12");
                            break;
                        case "tari_12":
                            dataBaseCheck.setlessonsisTest(position,0,"tari_12");
                            break;
                        case "jame_12":
                            dataBaseCheck.setlessonsisTest(position,0,"jame_12");
                            break;
                        case "jogh_12":
                            dataBaseCheck.setlessonsisTest(position,0,"jogh_12");
                            break;
                        case "fals_12":
                            dataBaseCheck.setlessonsisTest(position,0,"fals_12");
                            break;
                    }
                } else {
                    arrayList.get(pos).setTest(1);
                    holder.checkBox3.setChecked(true);
                    switch (name){
                        case "farsi":
                            dataBaseCheck.setlessonsisTest(position,1,"farsi");
                            break;
                        case "arabi":
                            dataBaseCheck.setlessonsisTest(position,1,"arabi");
                            break;
                        case "dini":
                            dataBaseCheck.setlessonsisTest(position,1,"dini");
                            break;
                        case "zaban":
                            dataBaseCheck.setlessonsisTest(position,1,"zaban");
                            break;
                        case "riazi":
                            dataBaseCheck.setlessonsisTest(position,1,"riazi");
                            break;
                        case "hendese":
                            dataBaseCheck.setlessonsisTest(position,1,"hendese");
                            break;
                        case "fizik":
                            dataBaseCheck.setlessonsisTest(position,1,"fizik");
                            break;
                        case "shimi":
                            dataBaseCheck.setlessonsisTest(position,1,"shimi");
                            break;
                        case "zist":
                            dataBaseCheck.setlessonsisTest(position,1,"zist");
                            break;
                        case "fonon":
                            dataBaseCheck.setlessonsisTest(position,1,"fonon");
                            break;
                        case "riazie":
                            dataBaseCheck.setlessonsisTest(position,1,"riazie");
                            break;
                        case "tari":
                            dataBaseCheck.setlessonsisTest(position,1,"tari");
                            break;
                        case "jame":
                            dataBaseCheck.setlessonsisTest(position,1,"jame");
                            break;
                        case "jogh":
                            dataBaseCheck.setlessonsisTest(position,1,"jogh");
                            break;
                        case "egh":
                            dataBaseCheck.setlessonsisTest(position,1,"egh");
                            break;
                        case "mant":
                            dataBaseCheck.setlessonsisTest(position,1,"mant");
                            break;


                            // --- 11 --- //
                        case "farsi_11":
                            dataBaseCheck.setlessonsisTest(position,1,"farsi_11");
                            break;
                        case "arabi_11":
                            dataBaseCheck.setlessonsisTest(position,1,"arabi_11");
                            break;
                        case "dini_11":
                            dataBaseCheck.setlessonsisTest(position,1,"dini_11");
                            break;
                        case "zaban_11":
                            dataBaseCheck.setlessonsisTest(position,1,"zaban_11");
                            break;
                        case "riazi_11":
                            dataBaseCheck.setlessonsisTest(position,1,"riazi_11");
                            break;
                        case "hendese_11":
                            dataBaseCheck.setlessonsisTest(position,1,"hendese_11");
                            break;
                        case "fizik_11":
                            dataBaseCheck.setlessonsisTest(position,1,"fizik_11");
                            break;
                        case "shimi_11":
                            dataBaseCheck.setlessonsisTest(position,1,"shimi_11");
                            break;
                        case "amar_11":
                            dataBaseCheck.setlessonsisTest(position,1,"amar_11");
                            break;
                        case "riazit_11":
                            dataBaseCheck.setlessonsisTest(position,1,"riazit_11");
                            break;
                        case "zist_11":
                            dataBaseCheck.setlessonsisTest(position,1,"zist_11");
                            break;
                        case "dinie_11":
                            dataBaseCheck.setlessonsisTest(position,1,"dinie_11");
                            break;
                        case "fonon_11":
                            dataBaseCheck.setlessonsisTest(position,1,"fonon_11");
                            break;
                        case "riazie_11":
                            dataBaseCheck.setlessonsisTest(position,1,"riazie_11");
                            break;
                        case "tari_11":
                            dataBaseCheck.setlessonsisTest(position,1,"tari_11");
                            break;
                        case "jame_11":
                            dataBaseCheck.setlessonsisTest(position,1,"jame_11");
                            break;
                        case "jogh_11":
                            dataBaseCheck.setlessonsisTest(position,1,"jogh_11");
                            break;
                        case "ravan_11":
                            dataBaseCheck.setlessonsisTest(position,1,"ravan_11");
                            break;
                        case "fals_11":
                            dataBaseCheck.setlessonsisTest(position,1,"fals_11");
                            break;

                        // --- 12 --- //
                        case "farsi_12":
                            dataBaseCheck.setlessonsisTest(position,1,"farsi_12");
                            break;
                        case "arabi_12":
                            dataBaseCheck.setlessonsisTest(position,1,"arabi_12");
                            break;
                        case "dini_12":
                            dataBaseCheck.setlessonsisTest(position,1,"dini_12");
                            break;
                        case "zaban_12":
                            dataBaseCheck.setlessonsisTest(position,1,"zaban_12");
                            break;
                        case "riazi_12":
                            dataBaseCheck.setlessonsisTest(position,1,"riazi_12");
                            break;
                        case "hendese_12":
                            dataBaseCheck.setlessonsisTest(position,1,"hendese_12");
                            break;
                        case "fizik_12":
                            dataBaseCheck.setlessonsisTest(position,1,"fizik_12");
                            break;
                        case "shimi_12":
                            dataBaseCheck.setlessonsisTest(position,1,"shimi_12");
                            break;
                        case "gosas_12":
                            dataBaseCheck.setlessonsisTest(position,1,"gosas_12");
                            break;
                        case "riazit_12":
                            dataBaseCheck.setlessonsisTest(position,1,"riazit_12");
                            break;
                        case "zist_12":
                            dataBaseCheck.setlessonsisTest(position,1,"zist_12");
                            break;
                        case "fizikt_12":
                            dataBaseCheck.setlessonsisTest(position,1,"fizikt_12");
                            break;
                        case "fonon_12":
                            dataBaseCheck.setlessonsisTest(position,1,"fonon_12");
                            break;
                        case "riazie_12":
                            dataBaseCheck.setlessonsisTest(position,1,"riazie_12");
                            break;
                        case "tari_12":
                            dataBaseCheck.setlessonsisTest(position,1,"tari_12");
                            break;
                        case "jame_12":
                            dataBaseCheck.setlessonsisTest(position,1,"jame_12");
                            break;
                        case "jogh_12":
                            dataBaseCheck.setlessonsisTest(position,1,"jogh_12");
                            break;
                        case "fals_12":
                            dataBaseCheck.setlessonsisTest(position,1,"fals_12");
                            break;
                    }
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        protected CheckBox checkBox1 , checkBox2 , checkBox3 ;
        protected TextView lesson;

        public MyViewHolder(View itemView) {
            super(itemView);
            checkBox1 = (CheckBox) itemView.findViewById(R.id.cb_isread);
            checkBox2 = (CheckBox) itemView.findViewById(R.id.cb_issum);
            checkBox3 = (CheckBox) itemView.findViewById(R.id.cb_test);
            lesson = itemView.findViewById(R.id.lesson_name);
        }
    }

}
