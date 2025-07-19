package test.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.Goal;

public class GoalTest {
    Goal g1;
    Goal g2;

    @BeforeEach
    void runBefore() {
        g1 = new Goal("Complete 5 tasks", 5, 500);
        g2 = new Goal("Complete 2 tasks", 2, 200);
    }

    @Test
    void testGoal() {
        assertEquals("Complete 5 tasks", g1.getName());
        assertEquals(5, g1.getCriteria());
        assertEquals(0, g1.getProgress());
        assertEquals(500, g1.getReward());
        assertFalse(g1.getAchieved());
    }

    @Test
    void testProgress() {
        g2.progress();
        assertEquals(1, g2.getProgress());
        assertFalse(g2.getAchieved());
    }

    @Test
    void testProgressAchieve() {
        g2.progress();
        g2.progress();
        assertEquals(2, g2.getProgress());
        assertTrue(g2.getAchieved());
    }

    @Test
    void testProgressAchieved() {
        g2.progress();
        g2.progress();
        g2.progress();
        assertEquals(2, g2.getProgress());
        assertTrue(g2.getAchieved());
    }

    @Test
    void testAchieve() {
        g1.achieve();
        assertTrue(g1.getAchieved());
    }

    @Test
    void testAchieveMultiple() {
        g1.achieve();
        g1.achieve();
        assertTrue(g1.getAchieved());
    }

    @Test
    void testGetName() {
        assertEquals("Complete 2 tasks", g2.getName());
    }

    @Test
    void testGetCriteria() {
        assertEquals(2, g2.getCriteria());
    }

    @Test
    void testGetProgress() {
        assertEquals(0, g2.getProgress());
    }

    @Test
    void testGetReward() {
        assertEquals(200, g2.getReward());
    }

    @Test
    void testGetAchieved() {
        assertEquals(false, g2.getAchieved());
    }
}
