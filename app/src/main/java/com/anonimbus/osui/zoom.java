package com.anonimbus.osui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class zoom extends Activity {

    TextView TxtfONT;
    Button BtnfONT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoom);

        TxtfONT = (TextView)findViewById(R.id.editText2);
        BtnfONT = (Button)findViewById(R.id.button1);

        BtnfONT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                TxtfONT.setTextSize(56);

            }
        });

        Button buttonOne = findViewById(R.id.back);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent activity2Intent = new Intent(getApplicationContext(), choose.class);
                startActivity(activity2Intent);
            }
        });

    }
}