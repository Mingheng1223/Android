package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lv ;
    private String[]cities;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cities=getResources().getStringArray(R.array.cities);
        lv=findViewById(R.id.listview);

        ArrayAdapter<String>adpList=new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,cities);
        lv.setAdapter(adpList);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView output=findViewById(R.id.lblOutput);
                output.setText("你是住在"+cities[position]);
            }
        });
    }
}