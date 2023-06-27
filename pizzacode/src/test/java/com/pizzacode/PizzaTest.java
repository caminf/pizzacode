package com.pizzacode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PizzaTest {

    // mock simula el input de un usaurio por terminal

    // la pizza es donde se encuentran los ingredientes y los precios de los
    // ingredientes,
    // aca se arma la pizza
    public static Pizza pizza;
    public static Pizza pizzaPrueba;
    public static List<Ingrediente> ingredientesTest;
    public double costoEsperado = 0;
    public double costoObtenido = 0;

    @BeforeAll
    public static void setUp() {
        ingredientesTest = new ArrayList<>();
        pizzaPrueba = new Pizza("Personalizada");
        pizza = new Pizza("pizza test");
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4 })
    public void checkSeleccionarTamanio(int seleccionTamanio) {
        pizza.seleccionTamanio(seleccionTamanio);
        Assertions.assertNotNull(pizza.getTamanio());
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    public void checkSeleccionarSalsa(int seleccionSalsa) {

        pizza.seleccionarSalsa(seleccionSalsa);

        Assertions.assertNotNull(pizza.getIngredientes());

    }

    @ParameterizedTest
    @ValueSource(ints = { 1 })
    public void checkCosto(int seleccionIngrediente) {
        pizza.agregarIngrediente(seleccionIngrediente);
        pizza.calcularCosto();

        for (int i = 0; i < pizza.getIngredientes().size(); i++) {
            System.out.println("nombre: " + pizza.getIngredientes().get(i).getNombre());
            System.out.println("precio: " + pizza.getIngredientes().get(i).getPrecio());

        }

        double costo = pizza.getCosto();
        /*
         * 1.- Tomate______________+$500");
         * 
         * La Pizza utilizada por los test se incializa con un costo base de 10
         * esto para agilizar el testeo de las pizzas
         */
        double costoEsperado = 500 + 10;
        Assertions.assertEquals(costoEsperado, costo);
    }

}
