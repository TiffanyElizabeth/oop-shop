package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private boolean isSmart = false;

    public String smartOrNot() {
        if (isSmart = false) {
            return "* this product is not a smart TV";
        } else {
            return "smart TV";
        }
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    public Televisori(String productCode, String productName, String productDescription, BigDecimal productBasePrice,
            BigDecimal iva, boolean isSmart) {
        super(productCode, productName, productDescription, productBasePrice, iva);
        this.isSmart = isSmart;
    }

    public String toString() {
        return super.toString() + " (" + smartOrNot() + ")";
    }
}
