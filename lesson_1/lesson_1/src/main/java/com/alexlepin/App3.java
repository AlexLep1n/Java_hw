package com.alexlepin;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        double numOne, numTwo;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        if (reader.hasNextDouble()) {
            double res;
            numOne = reader.nextDouble();
            numTwo = reader.nextDouble();
            System.out.println("Введите символ операции (+, -, *, /): ");
            if (reader.hasNextLine()) {
                op = reader.next().charAt(0);
                reader.close();
                switch (op) {
                    case '+':
                        res = numOne + numTwo;
                        System.out.println("Результат операции над числами:");
                        System.out.printf("%.1f * %.1f = %.1f", numOne, numTwo, res);
                        break;
                    case '-':
                        res = numOne - numTwo;
                        System.out.println("Результат операции над числами:");
                        System.out.printf("%.1f * %.1f = %.1f", numOne, numTwo, res);
                        break;
                    case '*':
                        res = numOne * numTwo;
                        System.out.println("Результат операции над числами:");
                        System.out.printf("%.1f * %.1f = %.1f", numOne, numTwo, res);
                        break;
                    case '/':
                        res = numOne / numTwo;
                        System.out.println("Результат операции над числами:");
                        System.out.printf("%.1f * %.1f = %.1f", numOne, numTwo, res);
                        break;
                    default:
                        System.out.println("Введен некорректный символ операции!");
                }
            }
        } else {
            System.out.println("Введен некоректный символ!");
        }
    }
}
