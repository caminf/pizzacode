package com.pizzacode;

import java.util.Scanner;

public class Usuario {

    private Scanner in = new Scanner(System.in);
    private String nombre;
    private Boleta boleta;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        //validar
        System.out.println("ingrese su nombre: ");
        String nombre = in.nextLine();
        setNombre(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
