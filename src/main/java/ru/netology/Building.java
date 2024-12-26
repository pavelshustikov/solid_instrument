package ru.netology;

public abstract class Building {
    public String name;
    public int price;
    public int count;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Building setName(String name) {
        this.name = name;
        return this;
    }

    public Building setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getCount() {
        return count;
    }

    public Building setCount(int count) {
        this.count += count;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }


}




