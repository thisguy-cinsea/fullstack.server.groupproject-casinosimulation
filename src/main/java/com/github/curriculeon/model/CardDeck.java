package com.github.curriculeon.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class CardDeck {
    Collection<String> cards = Arrays.asList(new String[]{
            "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", "AS",
            "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AC",
            "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AD",
            "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AH",
    });
    private ArrayList<String> deck = new ArrayList<>();
    private Integer numberOfDecks;

    public ArrayList<String> getDeck() {
        return deck;
    }

    public CardDeck(Integer numberOfDecks) {
        for (int i = 0; i < numberOfDecks; i++) {
            this.deck.addAll(cards);
        }
        this.numberOfDecks = numberOfDecks;
    }

    public ArrayList<String> shuffleDeck(){
        Integer totalShuffles = this.numberOfDecks * 52;
        Random rand = new Random();
        for (int currentIndex = 0; currentIndex < totalShuffles; currentIndex++ ) {
            // Random for remaining positions.
            int randomIndex = currentIndex + rand.nextInt(totalShuffles - currentIndex);
            String tempCard = deck.get(randomIndex);
            String originalCard = deck.get(currentIndex);
            deck.set(currentIndex, tempCard);
            deck.set(randomIndex, originalCard);
        }
        return deck;
    }

    public String removeCard(){
        return deck.remove(0);
    }

    @Override
    public String toString() {
        return "CardDeck{" +
                "deck=" + deck +
                '}';
    }
}
