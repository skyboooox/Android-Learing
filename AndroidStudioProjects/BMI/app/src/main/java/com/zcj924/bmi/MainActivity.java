package com.zcj924.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnBmiClc_Clicked(View v){
        EditText editHeight =(EditText)findViewById(R.id.editHeight);
        EditText editWeight =(EditText)findViewById(R.id.editWeight);
        TextView textResult = (TextView)findViewById(R.id.textResult);
        Double height=Double.parseDouble(editHeight.getText().toString());
        Double weight =Double.parseDouble(editWeight.getText().toString());
        Double bmi =weight/(height*height);
        if (bmi<18.5){
            textResult.setText("BMI"+bmi.toString()+"体型过轻");
        }
        else if (bmi<=23.9){
            textResult.setText("BMI"+bmi.toString()+"体型正常");
        }
        else if (bmi<=27){
            textResult.setText("BMI"+bmi.toString()+"体型过重");
        }
        else if (bmi<=32){
            textResult.setText("BMI"+bmi.toString()+"体型肥胖");
        }
        else{
            textResult.setText("BMI"+bmi.toString()+"体型肥肥胖");
        }
    }
}