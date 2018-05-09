package com.sergey.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button goBtn, yesBtn;
    TextView firstText, secondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button goBtn = (Button) findViewById(R.id.goBtn);
        TextView secondText = (TextView) findViewById(R.id.secondText);

        final View.OnClickListener Go = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (v.getId())
                {
                    case R.id.goBtn:
                        Intent goTo;
                        goTo = new Intent(MainActivity.this, second_activity.class);
                        startActivity(goTo);
                        break;
                }
            }
        };
        goBtn.setOnClickListener(Go);

    }
}
