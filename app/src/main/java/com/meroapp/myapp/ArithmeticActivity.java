package com.meroapp.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.meroapp.myapp.arithmetic.Arithmetic;

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

        btnCalculate.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if(TextUtils.isEmpty(etArithmeticFirst.getText().toString())){
            etArithmeticFirst.setError("Enter first no");
            etArithmeticFirst.requestFocus();
            return;
        } else if(TextUtils.isEmpty(etArithmeticSecond.getText().toString())){
            etArithmeticSecond.setError("Enter second no");
            etArithmeticSecond.requestFocus();
            return;
        }


        int first ,second,result;
        first =Integer.parseInt(etArithmeticFirst.getText().toString());
        second =Integer.parseInt(etArithmeticSecond.getText().toString());

        switch (v.getId()){
            case R.id.btnCalculate :
                if(rdoSum.isChecked()){
                    //Add
                    Arithmetic arithmetic = new Arithmetic(first,second);
                    result = arithmetic.add();
                    Toast.makeText(this, "Result is " + result, Toast.LENGTH_SHORT).show();
                }else if(rdoSubtract.isChecked()){
                    //Subtract
                    Arithmetic arithmetic = new Arithmetic(first,second);
                    result = arithmetic.sub();
                    Toast.makeText(this, "Result is " + result, Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}