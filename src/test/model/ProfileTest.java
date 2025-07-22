package test.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.exceptions.InsufficientTokensException;
import main.model.Goal;
import main.model.Profile;
import main.model.Task;

public class ProfileTest {
    Profile p1;

    Task t1;
    Task t2;

    Goal g1;
    Goal g2;

    @BeforeEach
    void runBefore() {
        p1 = new Profile();

        t1 = new Task("Do homework", "");
        t2 = new Task("Write essay", "500 words");

        g1 = new Goal("Complete 5 tasks", 5, 500);
        g2 = new Goal("Complete 3 tasks", 3, 300);
    }

    @Test
    void testProfile() {
        assertEquals(0, p1.getTokens());
        assertEquals(LocalDate.now(), p1.getLastLogin());
        assertEquals(new HashMap<>(), p1.getTasks());
        assertEquals(new ArrayList<>(), p1.getCompletedTasks());
        assertEquals(new HashMap<>(), p1.getGoals());
        assertEquals(new ArrayList<>(), p1.getCompletedGoals());
    }

    @Test
    void testReward() {
        p1.reward(100);
        assertEquals(100, p1.getTokens());
    }

    @Test
    void testRewardMultiple() {
        p1.reward(100);
        p1.reward(1);
        assertEquals(101, p1.getTokens());
    }

    @Test
    void testSpend() {
        p1.reward(100);
        try {
            p1.spend(40);
            assertEquals(50, p1.getTokens());
        } catch (InsufficientTokensException e) {
            fail("InsufficientTokensException was mistakenly thrown");
        }
    }

    @Test
    void testSpendMultiple() {
        p1.reward(100);
        try {
            p1.spend(40);
            p1.spend(60);
            assertEquals(0, p1.getTokens());
        } catch (InsufficientTokensException e) {
            fail("InsufficientTokensException was mistakenly thrown");
        }
    }

    @Test
    void testSpendException() {
        try {
            p1.spend(100);
            fail("InsufficientTokensException was not thrown");
        } catch (InsufficientTokensException e) {

        }
    }

    @Test
    void testAddTask() {
        p1.addTask(t1);
        HashMap<String, Task> h = p1.getTasks();
        assertEquals(1, h.size());
    }

    @Test
    void testAddTaskMultiple() {
        p1.addTask(t1);
        p1.addTask(t2);
        HashMap<String, Task> h = p1.getTasks();
        assertEquals(2, h.size());
    }

    @Test
    void testRemoveTask() {
        p1.addTask(t1);
        p1.removeTask(t1);
        HashMap<String, Task> h = p1.getTasks();
        assertEquals(0, h.size());
    }

    @Test
    void testRemoveTaskMultiple() {
        p1.addTask(t1);
        p1.addTask(t2);
        p1.removeTask(t1);
        p1.removeTask(t2);
        HashMap<String, Task> h = p1.getTasks();
        assertEquals(0, h.size());
    }

    @Test
    void testAddCompletedTask() {
        t1.complete();
        p1.addCompletedTask(t1);
        List<Task> l = p1.getCompletedTasks();
        assertEquals(1, l.size());
    }

    @Test
    void testAddCompletedTaskMultiple() {
        t1.complete();
        p1.addCompletedTask(t1);
        t2.complete();
        p1.addCompletedTask(t2);
        List<Task> l = p1.getCompletedTasks();
        assertEquals(2, l.size());
    }

    @Test
    void testAddGoal() {
        p1.addGoal(g1);
        HashMap<String, Goal> h = p1.getGoals();
        assertEquals(1, h.size());
    }

    @Test
    void testAddGoalMultiple() {
        p1.addGoal(g1);
        p1.addGoal(g2);
        HashMap<String, Goal> h = p1.getGoals();
        assertEquals(2, h.size());
    }

    @Test
    void testRemoveGoal() {
        p1.addGoal(g1);
        p1.removeGoal(g1);
        HashMap<String, Goal> h = p1.getGoals();
        assertEquals(0, h.size());
    }

    @Test
    void testRemoveGoalMultiple() {
        p1.addGoal(g1);
        p1.addGoal(g2);
        p1.removeGoal(g1);
        p1.removeGoal(g2);
        HashMap<String, Goal> h = p1.getGoals();
        assertEquals(0, h.size());
    }

    @Test
    void testAddCompletedGoal() {
        g1.achieve();
        p1.addCompletedGoal(g1);
        List<Goal> l = p1.getCompletedGoals();
        assertEquals(1, l.size());
    }

    @Test
    void testAddCompletedGoalMultiple() {
        g1.achieve();
        p1.addCompletedGoal(g1);
        g2.achieve();
        p1.addCompletedGoal(g2);
        List<Goal> l = p1.getCompletedGoals();
        assertEquals(2, l.size());
    }

    @Test
    void testGetTokens() {
        assertEquals(0, p1.getTokens());
    }

    @Test
    void testGetLastLogin() {
        assertEquals(LocalDate.now(), p1.getLastLogin());
    }

    @Test
    void testGetTasks() {
        assertEquals(new HashMap<>(), p1.getTasks());
    }

    @Test
    void testGetCompletedTasks() {
        assertEquals(new ArrayList<>(), p1.getCompletedTasks());
    }

    @Test
    void testGetGoals() {
        assertEquals(new HashMap<>(), p1.getGoals());
    }

    @Test
    void testGetCompletedGoals() {
        assertEquals(new ArrayList<>(), p1.getCompletedGoals());
    }
}
