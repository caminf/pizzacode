package com.pizzacode;

public class Boleta {
    private Usuario usuario;
    private double total;
    private double descuento;
    //la boleta debe tener pizzas

    public Boleta(Usuario usuario, double total, double descuento) {

        this.usuario = usuario;
        this.total = total;
        this.descuento = descuento;

    }

    public Boleta(Usuario usuario, double total) {

        this.usuario = usuario;
        this.total = total;

    }

    public void imprimirBoleta() {
    }

    public void guardarBoleta() {
    }

    public void leerBoleta() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    

}
