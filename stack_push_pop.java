//Write a programm to perform push and pop operations on a stack.
import java.util.Stack;

public class stack_push_pop {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        for(int i = 0; i < 3; i++ ){
            int popped = stack.pop();
            System.out.println("Popped element: " + popped);

        }

        System.out.println("Current stack: " + stack);
    }
}
