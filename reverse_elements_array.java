public class reverse_elements_array{
    public static void main (String [] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original Array:");
        for ( int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int n = arr.length;
        for(int i = 0; i < n / 2; i ++){
            int temp = arr[i];
            arr[i] = arr[ n - 1 - i];
            arr[ n - 1 - i] = temp;
        }
        System.out.print("\n");
        System.out.println("Reversed Array:");
        for ( int i = 0; i < arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[0]);
    }
}