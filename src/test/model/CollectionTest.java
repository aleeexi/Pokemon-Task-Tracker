package test.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import main.model.Card;
import main.model.Collection;
import main.model.EnergyType;
import main.model.Rarity;

public class CollectionTest {
    Collection n1;
    Collection n2;

    Card c1;
    Card c2;
    Card c3;
    Card c4;
    Card c5;

    @BeforeEach
    void runBefore() {
        n1 = new Collection();
        n2 = new Collection();

        c1 = new Card("Zorua", EnergyType.Darkness, Rarity.Common, "52");
        c2 = new Card("Banette", EnergyType.Psychic, Rarity.Double_Rare, "088");
        c3 = new Card("Tauros", EnergyType.Colorless, Rarity.Ultra_Rare, "144");
        c4 = new Card("Entei", EnergyType.Fire, Rarity.Rare, "1");
        c5 = new Card("Metapod", EnergyType.Grass, Rarity.Uncommon, "2");

        n2.collectCommon(c1);
        n2.collectDoubleRare(c2);
        n2.collectUltraRare(c3);
        n2.collectRare(c4);
        n2.collectUncommon(c5);
    }

    @Test
    void testCollection() {
        assertEquals(new ArrayList<Card>(), n1.getUltraRares());
        assertEquals(new ArrayList<Card>(), n1.getDoubleRares());
        assertEquals(new ArrayList<Card>(), n1.getRares());
        assertEquals(new ArrayList<Card>(), n1.getUncommons());
        assertEquals(new ArrayList<Card>(), n1.getCommons());
    }

    @Test
    void testCollectUltraRare() {
        List<Card> ur = n1.getUltraRares();

        n1.collectUltraRare(c3);
        assertEquals(1, ur.size());
    }

    @Test
    void testCollectUltraRareMultiple() {
        List<Card> ur = n1.getUltraRares();
        
        n1.collectUltraRare(c3);
        n1.collectUltraRare(c3);
        assertEquals(2, ur.size());
    }

    @Test
    void testCollectDoubleRare() {
        List<Card> dr = n1.getDoubleRares();

        n1.collectDoubleRare(c2);
        assertEquals(1, dr.size());
    }

    @Test
    void testCollectDoubleRareMultiple() {
        List<Card> dr = n1.getDoubleRares();
        
        n1.collectDoubleRare(c2);
        n1.collectDoubleRare(c2);
        assertEquals(2, dr.size());
    }

    @Test
    void testCollectRare() {
        List<Card> r = n1.getRares();

        n1.collectRare(c4);
        assertEquals(1, r.size());
    }

    @Test
    void testCollectRareMultiple() {
        List<Card> r = n1.getRares();
        
        n1.collectRare(c4);
        n1.collectRare(c4);
        assertEquals(2, r.size());
    }

    @Test
    void testCollectUncommon() {
        List<Card> u = n1.getUncommons();

        n1.collectUncommon(c5);
        assertEquals(1, u.size());
    }

    @Test
    void testCollectUncommonMultiple() {
        List<Card> u = n1.getUncommons();
        
        n1.collectUncommon(c5);
        n1.collectUncommon(c5);
        assertEquals(2, u.size());
    }

    @Test
    void testCollectCommon() {
        List<Card> c = n1.getCommons();

        n1.collectCommon(c1);
        assertEquals(1, c.size());
    }

    @Test
    void testCollectCommonMultiple() {
        List<Card> c = n1.getCommons();
        
        n1.collectCommon(c1);
        n1.collectCommon(c1);
        assertEquals(2, c.size());
    }

    @Test
    void testGetUltraRares() {
        List<Card> ur = new ArrayList<Card>();
        ur.add(c3);

        assertEquals(ur, n2.getUltraRares());
    }

    @Test
    void testGetDoubleRares() {
        List<Card> dr = new ArrayList<Card>();
        dr.add(c2);

        assertEquals(dr, n2.getDoubleRares());
    }

    @Test
    void testGetRares() {
        List<Card> r = new ArrayList<Card>();
        r.add(c4);

        assertEquals(r, n2.getRares());
    }

    @Test
    void testGetUncommons() {
        List<Card> u = new ArrayList<Card>();
        u.add(c5);

        assertEquals(u, n2.getUncommons());
    }

    @Test
    void testGetCommons() {
        List<Card> c = new ArrayList<Card>();
        c.add(c1);

        assertEquals(c, n2.getCommons());
    }
}
