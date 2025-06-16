//Write a program to understand quick sort.
public class SimpleQuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2};

        quickSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i]; arr[i] = arr[high]; arr[high] = temp;

        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }
}
