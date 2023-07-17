package ru.netology.enums;

public enum Manufacturer {
    VILLAGE_HOUSE("Домик в деревне"),
    GREEN_VILLAGE("Село зеленое"),
    PROSTOKVASHINO("Простоквашино"),
    NO_NAME("Неизвестный  производитель");

    public String getManufacturerName() {
        return manufacturerName;
    }

    private final String manufacturerName;

    Manufacturer(String product) {
        this.manufacturerName = product;
    }
}
