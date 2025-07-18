package main.ui;

import java.util.Scanner;

import main.model.Collection;
import main.model.Profile;

public class Console {
    private Profile profile;
    private Collection collection;
    private Scanner scanner;
    private boolean running;

    // Creates instance of Pokemon Task Tracker console ui application
    public Console() {
        this.profile = new Profile();
        this.collection = new Collection();
        this.scanner = new Scanner(System.in);
        this.running = true;
    }
}
