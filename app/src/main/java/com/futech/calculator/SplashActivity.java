package com.futech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();

//        textView=findViewById(R.id.textView);
//
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });

        Thread thread=new Thread(){
          public void run(){

              try{
                  sleep(1000);
              }catch (Exception e){
                  e.printStackTrace();
              }
              finally {
                  Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                  startActivity(intent);

              }


          }
        };

        thread.start();

    }
}