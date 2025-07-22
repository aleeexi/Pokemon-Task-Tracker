package main.model;

import java.time.LocalDate;
import java.util.List;

import main.exceptions.InsufficientTokensException;

import java.util.ArrayList;
import java.util.HashMap;

public class Profile {
    private int tokens;
    private LocalDate lastLogin;
    private HashMap<String, Task> tasks;
    private List<Task> completedTasks;
    private HashMap<String, Goal> goals;
    private List<Goal> completedGoals;

    // Constructs new profile with 0 tokens, last login date as current date, and empty lists of tasks, completed tasks, goals, and completed goals
    public Profile() {
        this.tokens = 0;
        this.lastLogin = LocalDate.now();
        this.tasks = new HashMap<>();
        this.completedTasks = new ArrayList<>();
        this.goals = new HashMap<>();
        this.completedGoals = new ArrayList<>();
    }

    // MODIFIES: this
    // Rewards x amount of tokens
    public void reward(int x) {
        tokens = this.tokens + x;
    }

    
    // MODIFIES: this
    // Spends x amount of tokens;
    // If x > current tokens, throws InsufficientTokensException
    public void spend(int x) throws InsufficientTokensException {
        if (x > this.tokens) {
            throw new InsufficientTokensException();
        } else {
            tokens = this.tokens - x;
        }
    }

    // MODIFIES: this
    // Adds task to hash map of tasks
    public void addTask(Task task) {
        tasks.put(task.getTitle(), task);
    }

    // REQUIRES: task exists in this.tasks
    // MODIFIES: this
    // Removes task from hash map of tasks
    public void removeTask(Task task) {
        tasks.remove(task.getTitle());
    }

    // MODIFIES: this
    // Adds task to list of completed tasks
    public void addCompletedTask(Task task) {
        completedTasks.add(task);
    }
    
    // MODIFIES: this
    // Adds goal to hash map of goals
    public void addGoal(Goal goal) {
        goals.put(goal.getName(), goal);
    }

    // MODIFIES: this
    // Removes goal form hash map of goals
    public void removeGoal(Goal goal) {
        goals.remove(goal.getName());
    }

    // MODIFIES: this
    // Adds goal to list of completed goals
    public void addCompletedGoal(Goal goal) {
        completedGoals.add(goal);
    }

    // Returns number of tokens that profile has
    public int getTokens() {
        return this.tokens;
    }

    // Returns date of last login
    public LocalDate getLastLogin() {
        return this.lastLogin;
    }

    // Returns hash map of tasks
    public HashMap<String, Task> getTasks() {
        return this.tasks;
    }

    // Returns list of completed tasks
    public List<Task> getCompletedTasks() {
        return this.completedTasks;
    }

    // Returns hash map of goals
    public HashMap<String, Goal> getGoals() {
        return this.goals;
    }

    // Returns list of completed goals
    public List<Goal> getCompletedGoals() {
        return this.completedGoals;
    }
}
