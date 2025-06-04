/*Write a program that repeatedly asks the user to enter a number. The program should keep asking until the user enters 0. 
  Once 0 is entered, the program should print the sum of all entered numbers.*/
import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers to sum (0 to stop):");

        while (true) {
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Sum of entered numbers: " + sum);
    }
}
