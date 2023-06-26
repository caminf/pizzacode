package com.pizzacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// aca se encuentra la pizza, aca estan los metodos para crear las pizzas y para agregar o quitar ingredientes. 
public class Pizza {

    private Scanner in = new Scanner(System.in);

    private String nombrePizza;
    private double costo;
    // ingredientes arraylist
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(String nombrePizza) {

        this.nombrePizza = nombrePizza;

        this.costo = 0;

    }

    public Pizza(int seleccion) {
        switch (seleccion) {
            case 1:
                // Pizza Campestre
                this.nombrePizza = "Pizza campestre";
                Pizza PizzaC = new Pizza(nombrePizza);
                seleccionarTamanio(PizzaC);
                PizzaC.ingredientes.add(new Ingrediente("salsa tomate"));
                PizzaC.ingredientes.add(new Ingrediente("queso"));
                PizzaC.ingredientes.add(new Ingrediente("jamon"));
                PizzaC.ingredientes.add(new Ingrediente("tocino"));
                PizzaC.ingredientes.add(new Ingrediente("choclo"));
                PizzaC.ingredientes.add(new Ingrediente("pimenton"));
                this.costo = 3500 + PizzaC.ingredientes.get(0).getPrecio();

                break;

            case 2:
                // Pizza Napolitana
                this.nombrePizza = "Pizza napolitana";
                Pizza PizzaN = new Pizza(nombrePizza);
                seleccionarTamanio(PizzaN);
                PizzaN.ingredientes.add(new Ingrediente("salsa tomate"));
                PizzaN.ingredientes.add(new Ingrediente("tomate"));
                PizzaN.ingredientes.add(new Ingrediente("queso"));
                PizzaN.ingredientes.add(new Ingrediente("jamon"));
                PizzaN.ingredientes.add(new Ingrediente("aceituna"));
                PizzaN.ingredientes.add(new Ingrediente("oregano"));
                this.costo = 2700 + PizzaN.ingredientes.get(0).getPrecio();

                break;
            case 3:
                // Pizza Pepperoni
                this.nombrePizza = "Pizza pepperoni";
                Pizza PizzaP = new Pizza(nombrePizza);
                seleccionarTamanio(PizzaP);
                PizzaP.ingredientes.add(new Ingrediente("salsa tomate"));
                PizzaP.ingredientes.add(new Ingrediente("queso"));
                PizzaP.ingredientes.add(new Ingrediente("pepperoni"));
                this.costo = 1700 + PizzaP.ingredientes.get(0).getPrecio();

                break;
            case 4:
                // Pizza Personalizada

                System.out.println("Inserte nombre de la pizza");
                this.nombrePizza = in.next();
                Pizza pizzaPersonalizada = new Pizza(nombrePizza);
                seleccionarTamanio(pizzaPersonalizada);
                seleccionarSalsa(pizzaPersonalizada);
                agregarIngrediente(pizzaPersonalizada);
                this.ingredientes = pizzaPersonalizada.getIngredientes();
                for (int i = 0; i < ingredientes.size(); i++) {
                    this.costo = costo + ingredientes.get(i).getPrecio();
                }

                /*System.out.println(nombrePizza);
                System.out.println(costo);
                for (int i = 0; i < ingredientes.size(); i++) {
                System.out.println(ingredientes.get(i).getPrecio());
                }*/
                break;
            case 5:

                break;

            default:

        }
    }

