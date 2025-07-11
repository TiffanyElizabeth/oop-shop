package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private boolean areWireless = false;

    public Cuffie(String productCode, String productName, String productDescription, BigDecimal productBasePrice,
            BigDecimal iva, boolean areWireless) {
        super(productCode, productName, productDescription, productBasePrice, iva);
        this.areWireless = areWireless;
    }

    public String wirelessOrCorded() {
        if (areWireless = true) {
            return "wireless";
        } else {
            return "corded";
        }
    }

    public boolean getAreWireless() {
        return this.areWireless;
    }

    public void setAreWireless(boolean areWireless) {
        this.areWireless = areWireless;
    }

    public String toString() {
        return super.toString() + " (" + wirelessOrCorded() + ")";
    }

}
