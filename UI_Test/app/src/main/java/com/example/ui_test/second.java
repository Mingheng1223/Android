package com.example.ui_test;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Intent intent=getIntent();
        String getText=intent.getStringExtra("text");
        TextView txtresult=findViewById(R.id.Txtresult);
        txtresult.setText(getText);
    }

}
