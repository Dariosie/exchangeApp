package com.example.exchange;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private Button button;
    private EditText CashAmount;
    private Spinner endCurrency;
    private Spinner startCurrency;
    private TextView outputText;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        outputText = (TextView) findViewById(R.id.textView);

        CashAmount = (EditText) findViewById(R.id.editText);



        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (!CashAmount.getText().toString().equals(""))
                {
                if (startCurrency.getSelectedItem().toString().equals(endCurrency.getSelectedItem().toString()))
                {
                    outputText.setText(CashAmount.getText().toString());
                }

                else
                {

                    double variabel = ExchangeRate.getRate(startCurrency.getSelectedItem().toString(), endCurrency.getSelectedItem().toString());

                    float output = Float.parseFloat(CashAmount.getText().toString());
                    output *= variabel;


                    outputText.setText(String.valueOf(output));
                }
                    if (startCurrency.getSelectedItem().toString().equals(endCurrency.getSelectedItem().toString())) {
                        outputText.setText(CashAmount.getText().toString());
                    }
                }
                }
        };

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(listener);

        startCurrency = (Spinner) findViewById(R.id.spinnerStart);

        endCurrency = (Spinner) findViewById(R.id.spinnerEnd);



    }
}