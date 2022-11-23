package com.alexlepin;

// Вывести все простые числа от 1 до 1000 
public class App2 {
    public static void main(String[] args) {
        int[] arr = new int[1001];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        for (int el : arr) {
            System.out.printf("%d ", el);
        }
        System.out.println("\n");
        System.out.println("Простые числа с 1 до 1000:");

        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.printf("%d ", arr[i]);
            }
        }
    }

    private static boolean isPrime(int number) {

        if (number <= 1)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
