package com.systechafrica.posDatabaseConnectivity;

public interface MembershipDiscount {
    public static final double DISCOUNT = 0.05;
    public double calculateMembershipDiscount(double totalPayment);
    
}
