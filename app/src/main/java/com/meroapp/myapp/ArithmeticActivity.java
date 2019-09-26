package com.meroapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ArithmeticActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etArithmeticFirst,etArithmeticSecond;
    RadioButton rdoSum,rdoSubtract;
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arithmetic);

        etArithmeticFirst = findViewById(R.id.etArithmeticFirst);
        etArithmeticSecond = findViewById(R.id.etArithmeticSecond);
        rdoSum = findViewById(R.id.rdoSum);
        rdoSubtract = findViewById(R.id.rdoSubtract);
        btnCalculate = findViewById(R.id.btnCalculate);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnCalculate :
                if(rdoSum.isChecked()){

                }else if(rdoSubtract.isChecked()){

                }
                else{
                    Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}