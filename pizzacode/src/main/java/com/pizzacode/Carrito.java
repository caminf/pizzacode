package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

//aca se pagara.

public class Carrito {
    private Scanner in = new Scanner(System.in);

    // array de ordenes

    public boolean pagar(ArrayList<Usuario> usuarios) {
        // cambiar estado segun estado del pago
        return true;
    }

    public void mostrarPedido() {

    }

    public void menu(ArrayList<Usuario> usuarios) {

        System.out.println("BIENVENIDO A LA PIZZERIA");

        System.out.println("SELECCIONA UNA OPCION");

        System.out.println("1.- ORDENAR");
        System.out.println("2.- PAGAR");
        System.out.println("3.- VER USUARIOS");
        System.out.println("4.- REGISTRAR USUARIOS");
        // validar entrada
        int seleccion = in.nextInt();

        switch (seleccion) {
            case 1:
                // validar que no entre si no existe usuario
                // DO WHILE SEGUN CUANTAS PIZZAS DESEE.
                generarOrden(usuarios);
                break;
            case 2:
                pagar(usuarios);
                break;
            case 3:
                mostrarUsuarios(usuarios);
                break;
            case 4:

                usuarios.add(new Usuario());

                break;

            case 5:

                break;
            default:

                break;
        }
    }

    public void generarOrden(ArrayList<Usuario> usuarios) {

    }

    public void mostrarUsuarios(ArrayList<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getNombre());
        }
    }

}
