package ru.netology.entities;

import java.util.ArrayList;
import java.util.List;

// Применен паттерн Singleton для создания общей для всех магазинов базы данных продуктов.
// Есть один склад с которого товар поступает во все магазины.

// single responsibility principle - склад отвечает только за операции с товаром
public class Storage {

    private static final List<StoreProduct> STORE_PRODUCTS = new ArrayList<>();

    private Storage() {
    }

    public static List<StoreProduct> getStoreProducts() {
        return STORE_PRODUCTS;
    }

    public static void addStoreProduct(StoreProduct product) {
        STORE_PRODUCTS.add(product);
    }
}
