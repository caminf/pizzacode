package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.ArrayList;

public class Usuario {

    private Scanner in = new Scanner(System.in);
    private ArrayList<Boleta> boletas = new ArrayList<>();
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        // validar
        System.out.println("---------------");
        System.out.println("INGRESE SU NOMBRE: ");
        System.out.println("---------------");
        String nombre = in.nextLine();
        setNombre(nombre);
        System.out.println("---------------");
        System.out.println("USUARIO REGISTRADO EXITOSAMENTE");

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public void mostrarBoletas() {
        for (Boleta boleta : boletas) {
            System.out.println("BOLETAS: " + boleta.getTotal());
        }
    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public boolean hasBoleta() {
        if (this.boletas.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
