package com.lesson_3_hw;

import java.util.ArrayList;

import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class App2 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randNumber = rand.nextInt(20);
            listOfNumbers.add(randNumber);
        }
        System.out.println(listOfNumbers);
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) % 2 == 0) {
                listOfNumbers.remove(i);
                i--;
            }
        }
        System.out.println(listOfNumbers);
    }
}
