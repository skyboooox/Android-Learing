package com.zcj924.discount01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnDisCot_Clicked(View v) {
        TextView TxtOriginPrice = (TextView) findViewById(R.id.TxtOriginPrice);
        TextView TxtOut = (TextView) findViewById(R.id.TxtOut);

        if (TextUtils.isEmpty(TxtOriginPrice.getText())) {
            TxtOriginPrice.setBackgroundColor(Color.RED);//判断为空设置红色背景
            TxtOriginPrice.setHint("请！输！入！原！价！");
        }

        else {
            TxtOriginPrice.setBackgroundColor(Color.TRANSPARENT);
            Double price = Double.parseDouble(TxtOriginPrice.getText().toString());
            if (price <= 0) {
                TxtOut.setText("白送你,8要钱");
            }
            if (price > 0 && price <= 1000) {
                TxtOut.setText("氪的不够,8打折");
            }
            if (price > 1000 && price <= 2000) {
                TxtOut.setText("九五折，你要付：" + String.valueOf(price * 0.95) + "元");
            }
            if (price > 2000 && price <= 3000) {
                TxtOut.setText("九折，你要付：" + String.valueOf(price * 0.9) + "元");
            }
            if (price > 3000 && price <= 4000) {
                TxtOut.setText("八五折，你要付：" + String.valueOf(price * 0.85) + "元");
            }
            if (price >= 5000) {
                TxtOut.setText("土豪八折，你要付：" + String.valueOf(price * 0.8) + "元");
            }

        }
    }
}
