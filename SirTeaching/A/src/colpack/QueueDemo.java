package colpack;
public class QueueDemo {
	public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // Enqueue elements at the rear
        deque.offer("anand");
        deque.offer("balu");
        deque.offer("chandran");
        // Dequeue and print elements from the front
        while (!deque.isEmpty()) {
            String frontElement = deque.poll();
            System.out.println("Front Dequeued: " + frontElement);
        }
        // Push elements onto the front
        deque.push("anand");
        deque.push("balu");
        deque.push("chandran");
        // Pop and print elements from the front
        while (!deque.isEmpty()) {
            String frontElement = deque.pop();
            System.out.println("Front Popped: " + frontElement);
        }
        System.out.println(deque);
    }
}

