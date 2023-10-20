package com.systechafrica.extras;

public class New {

    public int amount;
    public New(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }


    public static void main(String[] args) {
          New acct = new New( (int) (Math.random() * 1000));
         
        //   ////////////////////////
        String shirts[][] = new String[2][2];
        shirts[0][0] = "red";
        shirts[0][1] = "blue";
        shirts[1][0] = "small";
        shirts[1][1] = "medium";


        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        // int d = ( a < b) ? (a < c) ? a : (b < c) ? b : c;
        // System.out.println(d);


    }
}
