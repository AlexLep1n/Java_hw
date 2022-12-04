package com.alexlepin;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
// import java.util.logging.XMLFormatter;

/*
 Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class App2 {
    public static void main(String[] args) {
        try {
            int[] nums = { 5, 2, 7, 1, 6, 0 };
            int buf;
            Logger logger = Logger.getLogger(App2.class.getName());
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            // второй вариант формата записи в лог-файл
            // XMLFormatter xml = new XMLFormatter();
            // fh.setFormatter(xml);
            SimpleFormatter smp = new SimpleFormatter();
            fh.setFormatter(smp);

            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        isSorted = false;
                        buf = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = buf;
                        logger.info("Числовой массив после итерации = " + Arrays.toString(nums));
                    }
                }
            }
        } catch (SecurityException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
