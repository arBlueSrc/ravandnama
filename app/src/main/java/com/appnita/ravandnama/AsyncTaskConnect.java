package com.appnita.ravandnama;

import android.app.ProgressDialog;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


public class AsyncTaskConnect extends AsyncTask {

    public String link="";
    public String number;
    public String name;

    public AsyncTaskConnect(String link,String number,String name){

        this.link=link;
        this.number=number;
        this.name=name;

    }




    @Override
    protected Object doInBackground(Object[] params) {

        try{



            String data=URLEncoder.encode("number","UTF8")+"="+URLEncoder.encode(number,"UTF8");
            data+="&"+URLEncoder.encode("name","UTF8")+"="+URLEncoder.encode(name,"UTF8");

            URL url=new URL(link);
            URLConnection connection=url.openConnection();

            connection.setDoOutput(true);
            OutputStreamWriter writer=new OutputStreamWriter(connection.getOutputStream());
            writer.write(data);
            writer.flush();




            BufferedReader reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder builder=new StringBuilder();

            String line=null;

            while((line=reader.readLine())!=null){
                builder.append(line);

            }

           // ActivityUserSignIn.data=builder.toString();

        }catch (Exception e){

        }
        return "";
    }


}

