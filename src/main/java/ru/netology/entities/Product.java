package ru.netology.entities;

public class Product {
    private String name;
    private String manufacturer;
    private double price;

    private int quantity;

    public Product(String name, String manufacturer, double price, int quantity) {
        checkIsPositive(price);
        checkIsPositive(quantity);
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    private void checkIsPositive(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена должна быть положительным числом");
        }
    }

    private void checkIsPositive(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Количество товаров не может быть меньше 0");
        }
    }
}
