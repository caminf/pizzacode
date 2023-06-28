package com.pizzacode;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PizzaTest {
    // la pizza es donde se encuentran los ingredientes y los precios de los
    // ingredientes,
    // aca se arma la pizza
    public static Pizza pizza;
    public static Pizza pizzaPrueba;
    public static List<Ingrediente> ingredientesTest;
    public double costoEsperado = 0;
    public double costoObtenido = 0;

    @BeforeEach
    public void setUp() {
        ingredientesTest = new ArrayList<>();
        pizzaPrueba = new Pizza("Personalizada");
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3, 4 })
    public void checkSeleccionarTamanio(int seleccionTamanio) {
        pizzaPrueba.seleccionTamanio(seleccionTamanio);
        Assertions.assertNotNull(pizzaPrueba.getTamanio());
    }
    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 3 })
    public void checkSeleccionarSalsa(int seleccionSalsa) {
        pizzaPrueba.seleccionarSalsa(seleccionSalsa);
        Assertions.assertNotNull(pizzaPrueba.getIngredientes());
    }

    @ParameterizedTest
    @ValueSource(ints = { 1 })
    public void checkCalcularCosto(int seleccionIngrediente) {
         /*
         * 1.- Tomate______________+$500");
       
         */
         pizzaPrueba.agregarIngrediente(seleccionIngrediente);
         pizzaPrueba.calcularCosto();
         costoObtenido = pizzaPrueba.getCosto();
         costoEsperado = 500;
         Assertions.assertEquals(costoEsperado, costoObtenido);
    }

}
