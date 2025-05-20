import java.util.Stack;
public class stack_print_elements {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.pop();

        for (int num : stack) {
            System.out.println(num);
        }
    }
}