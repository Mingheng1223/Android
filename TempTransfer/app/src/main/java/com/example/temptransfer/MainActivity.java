package com.example.temptransfer;

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
        EditText edittemp=(EditText) findViewById(R.id.editTemp);
        TextView textshow=(TextView) findViewById(R.id.textshow);

        double DegreeC=Double.parseDouble(edittemp.getText().toString());
        double DegreeF=(9.0*DegreeC)/5.0+32.0;
        textshow.setText("華氏溫度:"+String.format("%.2f",DegreeF));
    }
}