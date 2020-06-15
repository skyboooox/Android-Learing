package com.zcj924.helloworldname;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn0_Click (View v){
        new AlertDialog.Builder(this)
                .setTitle("我的个人信息")
                .setMessage("姓名:zcj924\n邮箱: zcj924@gmail.com")
                .setPositiveButton("确定", null)
                .show();
    }
    public void btn1_Click (View v){
        new AlertDialog.Builder(this)
                .setTitle("Java新的体会")
                .setMessage("张浩杨博士:我会Jvav啊\n J a v a 与 您\n官方网站: https://www.jvav.org/")
                .setPositiveButton("确定", null)
                .show();

    }
}