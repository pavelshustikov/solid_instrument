package ru.netology;

public class Roulette extends Building implements Instrument {
    private final String name = "Рулетка";
    private final int price = 120;


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
        System.out.println("Рулетка продана");

    }
}
