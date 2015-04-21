package com.eviolette.flashcards.model;

import java.util.List;

/**
 * Created by eviolette on 4/20/15.
 */
public class Deck {
    private String name;
    private List<Card> cards;

    public Deck(String name, List<Card> cards) {
        this.cards = cards;
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getName() {
        return name;
    }

    public int total() {
        return cards.size();
    }
}
