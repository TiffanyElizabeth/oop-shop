package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    public String imei;
    public int memory;

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Smartphone(String productCode, String productName, String productDescription, BigDecimal productBasePrice,
            BigDecimal iva, String imei, int memory) {
        super(productCode, productName, productDescription, productBasePrice, iva);
        this.imei = imei;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + getMemory() + " GB)";
    }

}
