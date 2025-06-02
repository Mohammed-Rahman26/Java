//Write a program to peek(know the 1st eloement) into a stack.
import java.util.Stack;

public class stack_peek {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");

        System.out.println("Top element: " + stack.peek());
    }
}
