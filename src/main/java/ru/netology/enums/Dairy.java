package ru.netology.enums;

public enum Dairy {
    MILK("Молоко"),
    CHEES("Сыр");

    public String getProductName() {
        return productName;
    }

    private final String productName;

    Dairy(String product) {
        this.productName = product;
    }
}
