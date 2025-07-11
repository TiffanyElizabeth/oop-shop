package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto test = new Prodotto("", "test", "test description", new BigDecimal("39.99"), new BigDecimal("0.22"));

        System.out.println(test.generateProductCode());
        System.out.println(test.generateCodeName());

        Prodotto phone = new Smartphone("", "phone", "dalkfj", new BigDecimal("200"), new BigDecimal("0.22"),
                "1234567891011", 100);

        System.out.println(phone.toString());

        Cuffie headphones = new Cuffie("", "headphones", "lkdjfl", new BigDecimal("200"), new BigDecimal("0.22"), true);

        headphones.getProductFinalPrice();

        System.out.println(headphones.toString());

    }
}
