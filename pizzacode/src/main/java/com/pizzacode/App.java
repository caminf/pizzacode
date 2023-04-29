package com.pizzacode;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.err.println( "Hello World!" );
        int  [] arr= new int[4];
    
        arr = llenarArr(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        
    }
    public static int[] llenarArr(int [] arr){
         arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        return arr;
    }
}



