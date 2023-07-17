package ru.netology.entities;

import ru.netology.interfaces.IShop;

public class Shop implements IShop {

    private final String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public void addProduct(Product product) {
        Storage.addStoreProduct(new StoreProduct(product, shopName));
    }
}
