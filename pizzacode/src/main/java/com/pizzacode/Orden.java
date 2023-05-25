package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

// aca se generan las boletas, estas estan asociadas a un usuario y una pizza 

public class Orden {

    private Scanner in = new Scanner(System.in);

    private Usuario usuario;
    private ArrayList<Boleta> boletas = new ArrayList<>();

    /*-------------*/
    private int num_orden;

    // private boolean cupon;
    public Orden(Usuario usuario) {
        this.usuario = usuario;
    }

    public void seleccionPizza() {

        // tipo pizzas
        System.out.println("---------------");

        System.out.println("PIZZAS DISPONIBLES: ");
        System.out.println("1.- PIZZA CAMPESTRE");
        System.out.println("2.- PIZZA NAPOLITANA");
        System.out.println("3.- PIZZA PEPPERONI");
        System.out.println("4.- PERSONALIZADA");
        System.out.println("5.- SALIR");
        System.out.println("---------------");

        int seleccion;

        do {
            seleccion = in.nextInt();
            agregarPizza(seleccion);
        } while (seleccion >= 5);

    }

    public void agregarPizza(int seleccion) {
        switch (seleccion) {
            case 1:
                // Pizza Campestre
                boletas.add(new Boleta(usuario));
                break;

            case 2:
                // Pizza Napolitana
                break;
            case 3:
                // Pizza Pepperoni
                break;
            case 4:
                // Pizza Personalizada
                break;
            case 5:

                break;

            default:
        }

    }

    public void validarCupon() {

    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public Usuario getUsuario() {

        return this.usuario;

    }

}
