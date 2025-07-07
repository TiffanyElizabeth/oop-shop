package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    public String productCode;
    public String productName;
    public String productDescription;
    public BigDecimal productBasePrice;
    public BigDecimal iva;
    public BigDecimal productFinalPrice;

    // method to generate random product code
    public String generateProductCode() {
        Random random = new Random(); // generate random numbers
        int productNumber = random.nextInt(999999) + 1; // to give us numbers between 1 and 999999
        return String.format("%06d", productNumber); // to format with leading zeros
    }

    // method to generate final price - can't use normal math operators with
    // BigDecimal / setScale gives 2 decimal points
    public BigDecimal generateFinalPrice() {
        return productBasePrice.add(productBasePrice.multiply(iva)).setScale(2, RoundingMode.HALF_UP);
    }

    // method to give code + name
    public String generateCodeName() {
        return productCode + ": " + productName;
    }

    // constructor 1 (randomly generated product code)
    public Prodotto(String productName, String productDescription, BigDecimal productBasePrice, BigDecimal iva) {
        this.productCode = generateProductCode();
        this.productName = productName;
        this.productDescription = productDescription;
        this.productBasePrice = productBasePrice;
        this.iva = iva;
        this.productFinalPrice = generateFinalPrice();
    }

    // constructor 2 (predefined product code)
    public Prodotto(String productCode, String productName, String productDescription, BigDecimal productBasePrice,
            BigDecimal iva) {
        this.productCode = productCode;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productBasePrice = productBasePrice;
        this.iva = iva;
        this.productFinalPrice = generateFinalPrice();
    }

}
