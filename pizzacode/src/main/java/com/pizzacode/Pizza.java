package com.pizzacode;

public class Pizza {
    String nombrePizza;
    String usuario;
    double costo;
    boolean personalizada;
    Masa masa;
    Ingrediente ingrediente;

    public Pizza(String nombrePizza, String usuario, double costo) {

        this.nombrePizza = nombrePizza;
        this.usuario = usuario;
        this.costo = costo;
        this.personalizada = false;

    }

    public Pizza crearPizza() {

        return new Pizza(nombrePizza(), nombreUsuario(), calcularCosto());
    }

    public String nombrePizza() {

        return "nombre";
    }

    public String nombreUsuario() {
        return "nombre";
    }

    public double calcularCosto() {
        return 0.0;
    }

    public void guardarPizza() {

    }
}
