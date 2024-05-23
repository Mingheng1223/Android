package com.example.alertdialogmultichoicedemo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {
    private  String[] items={"Apple","Samsung","Sony","Asus"};
    private boolean[] itemChecked={false,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSelect=findViewById(R.id.btnSelect);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog build=new AlertDialog.Builder(MainActivity.this)
                        .setTitle("請勾選選項")
                        .setPositiveButton("確定",MainActivity.this)
                        .setNegativeButton("取消",MainActivity.this)
                        .setMultiChoiceItems(items,itemChecked,null)
                        .show();
            }
        });
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        String msg="";
        switch (which){
            case DialogInterface.BUTTON_POSITIVE:
                for (int i=0;i<items.length;i++){
                    if (itemChecked[i])
                        msg+=items[i]+"\n";

                }
                TextView output=findViewById(R.id.lblOutput);
                output.setText(msg);
                break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(this,"按下取消鍵！",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
