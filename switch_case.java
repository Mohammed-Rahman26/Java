//Write a program to understand the switch and case concept.
import java.util.Scanner;
public class switch_case {
    public static void main (String[] args){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int evenodd=num % 2;
        switch(evenodd){
            case 0 :
                System.out.println("Even number");
                break;
            case 1 :
                System.out.println("Odd Number");
                break;
            default :
                System.out.println("Invalid Number");

        }

    }
}
