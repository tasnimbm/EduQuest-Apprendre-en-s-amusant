package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        TextView questionText = findViewById(R.id.questionText);
        Button option1 = findViewById(R.id.option1);
        Button option2 = findViewById(R.id.option2);
        Button option3 = findViewById(R.id.option3);

        option1.setOnClickListener(v -> openResult(false));
        option2.setOnClickListener(v -> openResult(true)); // Bonne réponse : Paris
        option3.setOnClickListener(v -> openResult(false));
    }

    private void openResult(boolean isCorrect) {
        if (isCorrect) score = 1;
        Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
        intent.putExtra("score", score);
        startActivity(intent);
    }
}
