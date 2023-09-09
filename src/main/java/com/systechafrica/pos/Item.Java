package com.systechafrica.pos;

public class Item {

    private String itemCode;
    private int quantity;
    private int unitPrice;
    private int totalValue;


    // Setting the property values using the Constructor.
    public Item(String itemCode, int quantity, int unitPrice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalValue = quantity * unitPrice;
    }


    // Setting and getting access to the properties using Setters and Getters.
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int quantity, int unitPrice) {
        this.totalValue = quantity * unitPrice;
    }


    @Override
    public String toString() {
        return this.itemCode + "    " + this.quantity + "    " + this.unitPrice + "    " + this.totalValue;
    }
    
}
