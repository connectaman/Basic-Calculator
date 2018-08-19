package com.example.amanulla.simple_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toAdd(View a)
    {
        EditText editTextnum1 = (EditText)findViewById(R.id.num1);
        EditText editTextnum2 = (EditText)findViewById(R.id.num2);
        double num1=Double.parseDouble(editTextnum1.getText().toString());
        double num2=Double.parseDouble(editTextnum2.getText().toString());
        TextView textView = (TextView)findViewById(R.id.result);
        double res=num1+num2;
        textView.setText(Double.toString(res));
    }
    public void toSub(View s)
    {
        EditText editTextnum1 = (EditText)findViewById(R.id.num1);
        EditText editTextnum2 = (EditText)findViewById(R.id.num2);
        double num1=Double.parseDouble(editTextnum1.getText().toString());
        double num2=Double.parseDouble(editTextnum2.getText().toString());
        TextView textView = (TextView)findViewById(R.id.result);
        double res=num1-num2;
        textView.setText(Double.toString(res));
    }
    public void toMul(View m)
    {
        EditText editTextnum1 = (EditText)findViewById(R.id.num1);
        EditText editTextnum2 = (EditText)findViewById(R.id.num2);
        double num1=Double.parseDouble(editTextnum1.getText().toString());
        double num2=Double.parseDouble(editTextnum2.getText().toString());
        TextView textView = (TextView)findViewById(R.id.result);
        double res=num1*num2;
        textView.setText(Double.toString(res));
    }
    public void toDiv(View d)
    {
        EditText editTextnum1 = (EditText)findViewById(R.id.num1);
        EditText editTextnum2 = (EditText)findViewById(R.id.num2);
        double num1=Double.parseDouble(editTextnum1.getText().toString());
        double num2=Double.parseDouble(editTextnum2.getText().toString());
        TextView textView = (TextView)findViewById(R.id.result);
        double res=num1/num2;
        textView.setText(Double.toString(res));
    }
}
