package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

// aca se encuentra la pizza, aca estan los metodos para crear las pizzas y para agregar o quitar ingredientes. 

public class Pizza {

    private Scanner in = new Scanner(System.in);

    private String nombrePizza;
    private double costo;
    // ingredientes arraylist
    private ArrayList<Ingrediente> ingredientes;

    public Pizza(String nombrePizza, double costo) {

        this.nombrePizza = nombrePizza;

        this.costo = costo;

    }

    public Pizza(int seleccion) {
        switch (seleccion) {
            case 1:
                // Pizza Campestre
                this.nombrePizza = "Pizza campestre";
                this.costo = 10;
                break;

            case 2:
                // Pizza Napolitana
                this.nombrePizza = "Pizza napolitana";
                this.costo = 20;

                break;
            case 3:
                // Pizza Pepperoni
                this.nombrePizza = "Pizza pepperoni";
                this.costo = 30;

                break;
            case 4:
                // Pizza Personalizada

                this.nombrePizza = "Pizza personalizada";
                this.costo = 40;

                break;
            case 5:

                break;

            default:

        }
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
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
