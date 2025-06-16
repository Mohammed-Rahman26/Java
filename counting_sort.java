//Write a program to understand counting sort(Only works with non-negative small numbers).
public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};

        int max = 0;
        for (int num : arr)
            max = Math.max(max, num);

        int[] count = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0)
                arr[index++] = i;
        }

        for (int num : arr)
            System.out.print(num + " ");
    }
}
