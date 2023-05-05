package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

public class Orden {

    String nombreComprador;
    double monto;
    boolean cupon;
    ArrayList<Pizza> pizzas;

    public void comprar() {
        System.out.println("BIENVENIDO A PIZZA CODE QUE DESEA ORDENAR");
        // desplegar menu de pizzas disponibles
        pizzas.add(new Pizza("nombreComprador", ingresarNombre(), 0));

    }

    public String ingresarNombre(){
        System.out.println("PORFAVOR INGRESE SU NOMBRE");
        Scanner in  = new Scanner(System.in);
        String nombre= in.nextLine();


        return nombre;
    }
    
    public void nombrePizza(){
        throw UnsupportedOperationException();
    }

    public void validarCupon() {

    }

}
