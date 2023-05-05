package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

public class Orden {

    String nombreComprador;
    double monto;
    boolean cupon;
   
    Pizza pizza;
   
    public void comprar() {
        Scanner in  = new Scanner(System.in);
        System.out.println("BIENVENIDO A PIZZA CODE QUE DESEA ORDENAR");


        
        
        
      

    }

    public String ingresarNombre(){
        System.out.println("PORFAVOR INGRESE SU NOMBRE");
        Scanner in  = new Scanner(System.in);
        String nombre= in.nextLine();


        return nombre;
    }
    
    public void nombrePizza(){
        ArrayList<Pizza> pizzas = new ArrayList<>();


        System.out.println("PIZZAS DISPONIBLES: ");
        System.out.println("1.- PIZZA CAMPESTRE");
        System.out.println("2.- PIZZA NAPOLITANA");
        System.out.println("3.- PIZZA ESPAÑOLA");
        int seleccion = in.nextInt();
        switch(seleccion){
            case 1:
               pizzas.add( pizza.crearPizza());
                
                break;
            case 2:
            break;
            case 3:
            break;
            default:
        }
        
    }

    public void validarCupon() {

    }

}
