package ru.netology.utils;

import ru.netology.entities.Storage;
import ru.netology.entities.StoreProduct;
import ru.netology.interfaces.IProductsFilter;

import java.util.List;
import java.util.stream.Collectors;

public class ProductsFilter implements IProductsFilter {

    // избегаем Magic numbers в коде
    private static final int MIN_QUANTITY = 0;

    public List<StoreProduct> getByKeyWord(String shopName, String keyWord) {
        return Storage.getStoreProducts().stream()
                .filter(storeProduct -> storeProduct.getShopName().toLowerCase().equalsIgnoreCase(shopName))
                .filter(storeProduct -> storeProduct.getName().toLowerCase().contains(keyWord.toLowerCase()))
                .filter(storeProduct -> storeProduct.getQuantity() > MIN_QUANTITY)
                .collect(Collectors.toList());
    }
}
