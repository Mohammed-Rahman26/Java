//Write a program to search for an element in the stack.
import java.util.Stack;
public class stack_search_element {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Green");
        stack.push("Blue");

        System.out.println("Position of 'Green': " + stack.search("Green"));
        System.out.println("Position of 'Yellow': " + stack.search("Yellow"));
        System.out.println("Position of 'Blue' : " + stack.search("Blue"));
    }
}
