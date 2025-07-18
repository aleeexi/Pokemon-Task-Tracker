package test.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.Card;
import main.model.EnergyType;
import main.model.Rarity;

public class CardTest {
    Card c1;
    Card c2;
    Card c3;

    @BeforeEach
    void runBefore() {
        c1 = new Card("Metapod", EnergyType.Grass, Rarity.Uncommon);
        c2 = new Card("Banette", EnergyType.Psychic, Rarity.Double_Rare);
        c3 = new Card("Tauros", EnergyType.Colorless, Rarity.Ultra_Rare);
    }

    @Test
    void testCard() {
        assertEquals("Metapod", c1.getName());
        assertEquals("Grass", c1.getType());
        assertEquals("Uncommon", c1.getRarity());
    }

    @Test
    void testGetName() {
        assertEquals("Banette", c2.getName());
    }

    @Test
    void testGetType() {
        assertEquals("Psychic", c2.getType());
    }

    @Test
    void testGetRarity() {
        assertEquals("Uncommon", c1.getRarity());
    }

    @Test
    void testGetRarityDoubleRare() {
        assertEquals("Double Rare", c2.getRarity());
    }

    @Test
    void testGetRarityUltraRare() {
        assertEquals("Ultra Rare", c3.getRarity());
    }
    
}
