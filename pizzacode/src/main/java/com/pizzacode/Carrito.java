package com.pizzacode;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//aca se encuentra el menu principal.

public class Carrito {
    
    private Scanner in = new Scanner(System.in);
    private List<Orden> ordenes = new ArrayList<>();

    public boolean pagar() {
        if (ordenes.isEmpty()) {
            separador();
            System.out.println("NO HAY BOLETAS DISPONIBLES");
        } else {
            mostrarUsuarios();
            separador();
            System.out.println("seleccione usuario");
            separador();
            int seleccion = in.nextInt();
            if (!(ordenes.get(seleccion - 1).getUsuario().getBoletas().isEmpty())) {
                System.out.println("DETALLE BOLETAS: ");
                System.out.println("boleta a nombre de: " + ordenes.get(seleccion - 1).getUsuario().getNombre());
                ordenes.get(seleccion - 1).getUsuario().mostrarBoletas();
            } else {
                System.out.println("USUARIO SIN BOLETAS DISPONIBLES");
            }
        }
        return true;
    }

    public void separador(){
        System.out.println("---------------");

    }

    public void menu() {
        separador();
        System.out.println("SELECCIONA UNA OPCION");
        System.out.println("1.- ORDENAR");
        System.out.println("2.- PAGAR");
        System.out.println("3.- VER USUARIOS");
        System.out.println("4.- REGISTRAR USUARIOS");
        System.out.println("5.- SALIR");
        separador();
        int seleccion = in.nextInt();


        // validar entrada

        switch (seleccion) {
            case 1:
                // validar que no entre si no existe usuario
                // DO WHILE SEGUN CUANTAS PIZZAS DESEE.
                generarOrden();
                break;
            case 2:
                pagar();
                break;
            case 3:
                mostrarUsuarios();
                break;
            case 4:
                agregarUsuario();
                break;
            case 5:
                break;
            default:
                break;
        }
    }

    public void generarOrden() {
        if (!ordenes.isEmpty()) {
            mostrarUsuarios();
            separador();
            int index = in.nextInt();
            ordenar(index);

        } else {
            separador();
            System.out.println("NO HAY USUARIOS DISPONIBLES");
        }

    }

    public void ordenar(int index) {
        ordenes.get(index - 1).seleccionPizza(ordenes.get(index - 1).getUsuario());
    }

    public void mostrarUsuarios() {
        int i = 1;

        if (!ordenes.isEmpty()) {
            System.out.println("nombre:");

            for (Orden orden : ordenes) {
                System.out.println(i + ".- " + orden.getUsuario().getNombre());
                i++;
            }

        } else {
            separador();
            System.out.println("NO HAY USUARIOS DISPONIBLES");
        }

    }

    public void agregarUsuario() {
        ordenes.add(new Orden(new Usuario()));
    }
}
