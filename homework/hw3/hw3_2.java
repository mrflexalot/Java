// Пусть дан произвольный список целых чисел, удалить из него четные числа

package homework.hw3;

import java.util.*;

public class hw3_2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
            nums.add(rnd.nextInt(1, 100));
        }
        System.out.println(nums);
        for (Iterator<Integer> iterator = nums.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(nums);
    }
}
