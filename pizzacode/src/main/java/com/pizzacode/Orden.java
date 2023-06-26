package com.pizzacode;

import java.util.Scanner;

// aca se generan las boletas, estas estan asociadas a un usuario y una boleta 

public class Orden {

    private Scanner in = new Scanner(System.in);
    private Usuario usuario;

    public Orden(Usuario usuario) {
        this.usuario = usuario;
    }

    public void seleccionPizza(Usuario usuario) {
        separador();
        System.out.println("PIZZAS DISPONIBLES: ");
        System.out.println("1.- PIZZA CAMPESTRE");
        System.out.println("2.- PIZZA NAPOLITANA");
        System.out.println("3.- PIZZA PEPPERONI");
        System.out.println("4.- PERSONALIZADA");
        System.out.println("5.- SALIR");
        separador();
        int seleccion;
        do {
            seleccion = in.nextInt();
            guardarBoleta(seleccion, usuario);
        } while (seleccion >= 5);

    }

    public void guardarBoleta(int seleccion, Usuario usuario) {
        switch (seleccion) {
            case 1:
                this.usuario.agregarBoleta(new Boleta(usuario));
                int lastUser = this.usuario.getBoletas().size() - 1;

                this.usuario.getBoletas().get(lastUser).agregarPizza(seleccion);

                break;

            case 2:
                // Pizza Napolitana
                this.usuario.agregarBoleta(new Boleta(usuario));
                this.usuario.getBoletas().get(this.usuario.getBoletas().size() - 1).setPizzas(new Pizza(2));

                break;
            case 3:
                // Pizza Pepperoni
                this.usuario.agregarBoleta(new Boleta(usuario));
                this.usuario.getBoletas().get(this.usuario.getBoletas().size() - 1).setPizzas(new Pizza(3));

                break;
            case 4:
                // Pizza Personalizada
                this.usuario.agregarBoleta(new Boleta(usuario));
                this.usuario.getBoletas().get(this.usuario.getBoletas().size() - 1).setPizzas(new Pizza(4));

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

    public void separador() {
        System.out.println("---------------");

    }
}
