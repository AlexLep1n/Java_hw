package org.example;

import java.util.Collections;
import java.util.LinkedList;

/*
 Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
 который вернет “перевернутый” список.
*/

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        int[] nums = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < nums.length; i++) {
            ll.add(nums[i]);
        }
        System.out.println("Изначальный LinkedList: " + ll);

        Collections.reverse(ll);
        System.out.println("Перевернутый LinkedList: " + ll);
    }
}
