package com.example.hannahgreen.rockpapersissors.Enums;

import java.util.Random;

public enum ChoiceType {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

  protected String choiceType;

  ChoiceType(String choiceType){
      this.choiceType = choiceType;
  }

    public static ChoiceType getRandomChoice(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

}
