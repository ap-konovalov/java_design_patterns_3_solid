package ru.netology.entities;

// open closed principle - исходный класс Product расширен новым полем
// применен Liskov substitution principle
public class StoreProduct extends Product {
    private final String shopName;

    public String getShopName() {
        return shopName;
    }

    public StoreProduct(Product product, String shopName) {
        super(product.getName(), product.getManufacturer(), product.getPrice(), product.getQuantity());
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return String.format("Название товара: '%s', производитель: '%s', цена: %s, количество в магазине: %s, магазин: %s",
                super.getName(), super.getManufacturer(), super.getPrice(), super.getQuantity(), shopName);
    }
}
