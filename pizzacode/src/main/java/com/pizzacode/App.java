package com.pizzacode;

import java.util.Scanner;

public class App {

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Carrito
        Carrito carrito1 = new Carrito();
        System.out.println("BIENVENIDO A LA PIZZERIA");
        carrito1.menu();
    }

}
