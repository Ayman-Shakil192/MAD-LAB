package com.example.nabeel;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    RadioButton r1,r2,r3,r4;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add() {
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        r1 = findViewById(R.id.radioButton1);
        result = findViewById(R.id.res);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int addition = a+b;
        result.setText(String.format("Sum = %d",addition));
    }

    public void subtract(){
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        r2 = findViewById(R.id.radioButton2);
        result = findViewById(R.id.res);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int subtraction = a-b;
        result.setText(String.format("Difference = %d",subtraction));
    }

    public void multiply(){
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        r3 = findViewById(R.id.radioButton3);
        result = findViewById(R.id.res);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int product = a*b;
        result.setText(String.format("Product = %d",product));
    }

    public void divide(){
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        r4 = findViewById(R.id.radioButton4);
        result = findViewById(R.id.res);
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int division = a/b;
        result.setText(String.format("Division = %d",division));
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton1:
                if (checked)
                    add();
                break;
            case R.id.radioButton2:
                if (checked)
                    subtract();
                break;
            case R.id.radioButton3:
                if (checked)
                    multiply();
                break;
            case R.id.radioButton4:
                if (checked)
                    divide();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}