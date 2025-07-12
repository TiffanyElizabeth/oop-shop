package org.lessons.java;

import java.math.BigDecimal;
import org.lessons.java.shop.Prodotto;
import org.lessons.java.shop.Smartphone;
import org.lessons.java.shop.Televisori;
import org.lessons.java.shop.Cuffie;

public class Main {
    public static void main(String[] args) {
        Prodotto test = new Prodotto("", "test", "test description", new BigDecimal("39.99"), new BigDecimal("0.22"));

        System.out.println(test.generateProductCode());
        System.out.println(test.generateCodeName());

        Prodotto phone = new Smartphone("", "phone", "dalkfj", new BigDecimal("200"), new BigDecimal("0.22"),
                "1234567891011", 100);

        System.out.println(phone.toString());

        Cuffie headphones = new Cuffie("", "headphones", "lkdjfl", new BigDecimal("200"), new BigDecimal("0.22"), true);

        System.out.println(headphones.generateFinalPrice());

        System.out.println(headphones.toString());

        Televisori tv = new Televisori(" ", "tv", "ladjf", new BigDecimal("900"), new BigDecimal("0.22"), true);

        System.out.println(tv.toString());

        System.out.println(tv.generateFinalPrice());

    }
}
