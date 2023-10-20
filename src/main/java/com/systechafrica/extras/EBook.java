package com.systechafrica.extras;

public class EBook extends Book{ //n3
 
   
    int c;
    EBook(int r, int c) {
        super(c);
        this.c = r;    
    }

    public void showText() {
        System.out.println("c - " + this.r);
    }



    public static void main(String[] args) {
        EBook ebook = new EBook(10, 20);
        ebook.showText();
      
        // /////////////


    }
    
}
