package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    private String productCode;
    private String productName;
    private String productDescription;
    private BigDecimal productBasePrice;
    private BigDecimal iva;
    private BigDecimal productFinalPrice;

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

    // // constructor 1 (randomly generated product code)
    // public Prodotto(String productName, String productDescription, BigDecimal
    // productBasePrice, BigDecimal iva) {
    // this.productCode = generateProductCode();
    // this.productName = productName;
    // this.productDescription = productDescription;
    // this.productBasePrice = productBasePrice;
    // this.iva = iva;
    // this.productFinalPrice = generateFinalPrice();
    // }

    // // constructor 2 (predefined product code)
    // public Prodotto(String productCode, String productName, String
    // productDescription, BigDecimal productBasePrice,
    // BigDecimal iva) {
    // this.productCode = productCode;
    // this.productName = productName;
    // this.productDescription = productDescription;
    // this.productBasePrice = productBasePrice;
    // this.iva = iva;
    // this.productFinalPrice = generateFinalPrice();
    // }

    // new DEFINITITVE constructor (by using setProductCode() logic, I can combine
    // both constructors)
    public Prodotto(String productCode, String productName, String productDescription, BigDecimal productBasePrice,
            BigDecimal iva) {
        setProductCode(productCode); // can't use "this.productCode" because setter is a void method
        this.productName = productName;
        this.productDescription = productDescription;
        this.productBasePrice = productBasePrice;
        this.iva = iva;
        this.productFinalPrice = generateFinalPrice();
    }

    // getters and setters

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        if (productCode == null || productCode.isBlank()) {
            this.productCode = generateProductCode();
        } else {
            this.productCode = productCode;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public BigDecimal getProductBasePrice() {
        return this.productBasePrice;
    }

    public void setProductBasePrice(BigDecimal productBasePrice) {
        this.productBasePrice = productBasePrice;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getProductFinalPrice() {
        return this.productFinalPrice;
    }

    public void setProductFinalPrice(BigDecimal productFinalPrice) {
        this.productFinalPrice = productFinalPrice;
    }

    // toString
    public String toString() {
        return getProductCode() + " - " + getProductName();
    }
}
