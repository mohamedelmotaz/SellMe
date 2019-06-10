package com.example.moataz.sellme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
Toolbar toolbar;
TextView logOut,userName,userLogOut;
    private  String FILE="my_file";
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar=findViewById(R.id.toolbar);
        logOut=findViewById(R.id.log_out);
        userName=findViewById(R.id.name);
        tabLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.viewpager);
        userLogOut=findViewById(R.id.user_log);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
tabLayout.setBackgroundColor(Color.parseColor("#EFF0F1"));
        tabLayout.addTab(tabLayout.newTab().setText("vehicles").setIcon(R.drawable.car));
        tabLayout.addTab(tabLayout.newTab().setText("Electronics").setIcon(R.drawable.television));
        tabLayout.addTab(tabLayout.newTab().setText("Fashions").setIcon(R.drawable.shirt));
        ViewAdapter viewAdapter=new ViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(viewAdapter);
        viewPager.addOnPageChangeListener( new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
                SharedPreferences sharedPreferences=getSharedPreferences(FILE,MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("remember",false);
                editor.apply();
            }
        });
        SharedPreferences sharedPreferences=getSharedPreferences(FILE,MODE_PRIVATE);
        userName.setText(sharedPreferences.getString("name","user_name"));
        userLogOut.append(sharedPreferences.getString("name","user_name"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        finish();
    }
}
