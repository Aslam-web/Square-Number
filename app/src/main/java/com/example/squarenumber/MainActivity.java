package com.example.squarenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView squared;
    private EditText number;
    private TextView warning;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        squared = findViewById(R.id.mySquared);
        button = findViewById(R.id.myButton);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                number = findViewById(R.id.myNumber);
                try {
                    warning = findViewById(R.id.myWarning);
                    long num = Long.parseLong(number.getText().toString());
                    if (num > 900000000){
                        warning.setText("Please Enter a value between 0 to 900,000,000");
                    } else {
                        if (warning != null){
                            warning.setText(null);
                        }
                        num *= num;
                        squared.setText(String.valueOf(num));
                    }
                } catch (NumberFormatException e) {
                    warning.setText("Please enter a number");
                }
            }
        });
    }

}