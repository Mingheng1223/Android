package com.example.spinnerdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText opd1,opd2;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opd1=findViewById(R.id.txtOpd1);
        //opd1.setText("100");
        opd2=findViewById(R.id.txtOpd2);
        //opd2.setText("50");
        output=findViewById(R.id.lblOutput);
        Spinner sp=findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int n1,n2;
        double r=0.0;
        try {
            n1=Integer.parseInt(opd1.getText().toString());
            n2=Integer.parseInt(opd2.getText().toString());
            if(position==0){
                r=n1+n2;
            }else if(position==1)
                r=n1-n2;
            else if(position==2)
                r=n1*n2;
            else if(position==3)
                r=n1/n2;
            output.setText("運算結果="+String.format("%.2f",r));
        }catch (NumberFormatException e){
            output.setText("請輸入數字");
            return;
        }catch (ArithmeticException e){
            output.setText("除數不能為0");
        }

//        Switch(position){
//            case 0:
//             r=n1+n2;
//             break;
//            case 1:
//                r=n1-n2;
//                break;
//            case 2:
//                r=n1*n2;
//                break;
//            case 3:
//                r=n1/n2;
//                break;
//        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}