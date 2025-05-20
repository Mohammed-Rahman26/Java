import java.util.Scanner;
public class reverse_the_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int rev = 0;

        for (int n = input; n != 0; n = n / 10) {
            int digit = n % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reversed number = " + rev);
    }
}