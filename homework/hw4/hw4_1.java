// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package homework.hw4;

import java.util.LinkedList;

public class hw4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<Integer>();
        lst.add(9);
        lst.add(8);
        lst.add(7);
        lst.add(6);
        lst.add(3);
        lst.add(0);
        System.out.print("Elements before reversing: " + lst);
        lst = reverseLinkedList(lst);
        System.out.print("\nElements after reversing: " + lst);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> lst) {
        LinkedList<Integer> lstReversed = new LinkedList<Integer>();
        for (int i = lst.size() - 1; i >= 0; i--) {
            lstReversed.add(lst.get(i));
        }
        return lstReversed;
    }
}
