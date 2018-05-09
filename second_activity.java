package com.sergey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    Button goBtn, yesBtn;
    TextView firstText, secondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        yesBtn = (Button) findViewById(R.id.yesBtn);
        TextView secondText = (TextView) findViewById(R.id.secondText);

        final View.OnClickListener Back = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId())
                {
                    case R.id.yesBtn:
                        Intent goBack = new Intent(second_activity.this, MainActivity.class);
                        startActivity(goBack);
                        break;
                }

            }
        };
        yesBtn.setOnClickListener(Back);
    }
}