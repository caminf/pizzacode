package com.pizzacode;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            usuarios.add(new Usuario());
        }

        // Usuario usuario = new Usuario();

        // array orden?, faltan carritos!
        Orden orden = new Orden();

        do {
            for (int i = 0; i < 3; i++) {

                orden.comprarPizza(usuarios.get(i));
                orden.validarCupon();
            }

        } while (true);

    }
}
