//Write a program to understand radix sort(Works for positive numbers).
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        int max = getMax(arr);

        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(arr, exp);

        for (int num : arr)
            System.out.print(num + " ");
    }

    static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr)
            if (num > max) max = num;
        return max;
    }

    static void countSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int i = 0; i < arr.length; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = (arr[i] / exp) % 10;
            output[count[idx] - 1] = arr[i];
            count[idx]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }
}
