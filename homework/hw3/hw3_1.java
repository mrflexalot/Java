// Реализовать алгоритм сортировки слиянием

package homework.hw3;

import java.util.Arrays;

public class hw3_1 {
    public static void mergeSort(int[] src, int n) {
        if (n < 2)
            return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        System.arraycopy(src, 0, left, 0, mid);
        System.arraycopy(src, mid, right, 0, n - mid);

        mergeSort(left, mid);
        mergeSort(right, n - mid);

        merge(src, left, right);
    }

    public static void merge(int[] src, int[] left, int[] right) {
        int k = 0, i = 0, j = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                src[k++] = left[i++];
            else
                src[k++] = right[j++];
        }

        while (i < left.length) {
            src[k++] = left[i++];
        }

        while (j < right.length) {
            src[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr0 = { 9, 8, 5, 20, 1, 0, 555 };
        mergeSort(arr0, 6);
        System.out.println(Arrays.toString(arr0));
    }
}
