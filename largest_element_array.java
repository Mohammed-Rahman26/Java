//Write a program to find the largest element from an array.
public class largest_element_array {
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = arr[0];
        for ( int i = 0; i < arr.length; i ++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
