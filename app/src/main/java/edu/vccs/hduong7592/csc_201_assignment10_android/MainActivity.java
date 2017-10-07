package edu.vccs.hduong7592.csc_201_assignment10_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button SubmitBtn, CompareBtn;
    EditText InputTxt, Input2Txt;
    TextView ResultLB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SubmitBtn = (Button) findViewById(R.id.SubmitBtn);
        CompareBtn = (Button) findViewById(R.id.CompareBtn);
        InputTxt = (EditText) findViewById(R.id.InputTxt);
        Input2Txt = (EditText) findViewById(R.id.Input2Txt);
        ResultLB = (TextView) findViewById(R.id.ResultLB);

        SubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Value = Integer.parseInt(InputTxt.getText().toString());
                String Result = DisplayValue(Value);
                ResultLB.setText(Result);
            }
        });

        CompareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Value = Integer.parseInt(InputTxt.getText().toString());
                int Value2 = Integer.parseInt(Input2Txt.getText().toString());
                String Result = CompareValue(Value, Value2);
                ResultLB.setText(Result);
            }
        });
    }

    public String CompareValue(int value1, int value2) {
        String Result = "";

        MyInteger myInt = new MyInteger(value1);
        Result += "Value 1: "+myInt.getValue()+"\n";
        Result += "Value 2: "+value2+"\n";
        Result +="Value 1 equals value 2: "+myInt.equals(value2)+"\n";

        return Result;
    }

    public String DisplayValue(int value) {

        String Result = "";

        MyInteger myInt = new MyInteger(value);
        Result += "Value: "+myInt.getValue()+"\n";
        Result += "Is even: "+myInt.isEven()+"\n";
        Result +="Is odd: "+myInt.isOdd()+"\n";
        Result +="Is prime: "+myInt.isPrime()+"\n";

        return Result;
    }
}