    private void seleccionarTamanio(Pizza pizza) {

        separador();
        System.out.println("Seleccione tipo de masa:");
        System.out.println("1.- Blanca");
        System.out.println("2.- Integral");
        System.out.println("3.- Vegana");
        int masa = in.nextInt();
        TipoMasa tipoMasa = null;
        switch (masa) {
            case 1:
                tipoMasa = TipoMasa.BLANCA;
                break;
            case 2:
                tipoMasa = TipoMasa.INTEGRAL;
                break;
            case 3:
                tipoMasa = TipoMasa.VEGANA;
                break;
        }
        separador();
        System.out.println("Seleccione tamaño de la pizza:");
        System.out.println("1.- Pequeña_____________+$3000");
        System.out.println("2.- Mediana_____________+$5000");
        System.out.println("3.- Familiar____________+$7000");
        System.out.println("4.- XL__________________+$10000");
        int seleccion = in.nextInt();
        Tamanio tamanio = null;
        double precio = 0;
        switch (seleccion) {
            case 1:
                tamanio = Tamanio.INDIVIDUAL;
                precio = 3000;
                break;
            case 2:
                tamanio = Tamanio.MEDIANA;
                precio = 5000;
                break;
            case 3:
                tamanio = Tamanio.FAMILIAR;
                precio = 7000;
                break;
            case 4:
                tamanio = Tamanio.XL;
                precio = 10000;
                break;
            default:
                break;
        }
        pizza.ingredientes.add(new Masa(precio, tipoMasa, tamanio));

    }

    private void seleccionarSalsa(Pizza pizza) {

        System.out.println("Seleccione su salsa:");
        System.out.println("1.- Salsa de tomate_____+$500");
        System.out.println("2.- Salsa pesto_________+$800");
        System.out.println("3.- Salsa blanca________+$700");
        int seleccion = in.nextInt();
        switch (seleccion) {
            case 1:
                pizza.ingredientes.add(new Ingrediente("salsa tomate", 500));
                break;
            case 2:
                pizza.ingredientes.add(new Ingrediente("salsa pesto", 800));
                break;
            case 3:
                pizza.ingredientes.add(new Ingrediente("salsa blanca", 700));
                break;
            default:
                break;
        }

    }

    private void agregarIngrediente(Pizza pizza) {
        boolean terminar = true;

        do {
            separador();
            System.out.println("¿Qué ingredientes desea agregar? ");
            System.out.println("1.- Tomate______________+$500");
            System.out.println("2.- Queso_______________+$500");
            System.out.println("3.- Jamón_______________+$700");
            System.out.println("4.- Pollo_______________+$700");
            System.out.println("5.- Tocino______________+$800");
            System.out.println("6.- Pepperoni___________+$700");
            System.out.println("7.- Choclo______________+$500");
            System.out.println("8.- Aceituna____________+$500");
            System.out.println("9.- Pimentón____________+$500");
            System.out.println("10. Champiñón___________+$500");
            separador();
            System.out.println("Agregados");
            System.out.println("11.- Orégano____________+$200");
            System.out.println("12.- Albahaca___________+$200");
            System.out.println("13.- Ají________________+$300");
            separador();
            System.out.println("14.- Atrás");
            separador();

            int seleccion = in.nextInt();
            switch (seleccion) {
                case 1:
                    pizza.ingredientes.add(new Ingrediente("tomate", 500));
                    break;
                case 2:
                    pizza.ingredientes.add(new Ingrediente("queso", 500));
                    break;

                case 3:
                    pizza.ingredientes.add(new Ingrediente("jamon", 700));
                    break;

                case 4:
                    pizza.ingredientes.add(new Ingrediente("pollo", 700));
                    break;
                case 5:
                    pizza.ingredientes.add(new Ingrediente("tocino", 800));
                    break;
                case 6:
                    pizza.ingredientes.add(new Ingrediente("pepperoni", 700));
                    break;
                case 7:
                    pizza.ingredientes.add(new Ingrediente("choclo", 500));
                    break;
                case 8:
                    pizza.ingredientes.add(new Ingrediente("aceituna", 500));
                    break;
                case 9:
                    pizza.ingredientes.add(new Ingrediente("pimenton", 500));
                    break;
                case 10:
                    pizza.ingredientes.add(new Ingrediente("champiñon", 500));
                    break;
                case 11:
                    pizza.ingredientes.add(new Ingrediente("oregano", 200));
                    break;
                case 12:
                    pizza.ingredientes.add(new Ingrediente("albahaca", 200));
                    break;
                case 13:
                    pizza.ingredientes.add(new Ingrediente("aji", 300));
                    break;
                case 14:
                    terminar = false;
                    break;
                default:
                    terminar = false;
                    break;
            }

        } while (terminar);

    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public String getNombrePizza() {
        return nombrePizza;
    }

    public void setNombrePizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void separador() {
        System.out.println("---------------");

    }
}
