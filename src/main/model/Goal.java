package main.model;

public class Goal {
    String name;
    int criteria;
    int progress;
    int reward;

    // Constructs new goal with given name, number of completed tasks criteria, no progress made, and token reward
    public Goal(String name, int criteria,  int reward) {
        this.name = name;
        this.criteria = criteria;
        this.progress = 0;
        this.reward = reward;
    }

    // Returns name of goal
    public String getName() {
        return this.name;
    }

    // Returns number of completed tasks required to complete goal
    public int getCriteria() {
        return this.criteria;
    }

    // Returns number of tasks completed so far that have contributed towards completing goal
    public int getProgress() {
        return this.progress;
    }

    // Returns number of tokens rewarded for completing this task
    public int getReward() {
        return this.reward;
    }
}
