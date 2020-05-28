package com.zcj924.random;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BtnGen_OnClicked(View v){

        TextView textResult = (TextView)findViewById(R.id.textResult);
        TextView TxtNumMax = (TextView)findViewById(R.id.TxtNumMax);
        TextView TxtNumMin = (TextView)findViewById(R.id.TxtNumMin);
       if (TextUtils.isEmpty(TxtNumMax.getText())||TextUtils.isEmpty(TxtNumMin.getText())){
            if (TextUtils.isEmpty(TxtNumMax.getText())) {
                TxtNumMax.setBackgroundColor(Color.RED);//判断为空设置红色背景
                TxtNumMax.setHint("请输入:随机最大数字");
            }else if (TextUtils.isEmpty(TxtNumMax.getText())) {
                TxtNumMax.setBackgroundColor(Color.TRANSPARENT);//取消设置背景色
            }
            if (TextUtils.isEmpty(TxtNumMin.getText())) {
                TxtNumMin.setBackgroundColor(Color.RED);
                TxtNumMin.setHint("请输入:随机最小数字");
            }else if (TextUtils.isEmpty(TxtNumMin.getText())) {
                TxtNumMin.setBackgroundColor(Color.TRANSPARENT);
            }
        }else {
           int min = Integer.parseInt(TxtNumMin.getText().toString());//取值,注意转换类型
           int max = Integer.parseInt(TxtNumMax.getText().toString());
           if (min>max){
               TxtNumMax.setBackgroundColor(Color.RED);//判断为空设置红色背景
               textResult.setText("会不会数数?大小分不清?");
           }else {
               Random random = new Random();
               int num = random.nextInt(max) % (max - min + 1) + min;
               textResult.setText(String.valueOf(num));//输出,注意转换类型
           }
       }
    }
}
