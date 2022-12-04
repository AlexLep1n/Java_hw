package com.lesson_3_hw;

import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное 
// и среднее арифметическое этого списка.

public class App3 {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        IntegerComparator comparator = new IntegerComparator();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int randNumber = rand.nextInt(10);
            listOfNumbers.add(randNumber);
        }
        System.out.println("Список до сортировки" + listOfNumbers);

        listOfNumbers.sort(comparator);
        System.out.println("Список после сортировки" + listOfNumbers);

        int max = listOfNumbers.get(listOfNumbers.size() - 1);
        int min = listOfNumbers.get(0);
        System.out.printf("Минимальное значение: %d\nМаксимальное значение: %d\n", min, max);

        float sum = 0;
        float result = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            float amount = listOfNumbers.size();
            sum += listOfNumbers.get(i);
            result = sum / amount;
        }
        System.out.printf("Среднее арифметическое этого списка: %.1f", result);
    }

    public static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 < o2) {
                return -1;
            }
            if (o1 > o2) {
                return 1;
            }
            return 0;
        }

    }
}
