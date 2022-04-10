package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextNumber;
    EditText editTextNumber2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        editTextNumber2 = (EditText)  findViewById(R.id.editTextNumber2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        if (TextUtils.isEmpty(editTextNumber.getText().toString()) || TextUtils.isEmpty(editTextNumber2.getText().toString())) {
            return;
        }
        num1 = Float.parseFloat(editTextNumber.getText().toString());
        num2 = Float.parseFloat(editTextNumber2.getText().toString());

        switch (v.getId()){
            case R.id.button:
                Intent intent = new Intent(this, MainActivity2.class);
                intent.putExtra("num1", editTextNumber.getText().toString());
                intent.putExtra("num2", editTextNumber2.getText().toString());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}