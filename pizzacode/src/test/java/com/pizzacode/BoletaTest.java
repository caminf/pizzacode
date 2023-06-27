package com.pizzacode;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BoletaTest {
    // Boleta Test, la boleta es aquella que contiene el precio de las pizzas.
    // la infomracion de las pizzas, y el calculo del costo de las pizzas
    // y la informacion del usuario
    public static Boleta boleta;
    public static Usuario usuario;
    public static List<Pizza> pizzas;
    public static double total;
    public static double totalExp;

    @BeforeAll
    public static void setUp() {
        usuario = new Usuario("Juan");
        boleta = new Boleta(usuario);
        pizzas = new ArrayList<>();

    }

    @Test
    public void checkAddPizzas() {
        Pizza seleccionPizza = new Pizza("Pizza Test");

        boleta.agregarPizza(seleccionPizza);

        Assertions.assertFalse(boleta.getPizzas().isEmpty());
    }

    @Test
    public void checkTotal() {
        Pizza pizzaExp = new Pizza("Pizza expexted");
        Pizza pizzaTest = new Pizza("Pizza given");

        boleta.agregarPizza(pizzaTest);

        pizzas.add(pizzaExp);

        total = boleta.calcularTotal();

        for (int i = 0; i < pizzas.size(); i++) {
            totalExp = totalExp + pizzas.get(i).getCosto();
        }

        System.out.println("total: " + total);

        System.out.println("total exp : " + totalExp);
        Assertions.assertTrue(total == totalExp);
    }

    @Test
    public void displayUser() {
        String nombre_usuario = boleta.nombreBoleta();
        Assertions.assertEquals(usuario.getNombre(), nombre_usuario);
    }

    @Test
    public void displayPizzas() {

        boleta.mostrarPizzas();
        Assertions.assertNotNull(boleta.getPizzas());
    }

}
