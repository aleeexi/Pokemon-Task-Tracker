package main.model;

// Hierarchy of Pokemon card rarities supported by this application
public enum Rarity {
    Common,
    Uncommon,
    Rare,
    Double_Rare,
    Ultra_Rare;

    @Override
    public String toString() {
        String name = super.name();
        switch (name) {
            case "Double_Rare":
                return "Double Rare";
            case "Ultra_Rare":
                return "Ultra Rare";
            default:
                return name;
        }
    }
    
}
