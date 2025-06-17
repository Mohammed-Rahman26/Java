//Write a program to understand Time Complexity.
public class TimeComplexityExample {
    public static void main(String[] args) {
        int[] arr = new int[10000];  // change size for scaling test

        // Fill array with random values
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * 10000);

        // Start time
        long startTime = System.nanoTime();

        // Call the algorithm here
        bubbleSort(arr);  // Replace with mergeSort, quickSort, etc.

        // End time
        long endTime = System.nanoTime();

        // Total time in milliseconds
        System.out.println("Execution Time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    // Example: Bubble Sort
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                }
    }
}
