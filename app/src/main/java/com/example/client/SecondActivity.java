package com.example.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button newVisit , futureVisit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        newVisit = (Button) findViewById(R.id.newVisit);
        futureVisit = (Button) findViewById(R.id.futureVisit);
        newVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(SecondActivity.this,NewVisit.class);
                startActivity(i);
            }
        });

        futureVisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this,FutureVisit.class);
                startActivity(i);
            }
        });
    }
}
