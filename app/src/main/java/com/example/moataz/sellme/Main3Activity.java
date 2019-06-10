package com.example.moataz.sellme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity {
    private  String FILE="my_file";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPreferences=getSharedPreferences(FILE,MODE_PRIVATE);
                Boolean b=sharedPreferences.getBoolean("remember",false);
                if (b)
                {
                    Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                    startActivity(intent);
                    finish();

                }
                else
                {
                    Intent intent=new Intent(Main3Activity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        },3000);
    }
}
