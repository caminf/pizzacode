package com.pizzacode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CarritoTest {
    public static Carrito carrito;
    public static Usuario usuario;

    @BeforeAll
    public static void setUp() {
        carrito = new Carrito();
        usuario = new Usuario("juan");

    }

    @Test
    public void checkUsrRegistro() {

        carrito.registarUsuario(usuario);

        for (int i = 0; i < carrito.getOrdenes().size(); i++) {
            System.out.println(carrito.getOrdenes().get(i).getUsuario().getNombre());
        }

        Assertions.assertNotNull(carrito.getOrdenes());
    }

}
