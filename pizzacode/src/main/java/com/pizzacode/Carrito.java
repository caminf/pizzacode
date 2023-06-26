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
            System.out.println("SELECCIONE USUARIO");
            separador();
            int seleccion = in.nextInt();
            // int seleccionUsr = seleccion - 1;
            if (!(ordenes.get(seleccion - 1).getUsuario().getBoletas().isEmpty())) {

                System.out.println("DETALLE BOLETAS: ");

                ordenes.get(seleccion - 1).getUsuario().mostrarBoletas();

                for (int i = 0; i < ordenes.get(seleccion - 1).getUsuario().getBoletas().size(); i++) {
                    ordenes.get(seleccion - 1).getUsuario().getBoletas().get(i).mostrarPizzas();
                }
                separador();
                System.out.println("SELECCIONAR BOLETA PARA PAGAR");
                separador();
                int seleccionBoleta = in.nextInt();
                ordenes.get(seleccion - 1).getUsuario().pagarBoleta(seleccionBoleta);

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
        boolean terminar = true;
        
        do {    
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
                generarOrden();
                break;
            case 2:
                pagar();
                break;
            case 3:
                mostrarUsuarios();
                break;
            case 4:
                Usuario usuario = new Usuario();
                registarUsuario(usuario);
                break;
            case 5:
                terminar = false;
                break;
            default:
                terminar = false;
                break;
        }
        } while (terminar);
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
        // int lastUser = index - 1;
        // Usuario user = ordenes.get(lastUser).getUsuario();
        // ordenes.get(lastUser).seleccionPizza(user);
        ordenes.get(index - 1).seleccionPizza(ordenes.get(index - 1).getUsuario());
    }

    public void mostrarUsuarios() {
        int i = 1;

        if (!ordenes.isEmpty()) {

            System.out.println("USUARIOS REGISTRADOS: ");

            for (Orden orden : ordenes) {
                System.out.println(i + ".- " + orden.getUsuario().getNombre());
                i++;
            }

        } else {
            separador();
            System.out.println("NO HAY USUARIOS DISPONIBLES");
        }

    }

    public void registarUsuario(Usuario usuario) {

        // Orden orden = new Orden(usuario);
        ordenes.add(new Orden(usuario));
    }

    public void separador() {
        System.out.println("---------------");
    }

    public List<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(List<Orden> ordenes) {
        this.ordenes = ordenes;
    }

}
