package com.gitlab.yatzygame;

import com.gitlab.yatzygame.score.ChanceScoreCategory;

import java.util.Arrays;

public class YatzyGame {
    private final DiceRoll diceRoll;
    public YatzyGame(DiceRoll diceRoll) {
        this.diceRoll = diceRoll;
    }

    public static void main(String[] args) {

        DiceRoll diceRoll1 = new DiceRoll(DiceValue.FIVE, DiceValue.FOUR, DiceValue.SIX, DiceValue.FOUR, DiceValue.FIVE);
        YatzyGame player = new YatzyGame(diceRoll1);
        int[] handValues = player.diceRoll.getDiceValues();

        int score = new ChanceScoreCategory().score(handValues);

        System.out.println(Arrays.toString(handValues));
        System.out.println(score);

    }

}
