package com.pizzacode;

import java.util.ArrayList;

//contiene la informacion del usuario, el detalle de la pizza y el monto total.

public class Boleta {
    private Usuario usuario;
    private double total;
    private double descuento;
    private ArrayList<Pizza> pizzas = new ArrayList<>();
    // la boleta debe tener pizzas

    public Boleta(Usuario usuario) {
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

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    

}
