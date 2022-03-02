package com.connectors.pastelistner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CutCopyPasteEditText editText;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (CutCopyPasteEditText) findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        editText.setOnCutCopyPasteListener(new CutCopyPasteEditText.OnCutCopyPasteListener() {
            @Override
            public void onCut() {
                Toast.makeText(MainActivity.this,"On Cut",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCopy() {
                Toast.makeText(MainActivity.this,"On Copy",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onPaste() {
                Toast.makeText(MainActivity.this,"On Paste",Toast.LENGTH_LONG).show();
            }
        });

    }
}