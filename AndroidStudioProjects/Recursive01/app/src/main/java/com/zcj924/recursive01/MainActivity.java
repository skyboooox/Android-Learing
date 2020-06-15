package com.zcj924.recursive01;

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

    public void Btn_OnClick(View v) {
        TextView editText = (TextView) findViewById(R.id.textResult);
        TextView textResult = (TextView) findViewById(R.id.textResult);

        if (TextUtils.isEmpty(editText.getText())) {
            editText.setBackgroundColor(Color.RED);
            editText.setHint("请输入一个整数");
        }
    }
}
