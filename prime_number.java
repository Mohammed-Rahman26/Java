//Write a program to find if the given number is prime or not.
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
