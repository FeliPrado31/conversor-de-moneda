package com.conversorDeMoneda.utils;

import com.conversorDeMoneda.view.CurrencyView;

public class MenuUtils {

    public static int showMenuAndGetChoice(CurrencyView view) {
        view.showMenu();
        return view.getUserChoice();
    }

    public static String[] getCurrenciesForChoice(int choice) {
        return switch (choice) {
            case 1 -> new String[]{"USD", "ARS"};
            case 2 -> new String[]{"ARS", "USD"};
            case 3 -> new String[]{"USD", "BRL"};
            case 4 -> new String[]{"BRL", "USD"};
            case 5 -> new String[]{"USD", "COP"};
            case 6 -> new String[]{"COP", "USD"};
            default -> new String[]{"", ""};
        };
    }
}