package com.example.hannahgreen.rockpapersissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hannahgreen.rockpapersissors.Enums.ChoiceType;
import com.example.hannahgreen.rockpapersissors.Enums.ResultType;

public class GameActivity extends AppCompatActivity {

    TextView textView;
    Button button_rock;
    Button button_paper;
    Button button_scissors;
    User user;
    Game game;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        textView = findViewById(R.id.textView);
        button_paper = findViewById(R.id.button_paper);
        button_rock = findViewById(R.id.button_rock);
        button_scissors = findViewById(R.id.button_scissors);

        user = new User();
        game = new Game();

    }

    public void onPaperButtonClick(View button_paper){
        user.makeChoice(ChoiceType.PAPER);
        String answer = game.checkWinner();
        textView.setText(answer);
    }

    public void onRockButtonClick(View button_rock){
        user.makeChoice(ChoiceType.ROCK);
        String answer = game.checkWinner();
        textView.setText(answer);

    }

    public void onScissorButtonClick(View button_scissors){
        user.makeChoice(ChoiceType.SCISSORS);
        String answer = game.checkWinner();
        textView.setText(answer);
    }
}
