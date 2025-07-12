package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        // Prodotto test = new Prodotto("", "test", "test description", new
        // BigDecimal("39.99"), new BigDecimal("0.22"));

        // System.out.println(test.generateProductCode());
        // System.out.println(test.generateCodeName());

        // Prodotto phone = new Smartphone("", "phone", "dalkfj", new BigDecimal("200"),
        // new BigDecimal("0.22"),
        // "1234567891011", 100);

        // System.out.println(phone.toString());

        // Cuffie headphones = new Cuffie("", "headphones", "lkdjfl", new
        // BigDecimal("200"), new BigDecimal("0.22"), true);

        // System.out.println(headphones.generateFinalPrice());

        // System.out.println(headphones.toString());

        // Televisori tv = new Televisori(" ", "tv", "ladjf", new BigDecimal("900"), new
        // BigDecimal("0.22"), true);

        // System.out.println(tv.toString());

        // System.out.println(tv.generateFinalPrice());

        Scanner customerOrder = new Scanner(System.in);

        System.out.println("How many products would you like to add to your cart?");
        int numberOfProducts = customerOrder.nextInt();
        customerOrder.nextLine(); // allows me to go to the next line
        Prodotto[] productsInCart = new Prodotto[numberOfProducts];

        for (int i = 0; i < productsInCart.length; i++) {
            System.out.println("Product name: ");
            String productName = customerOrder.nextLine().toLowerCase();

            System.out.println("Base price: ");
            double productBasePrice = customerOrder.nextDouble();

            System.out.println("VAT: ");
            double iva = customerOrder.nextDouble();
            customerOrder.nextLine();

            System.out.println(
                    "Which type of product would you like to add to your cart: smartphone, cuffie or televisore?");
            String productType = customerOrder.nextLine().toLowerCase();

            if (productType.equals("smartphone")) {
                System.out.println("What is the imei code?");
                String imei = customerOrder.nextLine();

                System.out.println("How many gb of memory does the smartphone have?");
                int memory = customerOrder.nextInt();
                customerOrder.nextLine();

                Smartphone smartphone = new Smartphone(
                        "",
                        productName,
                        BigDecimal.valueOf(productBasePrice),
                        BigDecimal.valueOf(iva),
                        imei,
                        memory);

                productsInCart[i] = smartphone;

            } else if (productType.equals("cuffie")) {
                System.out.println("Are they wireless? Write TRUE if yes or FALSE if no.");
                boolean areWireless = Boolean.parseBoolean(customerOrder.nextLine());
                customerOrder.nextLine();

                Cuffie cuffie = new Cuffie(
                        "",
                        productName,
                        BigDecimal.valueOf(productBasePrice),
                        BigDecimal.valueOf(iva),
                        areWireless);

                productsInCart[i] = cuffie;
            } else if (productType.equals("televisore")) {
                System.out.println("Is it a smart TV? Write TRUE if yes or FALSE if no.");
                boolean isSmart = Boolean.parseBoolean(customerOrder.nextLine());
                customerOrder.nextLine();

                Televisori tv = new Televisori(
                        "",
                        productName,
                        BigDecimal.valueOf(productBasePrice),
                        BigDecimal.valueOf(iva),
                        isSmart);

                productsInCart[i] = tv;
            } else {
                System.out.println("Invalid product type");
            }

            customerOrder.close();

        }
        System.out.println("Your cart: ");
        for (int i = 0; i < productsInCart.length; i++) {
            if (productsInCart[i] != null) {
                System.out.println(productsInCart[i]);
            }
        }
    }
}
