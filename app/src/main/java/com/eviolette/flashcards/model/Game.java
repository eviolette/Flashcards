package com.eviolette.flashcards.model;

/**
 * Created by eviolette on 4/20/15.
 */
public class Game {
    private int numCorrect, position;
    private Deck deck;

    public Game(Deck deck) {
        this.numCorrect = numCorrect;
        this.position = position;
        this.deck = deck;
    }

    public Card nextCard() {
        return null;
    }

    public int numberCorrect() {
        return 0;
    }

    public void incrementScore() {
    }
}
