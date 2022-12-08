package org.example;
/*
Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
Например:
5 4 3 − +       =>     5 1 +     =>      6 
*/

import java.util.Stack;
import java.util.*;

public class App3 {
    public static void main(String[] args) {
        var expIn = "5 4 3 - +".split(" ");
        System.out.println(Arrays.toString(expIn));
        int res = 0;

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < expIn.length; i++) {

            if (isDigit(expIn[i])) {
                st.push(Integer.parseInt(expIn[i]));
            } else {
                switch (expIn[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                }

            }
        }
        System.out.println("Ответ: " + st.pop());
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
    }

}
