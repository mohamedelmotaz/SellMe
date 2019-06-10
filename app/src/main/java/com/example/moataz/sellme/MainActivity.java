package com.example.moataz.sellme;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private  String FILE="my_file";
    Button login;
CheckBox remeberme;
EditText userName,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intialization();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().length()>0&&password.getText().length()>0)
                {
                    SharedPreferences sharedPreferences=getSharedPreferences(FILE,MODE_PRIVATE);
                    SharedPreferences.Editor editor=sharedPreferences.edit();
                    editor.putString("name",userName.getText().toString());
                    editor.putString("password",password.getText().toString());
                    editor.apply();
                    Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                    finish();

                    }
                    else
                {
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this)
                            .setTitle("login faild")
                            .setMessage("please enter user name and password");
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.create();
                    builder.show();
                }
            }
        });
        remeberme.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences sharedPreferences=getSharedPreferences(FILE,MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putBoolean("remember",isChecked);
                editor.apply();
            }
        });
    }
    public void intialization()
    {
        login=findViewById(R.id.login);
        remeberme=findViewById(R.id.remember_me);
        userName=findViewById(R.id.name);
        password=findViewById(R.id.password);

    }
}
