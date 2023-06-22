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
    public static Boleta b1;
    public static Usuario u1;
    
    @BeforeAll
    public static void setUp() {
        u1= new Usuario("Juan");
        b1 = new Boleta(u1);
    }

    public void checkPizzas() {
                
   
    }


    @Test
    public void displayUser(){
        String nombre_usuario = b1.nombreBoleta();
        Assertions.assertEquals(u1.getNombre(), nombre_usuario);    
    }

    public void checkPrecio() {
        int precio = 0;

    }

    public void isPagado() {
    
    }

}
