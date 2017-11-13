package com.example.hamishstewart.wordcounter.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hamishstewart.wordcounter.Model.Counter;
import com.example.hamishstewart.wordcounter.R;

public class MainActivity extends AppCompatActivity {

    private TextView WordCountAnswer;
    private EditText EnterSentenceText;
    private Button AnswerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.WordCountAnswer = (TextView) findViewById(R.id.sentence);
        this.EnterSentenceText = (EditText) findViewById(R.id.input_sentence);
        this.AnswerButton = (Button) findViewById(R.id.answer_button);
    }

    public void onButtonClicked(View button) {
        String wordsToCount = this.EnterSentenceText.getText().toString();
        Integer words = Counter.getWordCount(wordsToCount);
        this.WordCountAnswer.setText(words.toString());

    }
}
