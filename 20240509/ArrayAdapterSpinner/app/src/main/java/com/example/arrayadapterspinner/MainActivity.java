package com.example.arrayadapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner drink,temp;
    private TextView txv;
    private String[]temp1={"冰","去冰","溫"};
    private String[]temp2={"冰","去冰"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txv=findViewById(R.id.order);
        temp=findViewById(R.id.temp);

        drink=findViewById(R.id.drink);
        drink.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[]tempset;
                if(position==3)
                    tempset=temp2;
                else
                    tempset=temp1;

                ArrayAdapter<String> tempad=new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_spinner_item,tempset);
                tempad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                temp.setAdapter(tempad);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}