package com.github.curriculeon;


import com.github.curriculeon.games.cards.BlackJack;
import com.github.curriculeon.games.cards.GoFish;
import com.github.curriculeon.model.CardDeck;

public class Casino {
    public static void main(String[] args) {
        // write your tests before you start fucking with this


//        BlackJack blackJack = new BlackJack(4);
//        System.out.println("preshuffle" + blackJack.getDeck());
//        System.out.println("shuffle" + blackJack.getDeck().shuffleDeck());

        GoFish goFish = new GoFish(1);
        goFish.deal(1);
        System.out.println(goFish.getDeck().getDeck().size());
//        Player nonGambler = new Player();
//        Player gambler = new Gambler();
//        CardDeck deck = new CardDeck(1);
//        System.out.println("preshuffle" + deck);
//        deck.shuffleDeck();
//        System.out.println("shuffled" + deck);
//        Integer numberOfPlayers = 4;
//
//        for (int i = 0; i < numberOfPlayers; i++){
//            String cardBeingPlayed = deck.removeCard();
////            System.out.println("card " + cardBeingPlayed);
//        }
    }
}
