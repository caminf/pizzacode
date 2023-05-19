package com.pizzacode;

public class Ingrediente {

    private String nombre ;
    private double precio;

    public Ingrediente(String nombre, double precio) {

        this.nombre = nombre;
        this.precio = precio;
    }

    public Ingrediente(String nombre) {

        this.nombre = nombre;
    }

    public Ingrediente(double precio) {
        this.precio = precio;
    }




}
