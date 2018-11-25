package com.alwaysexpected.its.tryme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {


    TextView showValue;  // Show Global Clicks
    int counter = 0;   //  Actual Number of Clicks Global Clicks

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = (TextView) findViewById(R.id.counterValue);


    }


    // Method For Counter Plus 1 Each Click

    public void countIN(View view) {


        counter++;
        showValue.setText(Integer.toString(counter));
    }

}


