package ru.netology;

import java.util.Scanner;

public class Main {
    //Magic Numbers Principle - вместо чисел используем константы
    public static final char RUB = (char) 0x20BD;

    public static void main(String[] args) {
        //Liskov substitution principle
        Building[] buildings = {new Screwdriver(), new Roulette(), new Hammer(), new Bath()};
        //принцип DRY
        printBuildings(buildings);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер товара и количество или введите `0` ");
            String input = scanner.nextLine();
            if ("0".equals(input)) break;
            String[] parts = input.split(" ");
            int buildingNumber = Integer.parseInt(parts[0]) - 1;
            buildings[buildingNumber].setCount(Integer.parseInt(parts[1]));
        }
        printBuildings(buildings);
        printBasket(buildings);
    }

    private static void printBuildings(Building[] buildings) {
        System.out.println("Список возможных товаров для покупки: ");
        for (int i = 0; i < buildings.length; i++) {
            System.out.println((i + 1) + ". " + buildings[i]);
        }
    }

    private static void printBasket(Building[] buildings) {
        int costBuildings = 0;
        System.out.println("Ваша корзина: ");
        for (Building building : buildings) {
            if (building.getCount() != 0) {
                costBuildings += building.getCount() * building.getPrice();
                System.out.println(building + " 'количество'= " + building.getCount() + " шт."
                        + " 'цена'= " + building.getPrice() + " " + RUB
                        + " 'стоимость'= " + building.getCount() * building.getPrice() + " " + RUB);
            }
        }
        System.out.println("Итого: " + costBuildings + " " + RUB);
    }
}