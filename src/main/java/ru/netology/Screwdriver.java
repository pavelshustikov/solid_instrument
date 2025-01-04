package ru.netology;

public class Screwdriver extends Building implements Instrument {

    private final String name = "Отвертка";
    private int quantity;
    private boolean sold = false;
    private final int price = 1200;

    public Screwdriver (int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public boolean trySell(int count) {


        if(count <= 0) {
            return false;
        } else if ( count > quantity) {
            System.out.println("Недостаточно товара");
            return false;
        }
        quantity -= count;
        System.out.println("Данного товара осталось: " + quantity);

        return true;
    }
}
