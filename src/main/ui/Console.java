package main.ui;

import java.util.Scanner;

import main.model.Collection;
import main.model.Goal;
import main.model.Profile;
import main.model.Task;

public class Console {
    private Profile profile;
    private Collection collection;
    private Scanner scanner;
    private boolean running;

    private static final int TASK_COMPLETION_REWARD = 100;
    private static final Goal FIVE_TASKS = new Goal("Complete 5 tasks", 5, 500);
    private static final Goal THREE_TASKS = new Goal("Complete 3 tasks", 3, 300);
    private static final Goal ONE_TASK = new Goal("Complete 1 task", 1, 100);

    // Creates instance of Pokemon Task Tracker console ui application
    public Console() {
        this.profile = new Profile();
        this.collection = new Collection();
        this.scanner = new Scanner(System.in);
        this.running = true;
    }

    // Marks given task as completed, adds given task to list of completed tasks, and rewards tokens
    public void completeTask(Task task) {
        task.complete();
        profile.addCompletedTask(task);
        profile.removeTask(task);
        profile.reward(TASK_COMPLETION_REWARD);

        for (Goal g : profile.getGoals().values()) {
            g.progress();
            if (g.getAchieved()) {
                completeGoal(g);
            }
        }
    }

    // TODO: refactor into observers design?
    // Marks given goal as completed, adds given goal to list of completed goals, and rewards tokens
    public void completeGoal(Goal goal) {
        profile.addCompletedGoal(goal);
        profile.removeGoal(goal);
        profile.reward(goal.getReward());
    }
}
