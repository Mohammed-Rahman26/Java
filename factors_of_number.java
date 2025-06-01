//Write a program to find the factors of a number.
import java.util.Scanner;
public class factors_of_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = sc.nextInt();
        System.out.println("Factors of " + num + " are:");
        for( int i = 1; i <= num; i++){
            if ( num % i == 0){
                System.out.println(i);
            }
        }
    }
}
