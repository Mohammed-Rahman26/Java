//Write a program to understand the nested loop to print marks dn rank achieved.
import java.util.Scanner;
public class marks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks=sc.nextInt();

        if(marks<=100 && marks>90){
            System.out.println("You acheived A+");
        }else if(marks<=90 && marks>80){
            System.out.println("Youy acheived A");
        }else if(marks<=80 && marks>70){
            System.out.println("You acheived B+");
        }else if(marks<=70 && marks>60){
            System.out.println("You acheived B");
        }else{
            System.out.println("You failed");
        }


    }
}
