package ru.netology;

public class Roulette extends Building  {
    private final String name = "Рулетка";
    private final int price = 120;
    private int quantity;

    public Roulette (int quantity) {
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


    public boolean trySell(int quantity) {
    

        if(count <= 0) {
            return false;
        } else if ( count > this.quantity) {
            System.out.println("Недостаточно товара");
            return false;
        }
        this.quantity -= count;
        System.out.println("Данного товара осталось: " + this.quantity);

        return true;
    }
}
