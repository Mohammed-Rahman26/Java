//Write a program for Traversal over pre-order, in-order and post order, level-order. Find height of the tree and sum of all nodes in the tree.
import java.util.Scanner;
public class even_factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = sc.nextInt();
        System.out.println(" Even factors of " + num + " are:");
        for( int i = 2; i <= num; i++){
            if ( num % i == 0){
                if( num % 2 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
