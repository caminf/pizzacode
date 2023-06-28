package com.pizzacode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarritoTest {
    public static Carrito carrito;

    @BeforeAll
    public static void setUp() {
        carrito = new Carrito();

    }

    @ParameterizedTest
    @ValueSource(strings = { "Carlos" })
    public void checkUsrRegistro(String nombre) {

        carrito.registarUsuario(nombre);

        String nombreExp = "Carlos";
        String nombreObtenido = carrito.getOrdenes().get(0).getUsuario().getNombre();

        Assertions.assertEquals(nombreExp, nombreObtenido);
    }

}
