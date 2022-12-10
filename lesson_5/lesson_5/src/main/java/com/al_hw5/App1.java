package com.al_hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 Реализуйте структуру телефонной книги с помощью HashMap, 
 учитывая, что один человек может иметь несколько телефонов.
*/

public class App1 {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        List<String> listOfPhoneNums1 = new ArrayList<>();
        listOfPhoneNums1.add("89218765432");
        listOfPhoneNums1.add("89211241456");

        List<String> listOfPhoneNums2 = new ArrayList<>();
        listOfPhoneNums2.add("89211234567");
        listOfPhoneNums2.add("89216347713");

        List<String> listOfPhoneNums3 = new ArrayList<>();
        listOfPhoneNums3.add("89217777777");
        listOfPhoneNums3.add("89218888888");

        phoneBook.put("Иван", listOfPhoneNums1);
        phoneBook.put("Сергей", listOfPhoneNums2);
        phoneBook.put("Артем", listOfPhoneNums3);

        System.out.println(phoneBook);
    }
}
