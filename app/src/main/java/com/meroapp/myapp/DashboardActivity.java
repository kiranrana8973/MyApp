package com.meroapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnSum,btnArithmetic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnSum = findViewById(R.id.btnSum);
        btnArithmetic = findViewById(R.id.btnArithmetic);

        btnSum.setOnClickListener(this);
        btnArithmetic.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent intent=new Intent();
        switch (v.getId()) {

            case R.id.btnSum:
                intent = new Intent(DashboardActivity.this, MainActivity.class);
                break;

            case R.id.btnArithmetic:
                intent = new Intent(DashboardActivity.this, ArithmeticActivity.class);
                startActivity(intent);
                break;

        }
        startActivity(intent);
    }
}
