package com.pizzacode;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

//aca se encuentra el menu principal.
public class Carrito {

    private Scanner in = new Scanner(System.in);
    private List<Orden> ordenes = new ArrayList<>();

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
                    registarUsuario();
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
            int indexUsr = in.nextInt();
            ordenar(indexUsr);

        } else {
            separador();
            System.out.println("NO HAY USUARIOS DISPONIBLES");
        }

    }

    public void ordenar(int index) {
        int lastUser = index - 1;
        Usuario user = ordenes.get(lastUser).getUsuario();
        ordenes.get(lastUser).seleccionPizza(user);
    }

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
            int seleccionUsr = seleccion - 1;
            boolean hasBoleta = ordenes.get(seleccionUsr).getUsuario().getBoletas().isEmpty();

            if (!(hasBoleta)) {

                System.out.println("DETALLE BOLETAS: ");

                ordenes.get(seleccionUsr).getUsuario().mostrarBoletas();

                int cantBoletas = ordenes.get(seleccionUsr).getUsuario().getBoletas().size();

                for (int i = 0; i < cantBoletas; i++) {
                    ordenes.get(seleccionUsr).getUsuario().getBoletas().get(i).mostrarPizzas();
                }
                separador();
                System.out.println("SELECCIONAR BOLETA PARA PAGAR");
                separador();
                int seleccionBoleta = in.nextInt();
                ordenes.get(seleccionUsr).getUsuario().pagarBoleta(seleccionBoleta);

            } else {

                System.out.println("USUARIO SIN BOLETAS DISPONIBLES");
            }
        }
        return true;
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

    public void registarUsuario() {

        Usuario usuario = new Usuario();
        registrarOrden(usuario);
    }

    public void registarUsuario(String nombre) {

        Usuario usuario = new Usuario(nombre);
        registrarOrden(usuario);
    }

    public void registrarOrden(Usuario usuario) {
        Orden orden = new Orden(usuario);
        ordenes.add(orden);

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
