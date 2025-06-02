//Write a program to search for an element in the array.
import java.util.Scanner;
public class search_element_array{
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element the searching element : ");
        int search = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == search){
               found = true;
                break;
            }
        }
        if(found){
            System.out.print("Element found");
        }else{
            System.out.print("Not found");
        }
    }
}
