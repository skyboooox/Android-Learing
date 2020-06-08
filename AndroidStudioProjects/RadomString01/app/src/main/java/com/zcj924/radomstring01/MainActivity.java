package com.zcj924.radomstring01;

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
    public void btnGen_Clicked(View v) {
        TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
        String RandString= getRandomString(12);
        String ReverseString = new StringBuffer(RandString).reverse().toString();
        textViewResult.setText("随机字符"+RandString+"\n反转输出"+ReverseString);

    }

    private static final String ALL_CHAR ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String getRandomString(final int sizeOfRandomString)
    {
        final Random random=new Random();
        final StringBuilder sb=new StringBuilder(sizeOfRandomString);
        for(int i=0;i<sizeOfRandomString;++i)
            sb.append(ALL_CHAR.charAt(random.nextInt(ALL_CHAR.length())));
        return sb.toString();
    }
}
