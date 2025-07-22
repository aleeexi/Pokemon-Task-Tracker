package main.model;

public class Card {
    private String name;
    private EnergyType type;
    private Rarity rarity;
    private String id;

    // Constructs new card with given name, energy type, rarity, and id
    public Card(String name, EnergyType type, Rarity rarity, String id) {
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.id = id;
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

    // Returns id of card as String
    public String getID() {
        return this.id;
    }
}
