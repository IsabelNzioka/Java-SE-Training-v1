package com.systechafrica.restaurant;

import java.util.ArrayList;


public class Order {

    private int chai;
    private int andazi;
    private int tosti;
    private int ndenguAndAccompishments;
    private int beansAndAccompishments;
    private int pilauVeg;
    

    // private ArrayList<String> customerOrders = new ArrayList<>();


     public Order() {

    }

    public Order(int chai, int andazi, int tosti, int ndenguAndAccompishments, int beansAndAccompishments, int pilauVeg ) {
        this.chai = chai;
        this.andazi = andazi;
        this.tosti = tosti;
        this.ndenguAndAccompishments = ndenguAndAccompishments;
        this.beansAndAccompishments = beansAndAccompishments;
        this.pilauVeg = pilauVeg;
       
    }

    public int getChai() {
        return chai;
    }

   
    public void setChai(int chai) {
        this.chai += chai;
       
    }

    public int getAndazi() {
        return andazi;
    }


    public void setAndazi(int andazi) {
        this.andazi += andazi;
 
    }

    public int getTosti() {
        return tosti;
    }

    public void setTosti(int tosti) {
        this.tosti += tosti;
    }

    public int getNdenguAndAccompishments() {
        return ndenguAndAccompishments;
    }

    public void setNdenguAndAccompishments(int ndenguAndAccompishments) {
        this.ndenguAndAccompishments += ndenguAndAccompishments;
    }

    public int getBeansAndAccompishments() {
        return beansAndAccompishments;
    }

    public void setBeansAndAccompishments(int beansAndAccompishments) {
        this.beansAndAccompishments += beansAndAccompishments;
    }

    public int getPilauVeg() {
        return pilauVeg;
    }

    public void setPilauVeg(int pilauVeg) {
        this.pilauVeg += pilauVeg;
    }

  

    // calculate total cost
    public int calculateTotalOrderCost() {
        return (this.chai + this.andazi + this.tosti + this.ndenguAndAccompishments + this.beansAndAccompishments + this.pilauVeg);
    }

   
    
}
