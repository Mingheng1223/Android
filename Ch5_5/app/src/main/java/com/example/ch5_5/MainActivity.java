package com.example.ch5_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {

    private TextView txvoutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txvoutput=(TextView) findViewById(R.id.txvOutput);
        txvoutput.setTextSize(25);
        ConstraintLayout layout =(ConstraintLayout) findViewById(R.id.activity_main);
        layout.setOnTouchListener(this);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int act=event.getAction();
        switch(act){
            case MotionEvent.ACTION_DOWN:
                txvoutput.setText("ACTION_DOWN");
                txvoutput.setTextColor(Color.RED);
                break;
            case MotionEvent.ACTION_UP:
                txvoutput.setText("ACTION_UP");
                txvoutput.setTextColor(Color.GREEN);
                break;
            case MotionEvent.ACTION_MOVE:
                txvoutput.setText("ACTION_MOVE");
                txvoutput.setTextColor(Color.BLUE);
                break;
        }
        return true;
    }

}