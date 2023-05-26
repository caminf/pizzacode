package com.pizzacode;

// son los componentes de la pizza

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

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    



}
