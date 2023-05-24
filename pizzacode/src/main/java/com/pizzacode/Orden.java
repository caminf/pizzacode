package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

// aca se generan las boletas, estas estan asociadas a un usuario y una pizza 

public class Orden {

    private Scanner in = new Scanner(System.in);

    private ArrayList<Pizza> pizzas = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Boleta> boletas = new ArrayList<>();
    /*-------------*/
    private int num_orden;
    private String nombreComprador;
    // private boolean cupon;

    public void comprarPizza(Usuario user) {

        // tipo pizzas
        System.out.println("PIZZAS DISPONIBLES: ");
        System.out.println("1.- PIZZA CAMPESTRE");
        System.out.println("2.- PIZZA NAPOLITANA");
        System.out.println("3.- PIZZA PEPPERONI");
        System.out.println("4.- PERSONALIZADA");
        System.out.println("5.- SALIR");

        int seleccion;

        do {
            seleccion = in.nextInt();
            seleccionPizza(seleccion, user);
        } while (seleccion >= 5);

    }

    public void seleccionPizza(int seleccion, Usuario user) {
        switch (seleccion) {
            case 1:
                // Pizza Campestre
                usuarios.add(user);
                pizzas.add(new Pizza(seleccion, usuarios.get(usuarios.size() - 1)));
                boletas.add(new Boleta(usuarios.get(usuarios.size() - 1), pizzas.get(pizzas.size() - 1).getCosto()));

                break;

            case 2:
                // Pizza Napolitana
                usuarios.add(user);
                pizzas.add(new Pizza(seleccion, usuarios.get(usuarios.size() - 1)));
                boletas.add(new Boleta(usuarios.get(usuarios.size() - 1), pizzas.get(pizzas.size() - 1).getCosto()));
                break;
            case 3:
                // Pizza Pepperoni
                usuarios.add(user);
                pizzas.add(new Pizza(seleccion, usuarios.get(usuarios.size() - 1)));
                boletas.add(new Boleta(usuarios.get(usuarios.size() - 1), pizzas.get(pizzas.size() - 1).getCosto()));
                break;
            case 4:
                // Pizza Personalizada
                usuarios.add(user);
                pizzas.add(new Pizza(seleccion, usuarios.get(usuarios.size() - 1)));
                boletas.add(new Boleta(usuarios.get(usuarios.size() - 1), pizzas.get(pizzas.size() - 1).getCosto()));
                break;
            case 5:

                break;

            default:
        }

    }

    public void validarCupon() {

        for (int i = 0; i < pizzas.size(); i++) {

        }

    }

   

}
