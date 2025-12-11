import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class SandwichSumTest {

    @Test
    public void testMainMethodSumsCorrectly() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
            10, 5, 2, 8, 5, 9, 10
        ));
        
        int result = SandwichSum.sumBetween(numbers, 5, 9);

        assertEquals(15, result, 
            "❌ ERROR: The sum between the first occurrence of 5 and first occurrence of 9 should be 15. " +
            "First 5 is at index 1, first 9 is at index 5. " +
            "Numbers between (indices 2, 3, 4): 2 + 8 + 5 = 15. " +
            "Your result: " + result + ". " +
            "Make sure you're finding the FIRST occurrence of each number using indexOf(), " +
            "and summing only the numbers STRICTLY between them (not including the start and end numbers themselves).");
    }
    
    @Test
    public void testDifferentNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
            1, 3, 7, 3, 5, 8, 2
        ));
        
        int result = SandwichSum.sumBetween(numbers, 3, 8);
        
        assertEquals(15, result, 
            "❌ ERROR: The sum between the first occurrence of 3 and first occurrence of 8 should be 15. " +
            "First 3 is at index 1, first 8 is at index 5. " +
            "Numbers between (indices 2, 3, 4): 7 + 3 + 5 = 15. " +
            "Your result: " + result + ". " +
            "This test makes you're not hardcoding the answer and works with different input values!");
    }
    
    @Test
    public void testSingleNumberBetween() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
            10, 2, 5, 7
        ));
        
        int result = SandwichSum.sumBetween(numbers, 2, 7);
        
        assertEquals(5, result, 
            "❌ ERROR: The sum between the first occurrence of 2 and first occurrence of 7 should be 5. " +
            "First 2 is at index 1, first 7 is at index 3. " +
            "Number between (index 2): 5. " +
            "Your result: " + result + ". " +
            "This test checks a case with only one number between the start and end.");
    }
}
