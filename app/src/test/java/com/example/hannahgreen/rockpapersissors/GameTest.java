package com.example.hannahgreen.rockpapersissors;

import com.example.hannahgreen.rockpapersissors.Enums.ChoiceType;
import com.example.hannahgreen.rockpapersissors.Enums.ResultType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    ChoiceType choiceType;
    ResultType resultType;
    User user;
    Android android;

    @Before
    public void before(){
       this.game = new Game();
       this.android = new Android();
       user = new User(ChoiceType.PAPER);

    }

    @Test
    public void canMakeChoice(){
        assertEquals(ChoiceType.PAPER, user.makeChoice());
    }




}
