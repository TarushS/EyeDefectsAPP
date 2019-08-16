package com.anonimbus.osui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
                Button buttonOne = findViewById(R.id.zoom);
                buttonOne.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        Intent activity2Intent = new Intent(getApplicationContext(), zoom.class);
                        startActivity(activity2Intent);
                    }
                });
        Button buttontwo = findViewById(R.id.tts);
        buttontwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activity2Intent = new Intent(getApplicationContext(), tts.class);
                startActivity(activity2Intent);
            }
        });

    }
}

