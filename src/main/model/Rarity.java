package main.model;

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
