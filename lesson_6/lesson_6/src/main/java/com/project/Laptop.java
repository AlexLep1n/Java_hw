package com.project;

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

public class Laptop {
	private String name;
	private Integer ram;
	private Integer hardMemory;
	private String color;
	private String operationSystem;

	public Laptop(String name, Integer ram, Integer hardMemory, String color, String operationSystem) {
		this.name = name;
		this.ram = ram;
		this.hardMemory = hardMemory;
		this.color = color;
		this.operationSystem = operationSystem;
	}

	public String getName() {
		return name;
	}

	public Integer getRam() {
		return ram;
	}

	public Integer getHardMemory() {
		return hardMemory;
	}

	public String getColor() {
		return color;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	@Override
	public String toString() {
		return "Название: " + name + ", ОЗУ: " + ram + ", Объем HD: " + hardMemory + ", Цвет: " + color
				+ ", OS: " + operationSystem;
	}

}
