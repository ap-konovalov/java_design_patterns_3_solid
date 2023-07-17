package ru.netology;

import ru.netology.entities.Product;
import ru.netology.entities.Shop;
import ru.netology.interfaces.IShop;
import ru.netology.utils.BuyerMenu;

import static ru.netology.enums.Dairy.CHEES;
import static ru.netology.enums.Dairy.MILK;
import static ru.netology.enums.Manufacturer.*;

// https://github.com/netology-code/jd-homeworks/blob/master/solid/task1/README.md
public class Main {

    public static void main(String[] args) {

        // dependency inversion principle
        IShop magnit = new Shop("Магнит");
        magnit.addProduct(new Product(MILK.getProductName(), VILLAGE_HOUSE.getManufacturerName(), 102.5, 3));
        magnit.addProduct(new Product(MILK.getProductName(), GREEN_VILLAGE.getManufacturerName(), 76.5, 1));
        magnit.addProduct(new Product(MILK.getProductName(), NO_NAME.getManufacturerName(), 40, 0));
        magnit.addProduct(new Product(CHEES.getProductName(), PROSTOKVASHINO.getManufacturerName(), 87.5, 4));

        BuyerMenu menu = BuyerMenu.newBuilder()
                .addItem(0, "Выход")
                .addItem(1, "Установить магазин")
                .addItem(2, "Поиск товара по ключевому слову(если установлен магазин)")
                .build();
        menu.startPoll();
    }
}