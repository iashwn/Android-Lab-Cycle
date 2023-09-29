package com.example.emailsender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e3,e4;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e3 = (EditText) findViewById(R.id.subject);
        e4 = (EditText) findViewById(R.id.message);
        b1 = (Button) findViewById(R.id.send);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Send email","");
                String[] TO = {""};
                String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL,TO);
                emailIntent.putExtra(Intent.EXTRA_CC,CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,e3.getText().toString());
                emailIntent.putExtra(Intent.EXTRA_TEXT,e4.getText().toString());
                try {
                    startActivity(Intent.createChooser(emailIntent,"Sending email.."));
                    finish();
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}