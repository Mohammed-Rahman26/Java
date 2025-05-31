//Write a program to sort the array in ascending order.
import java.util.Arrays;
public class ascending_order_array {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3, -9, 5, 0 };
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
