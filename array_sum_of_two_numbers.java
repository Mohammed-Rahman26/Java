//Write a program to add two input numbers using array.
import java.util.Scanner;

public class SimpleAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an array to store two numbers
        int[] numbers = new int[2];

        // Input two numbers
        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        // Add the two numbers
        int sum = numbers[0] + numbers[1];

        // Print the result
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
