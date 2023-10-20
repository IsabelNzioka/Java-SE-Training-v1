package com.systechafrica.extras;

public class Extras {

  private static Rope rope1 = new Rope();
  private static Rope rope2 = new Rope();

    
 public static void main(String[] args) {
   

                rope1.length = 2;
                rope2.length = 8;
                System.out.println(rope1.length);
                // System.out.println(rope1);
                // System.out.println(rope1.toString());


                StringBuilder sb = new StringBuilder(5);
                String s = " ";

                if(sb.equals(s)) {
                  System.out.println("Match 1");
                } else if (sb.toString().equals(s.toString())) {
                      System.out.println("Match 2");
                } else { 
                  System.out.println("NO match");
                }
 }


}


    

