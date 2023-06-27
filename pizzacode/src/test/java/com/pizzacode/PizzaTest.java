package com.pizzacode;

import java.util.Scanner;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PizzaTest {

    //mock simula el input de un usaurio por terminal
    @Mock
    Scanner scannerMock;

    //la pizza es donde se encuentran los ingredientes y los precios de los ingredientes, 
    //aca se arma la pizza
    public static Pizza pizzaPrueba;
    public static Pizza pizza;

    @BeforeAll
    public static void setUp() {
        pizzaPrueba = new Pizza("Personalizada");
        pizzaPrueba.ingredientes.add(new Masa(5000, TipoMasa.BLANCA, Tamanio.MEDIANA));
        pizzaPrueba.ingredientes.add(new Ingrediente("salsa tomate", 500));
        pizzaPrueba.ingredientes.add(new Ingrediente("tomate", 500));
        pizzaPrueba.ingredientes.add(new Ingrediente("queso", 500));
        pizzaPrueba.ingredientes.add(new Ingrediente("pollo", 700));
        pizzaPrueba.ingredientes.add(new Ingrediente("choclo", 500));
        pizzaPrueba.ingredientes.add(new Ingrediente("aji", 300));
        for (int i = 0; i < pizzaPrueba.ingredientes.size(); i++) {
            pizzaPrueba.setCosto(pizzaPrueba.getCosto() + pizzaPrueba.ingredientes.get(i).getPrecio());
        }
        pizza = new Pizza("pizza 1");
    }

    @Test

    public void checkSeleccionarTamanio(Pizza pizzaPrueba) {

    }

    ;
    @Test
    public void checkSeleccionarSalsa() {
        when(scannerMock.nextInt()).thenReturn(1);
        pizza.seleccionarSalsa(pizza);
        Assertions.assertEquals("salsa tomate", pizza.ingredientes.get(0).getNombre());
        Assertions.assertEquals(500, pizza.ingredientes.get(0).getPrecio(), 0);
    }

    ;

    //pizza personalizada
    @Test

    public void checkPizza(int seleccion) {
        Pizza pizzaPersonalizada = new Pizza("p1");
        pizzaPersonalizada.seleccionarTamanio(pizzaPersonalizada);
        Assertions.assertEquals(pizzaPrueba, pizzaPersonalizada);
    }

    @Test
    public void checkPizzaNapolitana(int seleccion) {

    }

    @Test
    public void checkCosto() {
        double costoEsperado = 8000;
        Assertions.assertEquals(costoEsperado, pizzaPrueba.getCosto());
    }

}
