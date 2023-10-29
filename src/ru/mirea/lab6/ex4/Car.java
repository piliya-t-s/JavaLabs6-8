package ru.mirea.lab6.ex4;

public class Car implements Priceable {
    private float price;
    public Car(float price) {
        this.price = price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }
}
