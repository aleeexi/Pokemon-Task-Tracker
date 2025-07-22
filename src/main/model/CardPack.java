package main.model;

import java.io.File;

public class CardPack {

    // TODO: finish rarity method
    // Returns random rarity of card opened in card pack;
    // Probabilities:
    public Rarity rarity() {
        return Rarity.Common;
    }

    // TODO: finish pickCommonCard method
    // Returns random common card File from image database of common cards
    // Implementation from this Stack Overflow post:
    // https://stackoverflow.com/questions/39629645/pick-a-random-file-from-a-directory-in-java
    public String pickCommonCard() {
        "../../../cards/common"
        File[] commons = 
        return "";
    }

    // Creates Common card from given file name
    public Card commonCard(File file) {
        String fileName = file.getName();
        int borderOne = fileName.indexOf("-");
        int borderTwo = fileName.lastIndexOf("-");
        String name = fileName.substring(0, borderOne);
        String energy = fileName.substring((borderOne + 1), borderTwo);
        EnergyType type = EnergyType.valueOf(energy);
        String id = fileName.substring((borderTwo + 1));

        return new Card(name, type, Rarity.Common, id);
    }
}
