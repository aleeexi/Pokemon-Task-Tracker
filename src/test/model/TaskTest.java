package test.model;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.model.Task;

public class TaskTest {
    Task t1;
    Task t2;

    @BeforeEach
    void runBefore() {
        t1 = new Task("Do homework", "");
        t2 = new Task("Apply for jobs", "Apply to 5 jobs");
    }
    
    @Test
    void testTask() {
        assertEquals("Do homework", t1.getTitle());
        assertEquals("", t1.getDescription());
        assertFalse(t1.getCompleted());
    }

    @Test
    void testComplete() {
        t1.complete();
        assertTrue(t1.getCompleted());
    }

    @Test
    void testCompleteMultiple() {
        t1.complete();
        assertTrue(t1.getCompleted());
        t1.complete();
        assertTrue(t1.getCompleted());
    }

    @Test
    void testGetTitle() {
        assertEquals("Apply for jobs", t2.getTitle());
    }

    @Test
    void testGetDescription() {
        assertEquals("Apply to 5 jobs", t2.getDescription());
    }

    @Test
    void testGetCompleted() {
        assertFalse(t2.getCompleted());
    }
}
