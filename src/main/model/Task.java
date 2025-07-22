package main.model;

public class Task {
    private String title;
    private String description;
    private boolean completed;

    // Constructs new task with title, description, and incomplete status
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    // MODIFIES: this
    // Sets completion status of task to true
    public void complete() {
        this.completed = true;
    }

    // Returns title of task
    public String getTitle() {
        return this.title;
    }

    // Returns description of task
    public String getDescription() {
        return this.description;
    }

    // Returns completion status of task
    public boolean getCompleted() {
        return this.completed;
    }
    
}
