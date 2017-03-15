package com.example.janisken.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button divide;
    private Button back;
    private Button clear;
    private Button openP;
    private Button closeP;
    private Button equals;
    private Button period;
    private Button subtract;
    private Button add;
    private Button exponent;*/

    private TextView textSecond;
    private TextView textFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button btn0 = (Button)findViewById(R.id.button0);
        Button btn1 = (Button)findViewById(R.id.button1);
        Button btn2 = (Button)findViewById(R.id.button2);
        Button btn3 = (Button)findViewById(R.id.button3);
        Button btn4 = (Button)findViewById(R.id.button4);
        Button btn5 = (Button)findViewById(R.id.button5);
        Button btn6 = (Button)findViewById(R.id.button6);
        Button btn7 = (Button)findViewById(R.id.button7);
        Button btn8 = (Button)findViewById(R.id.button8);
        Button btn9 = (Button)findViewById(R.id.button9);
        Button divide = (Button)findViewById(R.id.divide);
        Button back = (Button)findViewById(R.id.back);
        Button clear = (Button)findViewById(R.id.clear);
        Button openP = (Button)findViewById(R.id.openP);
        Button closeP = (Button)findViewById(R.id.closeP);
        Button equals = (Button)findViewById(R.id.equals);
        Button period = (Button)findViewById(R.id.period);
        Button subtract = (Button)findViewById(R.id.subtract);
        Button add = (Button)findViewById(R.id.add);
        Button exponent = (Button)findViewById(R.id.exponent);*/

        textSecond = (TextView)findViewById(R.id.textView1);
        textFirst = (TextView)findViewById(R.id.textView2);
    }

    public void buttonAdd(View view){
        Button temp = (Button)view;
        String text1 = String.valueOf(textFirst.getText());
        String text2 = String.valueOf(temp.getText());
        textFirst.setText(text1 + text2);
    }

    public void clearText(View view) {
        textFirst.setText("");
        textSecond.setText("");
    }

    public void operationAdd(View view) {
        Button temp = (Button)view;
        String text1 = String.valueOf(textFirst.getText());
        String text2 = String.valueOf(temp.getText());
        String text3 = String.valueOf(textSecond.getText());
        textSecond.setText(text3 + text1 + text2);
        textFirst.setText("");
    }

    public void backButton(View view) {
        String text1 = String.valueOf(textFirst.getText());
        if (text1 != null && text1.length() > 0) {
            textFirst.setText(text1.substring(0, text1.length() - 1));
        }
    }
}
