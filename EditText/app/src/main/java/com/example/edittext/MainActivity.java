package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view){
        EditText editText=(EditText) findViewById((R.id.editname));
        TextView textshow=(TextView) findViewById(R.id.textshow);
        String name=editText.getText().toString();
        textshow.setText("你的名字是:"+name);
    }
}