import java.util.Scanner;
public class prime_factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :");
        int num = sc.nextInt();
        System.out.println(" Prime factors of " + num + " are:");
        for( int i = 2; i <= num; i++){
            if ( num % i == 0){
                boolean isPrime = true;
                for( int j = 2; j< i; j++){
                    if( i % j == 0){
                        isPrime = false;
                    }
                }
                if( isPrime){
                    System.out.println(i);
                }
            }
        }
    }
}
