package com.example.spinneradapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[]desserts,courses;
    Spinner spCourse,spDesserts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        desserts=getResources().getStringArray(R.array.dessert);
        courses=getResources().getStringArray(R.array.courses);

         spCourse=findViewById(R.id.spinner);
         spDesserts=findViewById(R.id.spinner2);

        ArrayAdapter<String> adpCourse=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,courses);
        ArrayAdapter<String> adpDessert=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,desserts);

        spCourse.setAdapter(adpCourse);
        spDesserts.setAdapter(adpDessert);

        Button btnConfirm=findViewById(R.id.button);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String course=spCourse.getSelectedItem().toString();
                String dessert=spDesserts.getSelectedItem().toString();
                TextView output=findViewById(R.id.lblOutput);
                output.setText("主餐:"+course+"\n甜點:"+dessert);
            }
        });

        Button btnModify=findViewById(R.id.btnModify);

        btnModify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                desserts[4]="草莓蛋糕";
                adpDessert.notifyDataSetChanged();
            }
        });
    }
}