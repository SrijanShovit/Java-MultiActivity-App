package com.example.order_multi_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        //using onCreate view is set up
        //here intent is to receive an activity
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MSG); //receiving message as MSG key from MainActivity in form of String
         //for going back arrow see in manifest.xml
        //Setting text inside text view to message
        TextView textView = findViewById(R.id.orderedText);
        textView.setText(message);

    }
}