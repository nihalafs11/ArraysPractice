public class TaskPrioritizer {
    public static void main(String[] args) {        
        ArrayList<String> tasks = new ArrayList<>(Arrays.asList(
            "Urgent",
            "Later",
            "Urgent",
            "Later",
            "Urgent"
        ));
    }
    
    public static void prioritize(ArrayList<String> tasks) {
        // TODO: Implement this method
        // Move all "Later" tasks to the end of the list
        // Keep "Urgent" tasks at the front
        // Maintain the relative order of "Later" tasks among themselves
    }
}
