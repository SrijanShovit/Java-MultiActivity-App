package com.example.order_multi_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public  static  final  String MSG = "com.example.order_multi_screen.ORDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //using onCreate view is set up
    }
    public  void  placeOrder(View view){
        //intent helps in binding and communicating different activities and components of app
        Intent intent = new Intent(this , OrderActivity.class);
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);
        EditText editText3 = findViewById(R.id.editText3);
        String message = "Order for " + editText1.getText().toString() + ", " + editText2.getText().toString() + " & " + editText3.getText().toString() + " has been successfully placed.";
        //want to send message data with name of MSG
        intent.putExtra(MSG , message);
        //here intent is to send message to another activity
        //to start order activity
        startActivity( intent);
    }
}