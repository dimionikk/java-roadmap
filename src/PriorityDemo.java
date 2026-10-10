public class PriorityDemo {
    public static void main(String[] args) {
        for (TaskPriority priority : TaskPriority.values()) {
            System.out.println(priority + " weight = " + priority.getWeight() + " isUrgent = " + priority.isUrgent());
        }
    }
}