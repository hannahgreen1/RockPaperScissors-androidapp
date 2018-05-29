package com.example.hannahgreen.rockpapersissors;

import com.example.hannahgreen.rockpapersissors.Enums.ChoiceType;

public class User{

    private ChoiceType choiceType;

    public User(ChoiceType choiceType){
        this.choiceType = choiceType;
    }

    public ChoiceType makeChoice() {
        return this.choiceType;
    }
}
