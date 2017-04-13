package com.android.toma.quiz_10.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.android.toma.quiz_10.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuestionScreen extends AppCompatActivity {

    @BindView(R.id.textStart)
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        ButterKnife.bind(this);
    }
}
