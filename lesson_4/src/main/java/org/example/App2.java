package org.example;

import java.util.LinkedList;

/*
 Реализуйте очередь с помощью LinkedList со следующими методами:
 enqueue() - помещает элемент в конец очереди, 
 dequeue() -  возвращает первый элемент из очереди и удаляет его, 
 first() - возвращает первый элемент из очереди, не удаляя.
*/

public class App2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int[] nums = { 5, 1, 3, 8, 7, 4 };

        for (int i = 0; i < nums.length; i++) {
            ll.add(nums[i]);
        }

        System.out.println("Base ll: " + ll + "\n");

        enqueue(ll, 246); // помещает элемент в конец очереди
        System.out.println("Use enqueue:\nСписок после добавления: " + ll + "\n");

        // возвращает первый элемент из очереди и удаляет его
        System.out.println("Use dequeue:\nВозвращает: " + dequeue(ll) + "\nСписок после удаления: " + ll + "\n");

        // возвращает первый элемент из очереди и удаляет его
        System.out.println("Use first:\nВозвращает: " + first(ll) + "\nСписок после использования: " + ll);
    }

    public static void enqueue(LinkedList<Integer> ll, Integer element) {
        ll.addLast(element);
    }

    public static Integer dequeue(LinkedList<Integer> ll) {
        return ll.removeFirst();
    }

    public static Integer first(LinkedList<Integer> ll) {
        return ll.getFirst();
    }

}
