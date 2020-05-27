package com.zcj924.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
        int min=10;
        int max=99;
        Random random = new Random();
        int num = random.nextInt(max)%(max-min+1) + min;

        textResult.setText(String.valueOf(num));
    }
}
