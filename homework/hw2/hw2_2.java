// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package homework.hw2;

import java.io.*;
import java.util.Arrays;

/**
 * hw2_2
 */
public class hw2_2 {

    public static void main(String[] args) throws FileNotFoundException {
        int[] arr0 = { 9, 8, 5, 20, 1, 0 };
        PrintWriter log = new PrintWriter(new FileOutputStream("homework\\hw2\\log.txt"));
        boolean isSorted = false;
        int tmp;
        System.out.print(Arrays.toString(arr0) + " => ");
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr0.length - 1; i++) {
                if (arr0[i] > arr0[i + 1]) {
                    isSorted = false;
                    tmp = arr0[i];
                    arr0[i] = arr0[i + 1];
                    arr0[i + 1] = tmp;
                    log.println(Arrays.toString(arr0));
                }
            }
        }
        System.out.println(Arrays.toString(arr0));
        log.close();
    }
}