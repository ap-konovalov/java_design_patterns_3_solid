package ru.netology.interfaces;

import ru.netology.entities.StoreProduct;

import java.util.List;

public interface IProductsFilter {
    List<StoreProduct> getByKeyWord(String shopName, String keyWord);
}
