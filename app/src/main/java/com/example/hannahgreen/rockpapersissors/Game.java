package com.example.hannahgreen.rockpapersissors;

import com.example.hannahgreen.rockpapersissors.Enums.ChoiceType;
import com.example.hannahgreen.rockpapersissors.Enums.ResultType;

public class Game {

    protected ChoiceType choiceType;
    protected ResultType resultType;
//    protected User user;
    protected Android android;

    public String checkWinner() {
        User user = new User();
        Android android = new Android();
        ChoiceType userChoice = user.makeChoice(ChoiceType.PAPER);
        ChoiceType androidChoice = android.getRandomChoice();

        if (userChoice == ChoiceType.PAPER && androidChoice == ChoiceType.ROCK){
            return "User wins";}
        else if (userChoice == ChoiceType.ROCK && androidChoice == ChoiceType.PAPER)
            return "Android wins" + androidChoice.toString();
        else if (userChoice == ChoiceType.PAPER && androidChoice == ChoiceType.SCISSORS)
            return "Android wins";
        else if (userChoice == ChoiceType.SCISSORS && androidChoice == ChoiceType.PAPER)
            return "User wins";
        else if (userChoice == ChoiceType.ROCK && androidChoice == ChoiceType.SCISSORS)
            return "User wins";
        else if (userChoice == ChoiceType.SCISSORS && androidChoice == ChoiceType.ROCK)
            return "Android wins";
        else if ( userChoice == androidChoice);{
            return "It's a draw";}
    }


}

