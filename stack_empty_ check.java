//Write a program to check if the stack is empty or not.
import java.util.Stack;
class stack_empty_check {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        System.out.println("Is stack empty? " + stack.isEmpty()); // true

        stack.push('A');
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
