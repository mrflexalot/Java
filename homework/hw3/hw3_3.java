// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package homework.hw3;

import java.util.*;

public class hw3_3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            lst.add(rnd.nextInt(1, 100));
        }
        System.out.println(lst);
        System.out.println(Collections.max(lst));
        System.out.println(Collections.min(lst));
        System.out.println(average(lst));
    }
    static double average (ArrayList<Integer> lst) {
        
        double sum = 0;
        
        for(int i=0;i<lst.size();i++) {
            sum+=lst.get(i);
        }
        
        return sum/lst.size();
    }
}
