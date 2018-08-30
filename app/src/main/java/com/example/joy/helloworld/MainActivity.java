package com.example.joy.helloworld;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setText(R.string.android);
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.bg2));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                String newText = ((TextView) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Joyce!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.background).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView)).setTextColor(getResources().getColor(R.color.originalText));
                ((TextView) findViewById(R.id.textView)).setText("Hello from Joyce!");
                findViewById(R.id.background).setBackgroundColor(getResources().getColor(R.color.colorPrimary));
            }
        });
    }
}
