package com.al_hw5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
 Написать программу, которая найдет и выведет повторяющиеся имена 
 с количеством повторений. Отсортировать по убыванию популярности.
 */

public class App2 {
    public static void main(String[] args) {
        Map<Integer, String> listOfWorkers = new HashMap<>();
        listOfWorkers.put(0, "Иван");
        listOfWorkers.put(1, "Петр");
        listOfWorkers.put(2, "Антон");
        listOfWorkers.put(3, "Иван");
        listOfWorkers.put(4, "Петр");
        listOfWorkers.put(5, "Антон");
        listOfWorkers.put(6, "Иван");
        listOfWorkers.put(7, "Петр");
        listOfWorkers.put(8, "Антон");
        listOfWorkers.put(9, "Иван");
        listOfWorkers.put(10, "Петр");
        listOfWorkers.put(11, "Антон");
        listOfWorkers.put(12, "Иван");
        listOfWorkers.put(13, "Антон");
        listOfWorkers.put(14, "Антон");
        System.out.println(listOfWorkers);

        countingWorkers(listOfWorkers);
    }

    public static void countingWorkers(Map<Integer, String> listOfWorkers) {
        int countIvan = 0;
        int countPetr = 0;
        int countAnton = 0;
        Map<String, Integer> resultMap = new HashMap<>();

        for (String value : listOfWorkers.values()) {
            if (value == "Иван") {
                countIvan++;
                resultMap.put("Иван", countIvan);
            } else if (value == "Петр") {
                countPetr++;
                resultMap.put("Петр", countPetr);
            } else if (value == "Антон") {
                countAnton++;
                resultMap.put("Антон", countAnton);
            }
        }
        System.out.println(resultMap);
    }
}
