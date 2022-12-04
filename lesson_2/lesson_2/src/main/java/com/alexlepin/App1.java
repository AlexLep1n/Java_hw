package com.alexlepin;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 В файле содержится строка с исходными данными в такой форме: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */
public class App1 {
    public static void main(String[] args) {
        File file = new File(
                "C:/Users/alexl/Desktop/GitHubRepos/Java_hw/lesson_2/lesson_2/file.txt");
        try (FileReader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            String fileContent = new String();
            for (int i = 1; i < chars.length - 1; i++) {
                fileContent += chars[i];
            }
            System.out.println("Строка из файла " + fileContent);
            String[] splitFileContent = fileContent.split(", ");
            StringBuilder nameSBuilder = new StringBuilder(splitFileContent[0]).replace(0, 7, "name = ");
            StringBuilder countrySBuilder = new StringBuilder(splitFileContent[1]).replace(0, 10, "country = ");
            StringBuilder citySBuilder = new StringBuilder(splitFileContent[2]).replace(0, 7, "city = ");
            System.out.println(nameSBuilder);
            System.out.println(countrySBuilder);
            System.out.println(citySBuilder);
            StringBuilder result = new StringBuilder(
                    "SELECT * FROM students WHERE " + nameSBuilder + " AND "
                            + countrySBuilder + " AND " + citySBuilder);
            System.out.println(result);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
