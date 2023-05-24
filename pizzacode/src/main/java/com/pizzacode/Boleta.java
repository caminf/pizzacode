package com.pizzacode;

import java.util.ArrayList;

//contiene la informacion del usuario, el detalle de la pizza y el monto total.

public class Boleta {
    private Usuario usuario;
    private ArrayList<Orden> ordenes;
    private double total;
    private double descuento;
    // la boleta debe tener pizzas

    public Boleta(Usuario usuario, double total, double descuento) {
        this.usuario = usuario;
        this.total = total;
        this.descuento = descuento;

    }

    public Boleta(Usuario usuario, double total) {

        this.total = total;

    }

    public void imprimirBoleta() {
    }

    public void guardarBoleta() {
    }

    public void leerBoleta() {
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
