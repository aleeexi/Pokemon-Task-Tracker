package main.model;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    List<Card> cards;

    // Constructs new card collection with empty list of cards
    public Collection() {
        this.cards = new ArrayList<>();
    }
}
