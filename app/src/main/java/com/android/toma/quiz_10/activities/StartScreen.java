package com.android.toma.quiz_10.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.android.toma.quiz_10.R;

public class StartScreen extends AppCompatActivity {

//    @BindView(R.id.imageButtonStart)
    private ImageButton startBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
//        ButterKnife.bind(this);
        startBtn = (ImageButton) findViewById(R.id.imageButtonStart);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartScreen.this, QuestionScreen.class);
                startActivity(intent);
            }
        });
    }
}
