package ru.netology.utils;

import ru.netology.interfaces.IProductsFilter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BuyerMenu {

    private static final Map<Integer, String> menuActions = new HashMap<>();
    private IProductsFilter filter = new ProductsFilter();
    private String currentShop;


    private BuyerMenu() {
    }

    public static Builder newBuilder() {
        return new BuyerMenu().new Builder();
    }

    public void startPoll() {
        //применен принцип DRY
        show();
        Scanner scanner = new Scanner(System.in);
        int command = Integer.parseInt(scanner.nextLine());
        while (command != 0) {
            switch (command) {
                case 1:
                    System.out.println("Введите название магазина:");
                    currentShop = (scanner.nextLine());
                    System.out.println("Магазин установлен");
                    break;
                case 2:
                    if (currentShop == null || currentShop.isBlank()) {
                        System.out.println("Сначала установите магазин");
                        break;
                    }
                    System.out.println("Введите ключевую фразу для поиска:");
                    String keyWord = scanner.nextLine();
                    filter.getByKeyWord(currentShop,keyWord)
                            .forEach(System.out::println);
                    break;
                default:
                    System.out.println("Такой пункт меню не найден");
                    break;
            }

            //применен принцип DRY
            show();
            command = Integer.parseInt(scanner.nextLine());
        }
    }

    private void show() {
        System.out.println("Выберите действие и введите цифру:");
        menuActions.forEach((k, v) -> System.out.println(k + " - " + v));
    }


    // применен паттерн Builder
    public class Builder {

        private Builder() {
        }

        public Builder addItem(int itemNumber, String itemValue) {
            BuyerMenu.menuActions.put(itemNumber, itemValue);
            return this;
        }

        public BuyerMenu build() {
            return BuyerMenu.this;
        }
    }
}
