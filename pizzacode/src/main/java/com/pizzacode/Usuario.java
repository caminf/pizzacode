package com.pizzacode;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    private Scanner in = new Scanner(System.in);
    private List<Boleta> boletas = new ArrayList<>();
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        // validar
        separador();
        System.out.println("INGRESE SU NOMBRE: ");
        separador();
        String nombre = in.nextLine();
        setNombre(nombre);
        separador();
        System.out.println("USUARIO REGISTRADO EXITOSAMENTE");

    }

    // refactorizable
    public void agregarBoleta(Boleta boleta) {
        boletas.add(boleta);
    }

    public void mostrarBoletas() {

        System.out.println("BOLETAS: " + boletas.size());
        System.out.println("NOMBRE: " + this.nombre);

    }

    public List<Boleta> getBoletas() {
        return boletas;
    }

    public boolean hasBoleta() {

        return this.boletas.isEmpty();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void separador() {
        System.out.println("---------------");
    }

}
