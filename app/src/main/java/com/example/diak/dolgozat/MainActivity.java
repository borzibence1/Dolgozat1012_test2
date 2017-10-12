package com.example.diak.dolgozat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   TextView showValue;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            showValue = (TextView) findViewById(R.id.cc);
        }

    public void addCount(View view) {
        if (counter == 20) {
            Toast.makeText(getApplicationContext(), "Unatkozol",
                    Toast.LENGTH_LONG).show();}
        else {

            counter++;
            showValue.setText(Integer.toString(counter));
        }
    }

    public void minusCount(View v) {
        counter--;
        showValue.setText(Integer.toString(counter));
    }

    public void resetCount(View view) {
        counter = 0;
        showValue.setText(String.valueOf(counter));
    }
}


