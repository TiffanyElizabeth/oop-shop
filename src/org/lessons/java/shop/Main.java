package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Prodotto test = new Prodotto("", "test", "test description", new BigDecimal("39.99"), new BigDecimal("0.22"));

        System.out.println(test.generateProductCode());
        System.out.println(test.generateCodeName());
    }
}
