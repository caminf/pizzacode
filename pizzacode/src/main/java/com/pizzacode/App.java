package com.pizzacode;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // pruebas con una orden
        Carrito carrito1 = new Carrito();

        do {
            carrito1.menu();
        } while (carrito1.pagar());
    }

}
