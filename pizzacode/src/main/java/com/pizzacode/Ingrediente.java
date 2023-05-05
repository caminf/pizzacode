package com.pizzacode;

public class Ingrediente {

    String nombre = "ingrediente nuevo";
    double precio = 0.0;

    public Ingrediente(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;
    }

    public Ingrediente(String nombre) {

        this.nombre = nombre;
    }

    public Ingrediente(double precio) {
        this.precio= precio;
    }

}
