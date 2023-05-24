package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    private Scanner in = new Scanner(System.in);
    private ArrayList<Boleta> boletas = new ArrayList<>();

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        // validar
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

    public void setBoletas(ArrayList<Boleta> boletas) {
        this.boletas = boletas;
    }

    public ArrayList<Boleta> getBoletas() {
        return this.boletas;
    }

}
