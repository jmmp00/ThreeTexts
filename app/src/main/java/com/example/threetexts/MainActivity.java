package com.example.threetexts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonOne;
    private Button buttonTwo;
    private Button buttonThree;
    public static final String EXTRA_MESSAGE =
            "com.example.android.threetexts.extra.MESSAGE";
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.button1);
        buttonTwo = findViewById(R.id.button2);
        buttonThree = findViewById(R.id.button3);
    }

    public void pressedOne(View view) {
        Log.d(LOG_TAG, "Button 1 clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonOne.getTag().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void pressedTwo(View view) {
        Log.d(LOG_TAG, "Button 2 clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonTwo.getTag().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void pressedThree(View view) {
        Log.d(LOG_TAG, "Button 3 clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = buttonThree.getTag().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivityForResult(intent, TEXT_REQUEST);
    }
}