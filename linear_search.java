//Write a program to perform linear search on an array.
import java.util.*;
public class linear_search {
    public static void main(String[] args) {
        int[] arr = {10, 9, 7, 12, 15, 3};
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the elements you want to search:");
        int search = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Element found.");
        } else{
            System.out.println("Element not found");
        }

    }
}
