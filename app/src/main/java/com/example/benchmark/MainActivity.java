package com.example.benchmark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MEGGAGE = "EXTRA_MEGGAGE" ;
    EditText editText;
    WordMetods word = new WordMetods();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, Receiver.class);
        String meggage = editText.getText().toString();
        word.backWards(meggage);

        word.storeData(meggage);


        intent.putExtra("EXTRA_MEGGAGE", word);
        startActivity(intent);
    }
}