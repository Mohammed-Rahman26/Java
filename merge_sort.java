//Write a program to understand merge sort.
public class SimpleMergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= end)
            temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++)
            arr[start + x] = temp[x];
    }
}
