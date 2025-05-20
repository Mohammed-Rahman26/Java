public class missing_element_array {
    public static void main (String[] args){
        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        int totalsum = n * ( n + 1) / 2;
        int originalsum = 0;
        for( int i = 0; i < arr.length; i++){
            originalsum += arr[i];
        }
        int missing = totalsum - originalsum;
        System.out.print(missing);
    }
}
