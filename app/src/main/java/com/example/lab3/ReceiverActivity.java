package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);
        textView = (TextView) findViewById(R.id.textViewReceiver);

        Intent receiverIntent = getIntent();
        String receivedValue = receiverIntent.getStringExtra("KEY_SENDER");
        textView.setText(receivedValue);
    }
}