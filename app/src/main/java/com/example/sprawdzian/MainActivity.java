package com.example.sprawdzian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double oblicznia;

    Button button = findViewById(R.id.button);
    EditText wartoscA = findViewById(R.id.wartoscA);

    EditText wartoscB = findViewById(R.id.wartoscB);

    EditText wartowsC = findViewById(R.id.wartoscC);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        double a = Double.parseDouble(wartoscA.getText().toString());
        double b = Double.parseDouble(wartoscB.getText().toString());
        double c = Double.parseDouble(wartowsC.getText().toString());
        oblicznia = b*b-4*a+4*c;

        





    }






}