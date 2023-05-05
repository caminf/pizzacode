package com.pizzacode;

public class Pizza {
    String nombrePizza;
    String usuario;
    double costo;
    boolean personalizada;


    public Pizza(String nombrePizza, String usuario, double costo){

        this.nombrePizza= nombrePizza;
        this.usuario = usuario;
        this.costo=costo;
        this.personalizada= false;

    }

    public void crearPizza(){
        Pizza.add();


    }

    public void guardarPizza(){


    }
}

