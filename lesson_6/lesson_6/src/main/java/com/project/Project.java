package com.project;

import java.util.*;
import java.util.Map.Entry;

/*
 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 Создать множество ноутбуков.
 Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
	“Введите цифру, соответствующую необходимому критерию:
	1 - ОЗУ
	2 - Объем ЖД
	3 - Операционная система
	4 - Цвет …
 Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

public class Project {
    public static void main(String[] args) {

        Laptop lt1 = new Laptop("Lenovo", 16, 1000, "Black", "Linux");
        Laptop lt2 = new Laptop("Acer", 8, 512, "White", "Windows8");
        Laptop lt3 = new Laptop("Asus", 16, 512, "Yellow", "Windows10");
        Laptop lt4 = new Laptop("HP", 8, 256, "Blue", "Windows7");
        Laptop lt5 = new Laptop("MSI", 32, 2000, "Green", "Windows11");

        Set<Object> laptops = new HashSet<>();
        laptops.add(lt1);
        laptops.add(lt2);
        laptops.add(lt3);
        laptops.add(lt4);
        laptops.add(lt5);

        // Iterator<Object> iterator = laptops.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        fillter(laptops);
    }

    public static void fillter(Set<Object> laptops) {
        Map<String, String> filteringCriteria = new TreeMap<>();
        filteringCriteria.put("1 ", " Объем ОЗУ");
        filteringCriteria.put("2 ", " Объем HD");
        filteringCriteria.put("3 ", " Цвет");
        filteringCriteria.put("4 ", " Операционная система");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите критерий для фильтрации:");
        for (Entry<String, String> filter : filteringCriteria.entrySet()) {
            System.out.println(filter);
        }

        int filterNum = scanner.nextInt();

        if (filterNum == 1) {
            System.out.println("\nВведите необходимый размер ОЗУ = 8, 16 или 32 гБ:");
            int ramIn = scanner.nextInt();
            System.out.println("\nНоутбуки, подходящие под текущий фильтр:");

            for (Object object : laptops) {
                if (((Laptop) object).getRam() == ramIn) {
                    System.out.println(object);
                }
            }
        } else if (filterNum == 2) {
            System.out.println("\nВведите необходимый объем HD = 256, 512, 1000 или 2000 гБ:");
            int hardMemoryIn = scanner.nextInt();
            System.out.println("\nНоутбуки, подходящие под текущий фильтр:");

            for (Object object : laptops) {
                if (((Laptop) object).getHardMemory() == hardMemoryIn) {
                    System.out.println(object);
                }
            }
        } else if (filterNum == 3) {
            System.out.println("\nВведите необходимый цвет:");
            String colorIn = scanner.next();
            System.out.println("\nНоутбуки, подходящие под текущий фильтр:");

            for (Object object : laptops) {
                if (colorIn.equals(((Laptop) object).getColor())) {
                    System.out.println(object);

                }
            }
        } else if (filterNum == 4) {
            System.out.println("\nВведите необходимую операционную систему:");
            String osIn = scanner.next();
            System.out.println("\nНоутбуки, подходящие под текущий фильтр:");

            for (Object object : laptops) {
                if (osIn.equals(((Laptop) object).getOperationSystem())) {
                    System.out.println(object);
                }
            }
        }
        scanner.close();
    }
}