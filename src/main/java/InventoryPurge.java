public class InventoryPurge {
    public static void main(String[] args) {        
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
    }
    
    public static void purgeInventory(ArrayList<String> shelf, ArrayList<String> recalled) {
        // TODO: Implement this method
        // Remove all items from shelf that are found in recalled
        // You MUST modify shelf in-place (do not create a new list)
        // You MUST use .contains() to check if an item is recalled
        // Hint: Be careful about index shifting when removing during iteration!
    }
}
