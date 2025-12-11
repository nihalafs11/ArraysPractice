import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class InventoryPurgeTest {

    @Test
    public void testMainMethodRemovesCorrectItems() {
        ArrayList<String> shelf = new ArrayList<>(Arrays.asList(
            "apple",
            "banana",
            "orange",
            "grape",
            "kiwi",
            "mango",
            "Dax's Hockey Stick",
            "Adam's Squid Games Bread",
            "Broken Polytrack Wheel",
            "watermelon",
            "pineapple"
        ));
        ArrayList<String> recalled = new ArrayList<>(Arrays.asList(
            "Dax's Hockey Stick",
            "Adam's Squid Games Bread",
            "Broken Polytrack Wheel"
        ));
        
        ArrayList<String> originalShelfReference = shelf;
        ArrayList<String> originalRecalledReference = recalled;
        ArrayList<String> originalRecalledContents = new ArrayList<>(recalled);
        
        InventoryPurge.purgeInventory(shelf, recalled);
        
        assertSame(originalShelfReference, shelf, 
            "❌ ERROR: You must modify the original 'shelf' list in-place. " +
            "Do NOT create a new ArrayList inside your method. " +
            "The method should modify the existing list that was passed in, not return a new one.");
        
        assertSame(originalRecalledReference, recalled, 
            "❌ ERROR: The 'recalled' list should NOT be modified. " +
            "Only modify the 'shelf' list, leave 'recalled' unchanged.");
        assertEquals(originalRecalledContents, recalled, 
            "❌ ERROR: The 'recalled' list contents should remain unchanged. " +
            "You should only remove items from 'shelf', not modify 'recalled'.");
        
        assertEquals(8, shelf.size(), 
            "❌ ERROR: After removing 3 recalled items from 11 items, the shelf should have exactly 8 items. " +
            "Current size: " + shelf.size() + ". " +
            "Make sure you're removing all items that appear in the recalled list.");
        
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(
            "apple",
            "banana",
            "orange",
            "grape",
            "kiwi",
            "mango",
            "watermelon",
            "pineapple"
        ));
        
        assertEquals(expected, shelf, 
            "❌ ERROR: The shelf does not contain the correct items after purging. " +
            "Expected: [apple, banana, orange, grape, kiwi, mango, watermelon, pineapple] " +
            "(8 items, with the 3 recalled items removed). " +
            "Your result: " + shelf + ". " +
            "Make sure you're using .contains() to check if items are in the recalled list, " +
            "and be careful about index shifting when removing items during iteration!");
    }
}
