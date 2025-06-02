//Write a program to reverse the string using stack.
import java.util.Stack;

public class stack_reverse_string {
    public static void main(String[] args) {
        String name = "rahman";
        String rev = " ";
        Stack<Character> st = new Stack<>();
        for( int i = 0; i < name.length(); i++){
            st.push(name.charAt(i));
        }
        while (!st.isEmpty()){
            char ch = st.pop();
            rev = rev + ch;
        }
        System.out.println(rev);
    }
}
