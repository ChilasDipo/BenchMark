package com.example.benchmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Receiver extends AppCompatActivity {
    TextView textView, textView2;
    WordMetods word;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        word = (WordMetods) getIntent().getSerializableExtra("EXTRA_MEGGAGE");
        textView = findViewById(R.id.textView);
        textView.setText(word.getBackwards());
        textView2 = findViewById(R.id.datalist);
        textView2.setText(word.printData().toString());
    }

    public void back(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("EXTRA_MEGGAGE",word);
        finish();
    }
}