package com.systechafrica.restaurant;

public class Restaurant {

    public static void main(String[] args) {
        Order order = new Order();
        
        order.setAndazi(100);
        order.setChai(200);

      System.out.println(order.getAndazi());
    }
    
}
