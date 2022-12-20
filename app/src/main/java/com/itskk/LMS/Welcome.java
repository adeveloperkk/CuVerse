package com.itskk.LMS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_welcome);
        Thread thread=new Thread() {
            @Override
            public void run() {
                try {
                    sleep (2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent=new Intent(Welcome.this, CuVerse.class);
                    startActivity(intent);

                }
            }
        };thread.start();
    }
}