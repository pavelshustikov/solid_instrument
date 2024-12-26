package ru.netology;

public class Bath extends Building implements Bathroom, Plumbing {
    //Interface Segregation Principle
    //Dependency Inversion Principle

    private final String name = "Ванна";
    private final int price = 500;

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void enable() {
        System.out.println("Ванна в корзине");
    }

    @Override
    public void carry() {
        System.out.println("Ванна куплена");
    }


}
