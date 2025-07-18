package main.model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Profile {
    int tokens;
    LocalDate lastLogin;
    HashMap<String, Task> tasks;
    List<Task> completedTasks;
    HashMap<String, Goal> goals;
    List<Goal> completedGoals;

    // Constructs new profile with 0 tokens, last login date as current date, and empty lists of tasks, completed tasks, goals, and completed goals
    public Profile() {
        this.tokens = 0;
        this.lastLogin = LocalDate.now();
        this.tasks = new HashMap<>();
        this.completedTasks = new ArrayList<>();
        this.goals = new HashMap<>();
        this.completedGoals = new ArrayList<>();
    }
}
