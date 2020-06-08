package com.zcj924.leapyear;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCacl_Clicked(View v) {
        TextView editTextYear = (TextView) findViewById(R.id.editTextYear);
        TextView textViewResult = (TextView) findViewById(R.id.textViewResult);

        if (TextUtils.isEmpty(editTextYear.getText())) {
            editTextYear.setBackgroundColor(Color.RED);//判断为空设置红色背景
            editTextYear.setHint("请!输!入!年!份");
        } else {
            int year = Integer.parseInt(editTextYear.getText().toString());
            if (year <= 0) {
                editTextYear.setBackgroundColor(Color.RED);//判断为空设置红色背景
                textViewResult.setText("您就是大远古人");
            }
            else if (year > 3000) {
                editTextYear.setBackgroundColor(Color.RED);//判断为空设置红色背景
                textViewResult.setText("未  来  人  类");
            }else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                editTextYear.setBackgroundColor(Color.TRANSPARENT);
                textViewResult.setText("闰年");
            } else {
                editTextYear.setBackgroundColor(Color.TRANSPARENT);
                textViewResult.setText("不是闰年");
            }
        }
    }
}

