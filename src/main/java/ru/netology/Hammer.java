package ru.netology;

public class Hammer extends Building implements Instrument {
    //Single Responsibility Principle
    private final String name = "Молоток";
    private final int price = 100;


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
