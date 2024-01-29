package colpack;
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
        // Add tasks to the priority queue
        priorityQueue.add(new Task(5, "Do research"));
        priorityQueue.add(new Task(1, "Write report"));
        priorityQueue.add(new Task(3, "Prepare presentation"));
        priorityQueue.add(new Task(2, "Review draft"));
        priorityQueue.add(new Task(4, "Review draft2"));
        // Process tasks based on priority
        while (!priorityQueue.isEmpty()) {
            Task task = priorityQueue.poll();
            System.out.println("Task: " + task.getDescription() + ", Priority: " + task.getPriority());
        }
    }
}
class Task implements Comparable<Task> {
    private int priority;
    private String description;
    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }
    public int getPriority() {
        return priority;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}

