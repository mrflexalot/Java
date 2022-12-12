// Реализовать простой калькулятор

package homework.hw1;

import java.util.Scanner;

public class hw1_3 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double res;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers splitted by Enter button: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        reader.close();
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.printf("Error! Invalid symbol, please use '+, -, *, /' instead!");
                return;
        }
        System.out.print("\nThe operation result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + res);
    }
}
