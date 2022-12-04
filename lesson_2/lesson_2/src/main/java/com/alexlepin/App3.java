package com.alexlepin;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 В файле содержится строка с данными:

 [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

 Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

 Студент Иванов получил 5 по предмету Математика.
 Студент Петрова получил 4 по предмету Информатика.
 Студент Краснов получил 5 по предмету Физика.
 */
public class App3 {
    public static void main(String[] args) {
        pars("C:/Users/alexl/Desktop/GitHubRepos/Java_hw/lesson_2/lesson_2/text.txt");
    }

    public static void pars(String filePath) {
        File file = new File(filePath);
        try (FileReader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);
            String fileContent = new String();
            for (int i = 1; i < chars.length - 2; i++) {
                if (chars[i] != '{' && chars[i] != '}' && chars[i] != '[' && chars[i] != ']') {
                    fileContent += chars[i];
                }
            }
            System.out.println("Строка из файла: " + fileContent);
            String firstLine = fileContent.replace('"', ' ').trim().substring(0, 52);
            String secondLine = fileContent.replace('"', ' ').trim().substring(56, 110);
            String thirdLine = fileContent.replace('"', ' ').trim().substring(114, 163);
            String[] splitStrings = { firstLine, secondLine, thirdLine };
            String[] surnames = new String[3];
            String[] rates = new String[3];
            String[] subjects = new String[3];
            String arrOfStrings = new String("Студент  получил  по предмету .");
            StringBuilder ivanov = new StringBuilder(arrOfStrings);
            StringBuilder petrova = new StringBuilder(arrOfStrings);
            StringBuilder krasnov = new StringBuilder(arrOfStrings);
            for (int i = 0; i < splitStrings.length; i++) {
                surnames[i] = splitStrings[i].substring(10, 17).trim();
                rates[i] = splitStrings[i].substring(28, 30).trim();
                subjects[i] = splitStrings[i].substring(42, splitStrings[i].length()).trim();
            }
            ivanov = ivanov.insert(8, surnames[0]).insert(23, rates[0]).insert(37, subjects[0]);
            petrova = petrova.insert(8, surnames[1]).insert(24, rates[1]).insert(38, subjects[1]);
            krasnov = krasnov.insert(8, surnames[2]).insert(24, rates[2]).insert(38, subjects[2]);

            // System.out.println(ivanov);
            // System.out.println(petrova);
            // System.out.println(krasnov);
            String[] resultString = new String[3];
            resultString[0] = ivanov.toString();
            resultString[1] = petrova.toString();
            resultString[2] = krasnov.toString();
            for (int i = 0; i < resultString.length; i++) {
                System.out.println(resultString[i]);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }
}
