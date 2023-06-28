package com.pizzacode;

import java.util.ArrayList;
import java.util.List;

//contiene la informacion del usuario, el detalle de la pizza y el monto total.

public class Boleta {

    private Usuario usuario;
    private double total;
    private List<Pizza> pizzas = new ArrayList<>();

    public Boleta(Usuario usuario) {
        this.usuario = usuario;
    }

    public String nombreBoleta() {
        String nombreBoleta = this.usuario.getNombre();
        return nombreBoleta;
    }

    public void agregarPizza(int seleccion) {
        // Pizza pizza = new Pizza(seleccion);
        pizzas.add(new Pizza(seleccion));
    }

    public void agregarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public double calcularTotal() {
        for (int i = 0; i < pizzas.size(); i++) {
            total = total + pizzas.get(i).getCosto();
        }
        return total;
    }

    public void mostrarPizzas() {
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println("Nombre Pizza: " + pizzas.get(i).getNombrePizza());
            System.out.println("Costo Pizza: " + pizzas.get(i).getCosto());

        }

    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza pizza) {
        this.pizzas.add(pizza);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
