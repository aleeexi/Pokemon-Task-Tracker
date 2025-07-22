package test.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import main.model.Card;
import main.model.Collection;
import main.model.EnergyType;
import main.model.Rarity;

public class CollectionTest {
    Collection n1;
    Collection n2;

    Card c1;
    Card c2;

    @BeforeEach
    void runBefore() {
        n1 = new Collection();
        n2 = new Collection();

        c1 = new Card("Metapod", EnergyType.Grass, Rarity.Common, "1");
        c2 = new Card("Banette", EnergyType.Psychic, Rarity.Double_Rare, "2");

        n2.collect(c1);
        n2.collect(c2);
    }

    @Test
    void testCollection() {
        assertEquals(new ArrayList<Card>(), c1);
    }
}
