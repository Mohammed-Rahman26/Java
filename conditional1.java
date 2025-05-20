import java.util.Scanner;
public class conditional1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("You can vote");
        }


    }
}
