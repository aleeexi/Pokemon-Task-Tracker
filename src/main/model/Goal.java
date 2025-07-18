package main.model;

public class Goal {
    String name;
    int criteria;
    int progress;

    // Constructs new goal with given name, number of completed tasks criteria, and progress
    public Goal(String name, int criteria, int progress) {
        this.name = name;
        this.criteria = criteria;
        this.progress = progress;
    }
}
