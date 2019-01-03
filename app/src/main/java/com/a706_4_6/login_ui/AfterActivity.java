package com.a706_4_6.login_ui;

import android.os.Bundle;

import android.support.annotation.Nullable;

import android.support.v7.app.AppCompatActivity;


import android.widget.TextView;



public class AfterActivity extends AppCompatActivity {

    private TextView login_success;


    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_loginafter);

        login_success=findViewById(R.id.login_success);

    }

}
