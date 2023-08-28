package com.systechafrica;

/**
 * Hello world!
 *
 */
public class App 
{
   
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

     public static void main( String[] args )
    {
       App app = new App();
       
       
        System.out.println( "Hello World!" );
        System.out.print(app.add(3, 4));          ;
       
    }

}
