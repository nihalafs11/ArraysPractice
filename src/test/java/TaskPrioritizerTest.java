import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskPrioritizerTest {

    @Test
    public void testMainMethodPrioritizesCorrectly() {
        ArrayList<String> tasks = new ArrayList<>(Arrays.asList(
            "Urgent",
            "Later",
            "Urgent",
            "Later",
            "Urgent"
        ));
        
        ArrayList<String> originalTasksReference = tasks;
        
        TaskPrioritizer.prioritize(tasks);
        
        assertSame(originalTasksReference, tasks, 
            "❌ ERROR: You must modify the original 'tasks' list in-place. " +
            "Do NOT create a new ArrayList inside your method. " +
            "The method should modify the existing list that was passed in, not return a new one.");
        
        assertEquals(5, tasks.size(), 
            "❌ ERROR: The list should still have exactly 5 tasks after prioritizing. " +
            "Current size: " + tasks.size() + ". " +
            "Make sure you're moving items, not removing or duplicating them.");
        
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(
            "Urgent",
            "Urgent",
            "Urgent",
            "Later",
            "Later"
        ));
        
        assertEquals(expected, tasks, 
            "❌ ERROR: The tasks list is not prioritized correctly. " +
            "Expected: [Urgent, Urgent, Urgent, Later, Later] " +
            "(all 'Urgent' tasks first, then all 'Later' tasks, maintaining relative order). " +
            "Your result: " + tasks + ". " +
            "Make sure you're moving 'Later' tasks to the end while keeping 'Urgent' tasks at the front. " +
            "Be careful about loop bounds when adding/removing items during iteration!");
    }
}
