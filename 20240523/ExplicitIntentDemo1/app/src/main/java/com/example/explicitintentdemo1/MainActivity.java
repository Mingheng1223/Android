package com.example.explicitintentdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtC=findViewById(R.id.txtC);
                int tempC=Integer.parseInt(txtC.getText().toString());
                EditText edtplace=findViewById(R.id.edtplace);
                Bundle bundle=new Bundle();
                Intent intent=new Intent(MainActivity.this,FActivity.class);
                bundle.putInt("TEMPC",tempC);
                bundle.putString("PLACE",edtplace.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}