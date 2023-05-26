package com.pizzacode;

import java.util.Scanner;

// aca se generan las boletas, estas estan asociadas a un usuario y una pizza 

public class Orden {

    private Scanner in = new Scanner(System.in);
    private Usuario usuario;
    // private int num_orden;

    public Orden(Usuario usuario) {
        this.usuario = usuario;
    }

    public void seleccionPizza(Usuario usuario) {
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
            agregarPizza(seleccion, usuario);
        } while (seleccion >= 5);

    }

    public void agregarPizza(int seleccion, Usuario usuario) {

        switch (seleccion) {
            case 1:
                // Pizza Campestre
                this.usuario.agregarBoleta(new Boleta(usuario));

                break;

            case 2:
                // Pizza Napolitana
                this.usuario.agregarBoleta(new Boleta(usuario));

                break;
            case 3:
                // Pizza Pepperoni
                this.usuario.agregarBoleta(new Boleta(usuario));

                break;
            case 4:
                // Pizza Personalizada
                this.usuario.agregarBoleta(new Boleta(usuario));

                break;
            case 5:

                break;

            default:
        }

    }

    public Usuario getUsuario() {

        return this.usuario;

    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
