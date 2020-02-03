package com.github.curriculeon.games.cards;

import com.github.curriculeon.interfaces.Game;
import com.github.curriculeon.model.CardGame;

public class GoFish extends CardGame implements Game {
    private final Integer minimumPlayers = 2;
    private final Integer maximumPlayers = 6;
    private Integer cardsForEachPlayer;

    public GoFish(Integer numberOfDecks) {
        super(numberOfDecks);
    }

    @Override
    public void deal(Integer numberOfPlayers) {
        if (canPlay(numberOfPlayers)){
            this.getDeck().shuffleDeck();
            for (int i = 0; i < cardsForEachPlayer; i++){
                for (int j = 1; j <= numberOfPlayers; j++) {
                     String cardDealt = this.getDeck().removeCard();
                    System.out.println("Player " + j + ": " +cardDealt );
                }
            }
        }
    }

    @Override
    public void play() {

    }

    private Boolean canPlay(Integer numberOfPlayers){
        if (numberOfPlayers == minimumPlayers){
            cardsForEachPlayer = 7;
            return true;
        } else if ((numberOfPlayers > minimumPlayers) && (numberOfPlayers <= maximumPlayers)){
            cardsForEachPlayer = 5;
            return true;
        } else {
            cardsForEachPlayer = 0;
        }
        return false;
    }
}
