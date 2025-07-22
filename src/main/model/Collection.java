package main.model;

import java.util.List;
import java.util.ArrayList;

public class Collection {
    private List<Card> ultraRares;
    private List<Card> doubleRares;
    private List<Card> rares;
    private List<Card> uncommons;
    private List<Card> commons;

    // Constructs new card collection with empty lists of cards
    public Collection() {
        this.ultraRares = new ArrayList<>();
        this.doubleRares = new ArrayList<>();
        this.rares = new ArrayList<>();
        this.uncommons = new ArrayList<>();
        this.commons = new ArrayList<>();
    }

    // MODIFIES: this
    // Adds given Ultra Rare card to collection
    public void collectUltraRare(Card card) {
        ultraRares.add(card);
    }

    // MODIFIES: this
    // Adds given Double Rare card to collection
    public void collectDoubleRare(Card card) {
        doubleRares.add(card);
    }

    // MODIFIES: this
    // Adds given Rare card to collection
    public void collectRare(Card card) {
        rares.add(card);
    }

    // MODIFIES: this
    // Adds given Uncommon card to collection
    public void collectUncommon(Card card) {
        uncommons.add(card);
    }

    // MODIFIES: this
    // Adds given Common card to collection
    public void collectCommon(Card card) {
        commons.add(card);
    }

    // Returns list of Ultra Rare cards in collection
    public List<Card> getUltraRares() {
        return this.ultraRares;
    }

    // Returns list of Double Rare cards in collection
    public List<Card> getDoubleRares() {
        return this.doubleRares;
    }

    // Returns list of Rare cards in collection
    public List<Card> getRares() {
        return this.rares;
    }

    // Returns list of Uncommon cards in collection
    public List<Card> getUncommons() {
        return this.uncommons;
    }

    // Returns list of Common cards in collection
    public List<Card> getCommons() {
        return this.commons;
    }
}
