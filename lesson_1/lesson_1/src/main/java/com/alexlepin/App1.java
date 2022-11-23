package com.alexlepin;

import java.util.Scanner;

import javax.naming.NamingEnumeration;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class App1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num1 = scanner.nextInt();
        scanner.close();
        int res = (num1 * (num1 + 1)) / 2;
        System.out.printf("Результат вычисления треугольного числа: %d\n", res);

        int task2 = fact(5);
        System.out.printf("Результат вычисления факторила: %d", task2);
    }

    static int fact(int number) {
        if (number == 1) {
            return 1;
        }
        return number * fact(number - 1);
    }

}
