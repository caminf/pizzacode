package com.pizzacode;

import java.util.ArrayList;

//contiene la informacion del usuario, el detalle de la pizza y el monto total.

public class Boleta {
    private Usuario usuario;
    private double total;
    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public Boleta(Usuario usuario) {
        this.usuario = usuario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
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
