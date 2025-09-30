package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultText = findViewById(R.id.resultText);
        ProgressBar progressBar = findViewById(R.id.progressBar);
        Button retryButton = findViewById(R.id.retryButton);

        int score = getIntent().getIntExtra("score", 0);
        resultText.setText("Ton score : " + score + "/1");
        progressBar.setProgress(score);

        retryButton.setOnClickListener(v -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
