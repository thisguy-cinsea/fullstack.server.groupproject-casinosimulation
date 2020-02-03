package com.github.curriculeon.model;

public class CardGame {
    private CardDeck deck;
    private Integer numberOfDecks;

    public CardGame(Integer numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
        this.deck = new CardDeck(numberOfDecks);
    }

    public CardDeck getDeck() {
        return deck;
    }

    public void setDeck(CardDeck deck) {
        this.deck = deck;
    }

    public Integer getNumberOfDecks() {
        return numberOfDecks;
    }

    public void setNumberOfDecks(Integer numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }
}
