package com.systechafrica.pos;

public class Item {


    private int itemCode;
    private int quantity;
    private int unitPrice;
    private int totalValue;

    public Item() {

    }


    public Item(int itemCode, int quantity, int unitPrice) {
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        // this.totalValue = quantity * unitPrice;
        updateTotalValue();
    }

    // to be updated when using either the constructor or the getter&setter methods
    private void updateTotalValue() {
        this.totalValue = this.quantity * this.unitPrice;
    }


    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateTotalValue();

    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
        updateTotalValue();

    }

    public void setTotalValue(int quantity, int unitPrice) {
        this.totalValue = quantity * unitPrice;
    }

    public int getTotalValue() {
        return totalValue;
    }


    // @Override
    // public String toString() {
    //     return this.itemCode + "    " + this.quantity + "    " + this.unitPrice + "    " + this.totalValue;
    // }

}
