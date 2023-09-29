package com.example.smssender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.et1);
        e2 = (EditText)findViewById(R.id.et2);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneno = e1.getText().toString();
                String msg = e2.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(phoneno,null,msg,null,null);
                Toast.makeText(MainActivity.this, "Message Sent.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}