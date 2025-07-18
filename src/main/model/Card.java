package main.model;

public class Card {
    String name;
    EnergyType type;
    Rarity rarity;

    // Constructs new card with given name, energy type, and rarity
    public Card(String name, EnergyType type, Rarity rarity) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }

    // Returns name of card
    public String getName() {
        return this.name;
    }

    // Returns energy type of card as String
    public String getType() {
        return this.type.name();
    }

    // Returns rarity of card as String
    public String getRarity() {
        return this.rarity.toString();
    }
}
