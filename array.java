public class array {
    public static void main (String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        System.out.println(arr[4]);
        System.out.println(arr[8]);
        System.out.println(arr.length);

        for ( int i = 0; i < arr.length; i++){
            if( i != 4 && i != 7){ // If we don't want to print any element from array use if and index value to avoid it.
            System.out.println(arr[i]);
             }
        }
    }
}
