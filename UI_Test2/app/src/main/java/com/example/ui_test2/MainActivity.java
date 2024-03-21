package com.example.ui_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnclick(View view){
        EditText editname=findViewById(R.id.editname);
        String message=editname.getText().toString();
        Intent intent=new Intent(this, second.class);
        intent.putExtra("text",message);
        startActivity(intent);
    }
}