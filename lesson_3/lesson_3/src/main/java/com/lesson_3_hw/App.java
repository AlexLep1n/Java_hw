package com.lesson_3_hw;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int[] numbers = new int[] { 5, 1, 2, 3, 7, 0, 9, 3, 8, 7 };
        int[] sortedArray = mergeSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] mergeSort(int[] numbers, int begin, int end) {
        if (begin == end) {
            return new int[] { numbers[begin] };
        }

        int mid = (begin + end) / 2;
        int[] left = mergeSort(numbers, begin, mid);
        int[] right = mergeSort(numbers, mid + 1, end);
        int[] result = new int[end - begin + 1];

        // соединяем отсортированные левый и правый массивы
        int leftIndex = 0;
        int rightIndex = 0;
        for (int resultIndex = 0; resultIndex < result.length; resultIndex++) {
            if (leftIndex >= left.length) {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            } else if (rightIndex >= right.length) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else if (left[leftIndex] < right[rightIndex]) {
                result[resultIndex] = left[leftIndex];
                leftIndex++;
            } else {
                result[resultIndex] = right[rightIndex];
                rightIndex++;
            }
        }
        return result;
    }
}
