package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    public void update(View v) {
        TextView text = (TextView) findViewById(R.id.textView);
        EditText text2 = (EditText) findViewById(R.id.editText);
        text.setText(text2.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
