package com.example.cool.dental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.cool.dental.data.Common;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3500);
                    String v= Common.getValue(Splash.this);
                    if(v.equalsIgnoreCase("admin")){
                        Intent intent=new Intent(Splash.this,Dashboard.class);
                        startActivity(intent);
                        finish();
                    }
                    else {
                        Intent intent=new Intent(Splash.this,LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        timer.start();
    }
}
