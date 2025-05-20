import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int sum = 0;

        for (int n = input; n != 0; n = n / 10) {
            sum += n % 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}