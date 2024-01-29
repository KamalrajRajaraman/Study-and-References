package colpack;
public class StackDemo {
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> stack = new Stack<>();
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after popping: " + stack);
        // Peek at the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
        System.out.println("Stack after peeking: " + stack);
        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
        // Get the size of the stack
        int size = stack.size();
        System.out.println("Stack size: " + size);
    }
}