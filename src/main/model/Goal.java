package main.model;

public class Goal {
    String name;
    int criteria;
    int progress;
    int reward;
    boolean achieved;

    // Constructs new goal with given name, number of completed tasks criteria, no progress made, and token reward
    public Goal(String name, int criteria,  int reward) {
        this.name = name;
        this.criteria = criteria;
        this.progress = 0;
        this.reward = reward;
        this.achieved = false;
    }

    // MODIFIES: this
    // Increases number of tasks completed that contribute towards goal completion
    // Marks goal as achieved if progress == criteria
    public void progress() {
        if (this.progress == this.criteria) {
            return;
        }

        this.progress = progress + 1;
        
        if (this.progress == this.criteria) {
            achieve();
        }
    }

    // MODIFIES: this
    // Sets achievement status of goal to true
    public void achieve() {
        this.achieved = true;
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

    // Returns number of tokens rewarded for completing this goal
    public int getReward() {
        return this.reward;
    }

    // Returns achievement status of goal
    public boolean getAchieved() {
        return this.achieved;
    }
}
