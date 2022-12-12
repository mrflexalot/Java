// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package homework.hw1;

import java.util.Scanner;

public class hw1_1 {
    public static int triangularNum(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            res += i;
        }
        return res;
    }

    public static int factorialNum(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number n to calculate factorial and triangular number from 1 to n: ");
        int n = reader.nextInt();
        reader.close();
        System.out.print("Sum of numbers from 1 to n: ");
        System.out.println(triangularNum(n));
        System.out.print("Factorial of number n: ");
        System.out.println(factorialNum(n));
    }
}
