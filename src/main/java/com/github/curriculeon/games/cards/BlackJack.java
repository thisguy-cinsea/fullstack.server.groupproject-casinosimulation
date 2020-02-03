package com.github.curriculeon.games.cards;

import com.github.curriculeon.interfaces.GamblingGame;
import com.github.curriculeon.model.CardGame;

public class BlackJack extends CardGame implements GamblingGame {
    public BlackJack(Integer numberOfDecks) {
        super(numberOfDecks);
    }

    @Override
    public void wager() {

    }


    @Override
    public void deal(Integer numberOfCards) {

    }

    @Override
    public void play() {

    }
}
