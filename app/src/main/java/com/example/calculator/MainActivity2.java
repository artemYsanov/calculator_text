package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView4 = (TextView) findViewById(R.id.textView4);
        Intent intent = getIntent();
        String num1 = intent.getStringExtra("num1");
        String num2 = intent.getStringExtra("num2");
        int i1 = Integer.parseInt(num1);
        int i2 = Integer.parseInt(num2);
        int s =i1 + i2;
        textView4.setText(num1 + "+" + num2 + "=" + s);
    }
}