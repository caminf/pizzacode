package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {

    private Scanner in = new Scanner(System.in);

    //
    private String nombrePizza;
    private Usuario usuario;
    private double costo;
    private boolean personalizada;
    private Masa masa;

    // ingredientes arraylist
    // duda, que pasa si no inicializo el arraylist

    private ArrayList<Ingrediente> ingredientes;

    public Pizza(int seleccion, Usuario usuario) {
        // pizzas default
        switch (seleccion) {
            case 1:
                this.nombrePizza = "Pizza Campestre";
                this.costo = 10;
                this.usuario = usuario;
                break;
            case 2:

                this.nombrePizza = "Pizza Napolitana";
                this.costo = 20;
                this.usuario = usuario;
                break;
            case 3:

                this.nombrePizza = "Pizza Pepperoni";
                this.costo = 30;
                this.usuario = usuario;
                break;
            case 4:

                break;
            default:
                break;
        }

    }

    public Pizza(String nombrePizza, Usuario usuario, double costo) {

        this.nombrePizza = nombrePizza;
        this.usuario = usuario;
        this.costo = costo;
        this.personalizada = false;

    }

    public Pizza crearPizza() {

        return new Pizza(nombrePizza(), nombreUsuario(), calcularCosto());
    }

    public Pizza pizzaPersonalizada(Usuario usuario) {

        Pizza p_personalizada = new Pizza("nombrePizza", usuario, costo);

        agregarIngrediente(p_personalizada);

        return p_personalizada;
    }

    public void agregarIngrediente(Pizza pizza) {
        boolean terminar = true;

        do {

            System.out.println("que ingredientes desea agregar: ");
            System.out.println("1.- Tomate");
            System.out.println("2.- Pollo");
            System.out.println("3.- Aceitunas");
            int seleccion = in.nextInt();
            switch (seleccion) {
                case 1:
                    pizza.ingredientes.add(new Ingrediente("tomate", 1));
                    break;
                case 2:
                    pizza.ingredientes.add(new Ingrediente("pollo", 2));
                    break;

                case 3:
                    pizza.ingredientes.add(new Ingrediente("aceitunas", 3));
                    break;

                default:
                    terminar = false;
                    break;
            }

        } while (terminar);

    }

    public String getNombrePizza() {

        return this.nombrePizza;
    }

    public String nombreUsuario() {
        return "nombre";
    }

    public double calcularCosto() {
        return 0.0;
    }

    public void guardarPizza() {

    }

    public double getCosto() {
        return this.costo;
    }
}
