import java.util.Scanner;
public class factor_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your num2: ");
        int num2 = sc.nextInt();
        boolean isFactor = true;
        for(int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                if (i == num2) {
                    isFactor = true;
                }
            }
        }
        if(isFactor){
            System.out.println("num2 is a factor of num1");
        }else {
            System.out.println("num2 is not a factor of num1");
        }
    }
}
