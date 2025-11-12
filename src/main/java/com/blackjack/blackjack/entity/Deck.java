package com.blackjack.blackjack.entity;

import java.util.List;

public class Deck {
    private List<card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initialize();
        shuffle();
    }

    public initialize() 
    for (Suit suit : Suit.values()) {
        for (Rank rank : Rank.values()) {
            cards.add(new Card(suit, rank));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No cards left in the deck");
        }
        return cards.remove(cards.size() - 1);
    }
}
