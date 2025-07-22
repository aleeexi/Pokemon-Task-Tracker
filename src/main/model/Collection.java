package main.model;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

public class Collection {
    List<Card> cards;

    // Constructs new card collection with empty list of cards
    public Collection() {
        this.cards = new ArrayList<>();
    }

    // Creates Common card from given file
    public Card getCommonCard(File file) {
        String fileName = file.getName();
        int borderOne = fileName.indexOf("-");
        int borderTwo = fileName.lastIndexOf("-");
        String name = fileName.substring(0, borderOne);
        String energy = fileName.substring((borderOne + 1), borderTwo);
        EnergyType type = EnergyType.valueOf(energy);
        String id = fileName.substring((borderTwo + 1));

        return new Card(name, type, Rarity.Common, id);
    }

    // MODIFIES: this
    // Adds given card to collection
    public void collect(Card card) {
        cards.add(card);
    }

    // Returns list of cards in collection
    public List<Card> getCards() {
        return this.cards;
    }
}
