package test.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import main.model.CardPack;

// TODO: finish CardPack tests
public class CardPackTest {
    CardPack cp1;

    File f1;
    File f2;
    File f3;
    File f4;
    File f5;

    @BeforeEach
    void runBefore() {
        cp1 = new CardPack();

        f1 = new File("Gible-Dragon-96.jpg");
    }
}
