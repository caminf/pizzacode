package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

//aca se pagara.

public class Carrito {
    private Scanner in = new Scanner(System.in);
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Orden> ordenes = new ArrayList<>();
    private ArrayList<Boleta> boletas = new ArrayList<>();
    // array de ordenes

    public boolean pagar() {
        // cambiar estado segun estado del pago

        return true;
    }

    public void mostrarPedido() {

    }

    public void menu() {
        System.out.println("---------------");

        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- ORDENAR");
        System.out.println("2.- PAGAR");
        System.out.println("3.- VER USUARIOS");
        System.out.println("4.- REGISTRAR USUARIOS");
        System.out.println("---------------");

        // validar entrada
        int seleccion = in.nextInt();

        switch (seleccion) {
            case 1:
                // validar que no entre si no existe usuario
                // DO WHILE SEGUN CUANTAS PIZZAS DESEE.
                generarOrden();
                break;
            case 2:
                mostrarBoleta();

                pagar();

                break;
            case 3:
                mostrarUsuarios();
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

    public void generarOrden() {
        if (!usuarios.isEmpty()) {

            System.out.println("---------------");
            System.out.println("SELECCIONE SU USUARIO: ");
            mostrarUsuarios();
            System.out.println("---------------");

            int index = in.nextInt();

            ordenes.add(new Orden(usuarios.get(index - 1)));

            ordenar();

            // boletas.add(new Boleta(usuarios.get(index - 1), 10));

        } else {
            System.out.println("---------------");

            System.out.println("NO HAY USUARIOS DISPONIBLES");
        }

    }

    public void ordenar() {
        ordenes.get(ordenes.size() - 1).seleccionPizza();
    }

    public void mostrarBoleta() {
        int i = 1;
        if (!ordenes.isEmpty()) {

            for (Orden orden : ordenes) {
                System.out.println("BOLETA a nombre de :" + orden.getBoletas().get(i - 1).getUsuario().getNombre());
            }

        } else {
            System.out.println("---------------");
            System.out.println("NO HAY BOLETAS DISPONIBLES");
        }

    }

    public void mostrarUsuarios() {
        int i = 1;
        if (!usuarios.isEmpty()) {

            for (Usuario usuario : usuarios) {
                System.out.println("---------------");
                System.out.println(i + ".-" + usuario.getNombre());
                i++;
            }
        } else {
            System.out.println("---------------");
            System.out.println("NO HAY USUARIOS DISPONIBLES");
        }

    }

}
