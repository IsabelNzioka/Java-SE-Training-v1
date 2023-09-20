package com.systechafrica.part2.staticClasses;

public class StaticDemo {

    public static void main(String[] args) {
      int a = 10; 
      int b = 40;
    //   System.out.println(MathUtils.Geometry.add(a, b));
        
      String name = null;
      System.out.println(StringUtils.isNullOrEmpty(name));


      String cardNumber = "6236182636472637";
      System.out.println(ATMUtils.maskCardNumber(cardNumber)); //XXXXXXXXXXXX2637
        
    }
    
}
