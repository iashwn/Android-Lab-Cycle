package com.example.valuepass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1 = (TextView)findViewById(R.id.textView2);
        Bundle b = getIntent().getExtras();
        String s = b.getString("name");
        t1.setText(s);

    }
}