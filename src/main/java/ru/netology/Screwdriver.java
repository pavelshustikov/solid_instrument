package ru.netology;

public class Screwdriver extends Building implements Instrument {

    //Open Closed Principle

    private final String name = "Отвертка";
    private final int price = 80;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void sale() {
        System.out.println("Молоток продан");
    }
}
