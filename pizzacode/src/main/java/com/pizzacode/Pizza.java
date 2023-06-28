package com.pizzacode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// aca se encuentra la pizza, aca estan los metodos para crear las pizzas y para agregar o quitar ingredientes. 

public class Pizza {

    private Scanner in = new Scanner(System.in);
    private String nombrePizza;
    private double costo;
    private Tamanio tamanio;
    private TipoMasa tipoMasa;
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public Pizza(String nombrePizza) {
        this.nombrePizza = nombrePizza;
        this.costo = 0;
    }

    public void calcularCosto() {
        for (Ingrediente ingrediente : ingredientes) {
            this.costo += ingrediente.getPrecio();
        }
    }

    public void detallePizza() {
        separador();

        System.out.println("NOMBRE INGREDIENTE: ");
        System.out.println("PRECIO INGREDIENTE: ");

        for (Ingrediente ingrediente : ingredientes) {
            separador();
            System.out.println("- " + ingrediente.getNombre());
            System.out.println("- " + ingrediente.getPrecio());

        }
        separador();

        System.out.println("TIPO MASA: " + this.tipoMasa);
        System.out.println("TIPO DE PIZZA: " + this.tamanio);
        separador();
    }

    public String nombrePizzaPersonalizada() {
        String nombrePizzaPer = in.nextLine();
        return nombrePizzaPer;
    }

    public Pizza(int seleccion) {
        switch (seleccion) {
            case 1:
                // Pizza Campestre
                this.nombrePizza = "Pizza Campestre";
                menuSeleccionTamanio();
                menuSeleccionTipoMasa();
                ingredientes.add(new Ingrediente("salsa tomate", 500));
                ingredientes.add(new Ingrediente("queso", 500));
                ingredientes.add(new Ingrediente("jamon", 700));
                ingredientes.add(new Ingrediente("tocino", 800));
                ingredientes.add(new Ingrediente("choclo", 500));
                ingredientes.add(new Ingrediente("pimenton", 500));
                this.costo += 3500;
                calcularCosto();
                detallePizza();

                break;

            case 2:
                // Pizza Napolitana
                this.nombrePizza = "Pizza napolitana";
                menuSeleccionTamanio();
                menuSeleccionTipoMasa();
                ingredientes.add(new Ingrediente("salsa tomate", 500));
                ingredientes.add(new Ingrediente(" tomate", 500));
                ingredientes.add(new Ingrediente("queso", 500));
                ingredientes.add(new Ingrediente("jamon", 700));
                ingredientes.add(new Ingrediente("aceituna", 500));
                ingredientes.add(new Ingrediente("oregano", 200));
                this.costo += 2700;
                calcularCosto();
                detallePizza();
                break;
            case 3:
                // Pizza Pepperoni
                this.nombrePizza = "Pizza pepperoni";
                menuSeleccionTamanio();
                menuSeleccionTipoMasa();
                ingredientes.add(new Ingrediente("salsa tomate", 500));
                ingredientes.add(new Ingrediente("queso", 500));
                ingredientes.add(new Ingrediente("pepperoni", 700));
                this.costo += 1700;
                calcularCosto();
                detallePizza();
                break;
            case 4:
                // Pizza Personalizada
                System.out.println("Inserte nombre de la pizza");
                this.nombrePizza = nombrePizzaPersonalizada();
                menuSeleccionTamanio();
                menuSeleccionTipoMasa();
                menuSeleccionSalsa();
                menuAgregarIngrediente();
                calcularCosto();
                detallePizza();
                break;
            case 5:
                break;
            default:
        }
    }

    public void menuSeleccionTipoMasa() {
        separador();
        System.out.println("Seleccione tipo de masa:");
        System.out.println("1.- Blanca");
        System.out.println("2.- Integral");
        System.out.println("3.- Vegana");
        int seleccionMasa = in.nextInt();
        seleccionTipoMasa(seleccionMasa);
    }

    public void seleccionTipoMasa(int seleccionMasa) {
        switch (seleccionMasa) {
            case 1:
                this.tipoMasa = TipoMasa.BLANCA;
                break;
            case 2:
                this.tipoMasa = TipoMasa.INTEGRAL;
                break;
            case 3:
                this.tipoMasa = TipoMasa.VEGANA;
                break;
            default:
                break;
        }
    }

    public void menuSeleccionTamanio() {
        separador();
        System.out.println("Seleccione tamaño de la pizza:");
        System.out.println("1.- Pequeña_____________+$3000");
        System.out.println("2.- Mediana_____________+$5000");
        System.out.println("3.- Familiar____________+$7000");
        System.out.println("4.- XL__________________+$10000");
        int seleccionTamanio = in.nextInt();
        seleccionTamanio(seleccionTamanio);
    }

    public void seleccionTamanio(int seleccionTamanio) {
        switch (seleccionTamanio) {
            case 1:
                this.tamanio = Tamanio.INDIVIDUAL;
                this.costo += 3000;
                break;
            case 2:
                this.tamanio = Tamanio.MEDIANA;
                this.costo += 5000;
                break;
            case 3:
                this.tamanio = Tamanio.FAMILIAR;
                this.costo += 7000;
                break;
            case 4:
                this.tamanio = Tamanio.XL;
                this.costo += 10000;
                break;
            default:
                break;
        }
    }

    public void menuSeleccionSalsa() {
        System.out.println("Seleccione su salsa:");
        System.out.println("1.- Salsa de tomate_____+$500");
        System.out.println("2.- Salsa pesto_________+$800");
        System.out.println("3.- Salsa blanca________+$700");
        int seleccion = in.nextInt();
        seleccionarSalsa(seleccion);
    }

    public void seleccionarSalsa(int seleccionSalsa) {
        switch (seleccionSalsa) {
            case 1:
                this.ingredientes.add(new Ingrediente("salsa tomate", 500));
                break;
            case 2:
                this.ingredientes.add(new Ingrediente("salsa pesto", 800));
                break;
            case 3:
                this.ingredientes.add(new Ingrediente("salsa blanca", 700));
                break;
            default:
                break;
        }
    }

    public void menuAgregarIngrediente() {
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

            int seleccionIngrediente = in.nextInt();
            if (!(seleccionIngrediente == 14)) {
                agregarIngrediente(seleccionIngrediente);
            } else {
                terminar = false;
            }
        } while (terminar);
    }

    public void agregarIngrediente(int seleccionIngrediente) {

        switch (seleccionIngrediente) {
            case 1:
                this.ingredientes.add(new Ingrediente("tomate", 500));
                break;
            case 2:
                this.ingredientes.add(new Ingrediente("queso", 500));
                break;

            case 3:
                this.ingredientes.add(new Ingrediente("jamon", 700));
                break;

            case 4:
                this.ingredientes.add(new Ingrediente("pollo", 700));
                break;
            case 5:
                this.ingredientes.add(new Ingrediente("tocino", 800));
                break;
            case 6:
                this.ingredientes.add(new Ingrediente("pepperoni", 700));
                break;
            case 7:
                this.ingredientes.add(new Ingrediente("choclo", 500));
                break;
            case 8:
                this.ingredientes.add(new Ingrediente("aceituna", 500));
                break;
            case 9:
                this.ingredientes.add(new Ingrediente("pimenton", 500));
                break;
            case 10:
                this.ingredientes.add(new Ingrediente("champiñon", 500));
                break;
            case 11:
                this.ingredientes.add(new Ingrediente("oregano", 200));
                break;
            case 12:
                this.ingredientes.add(new Ingrediente("albahaca", 200));
                break;
            case 13:
                this.ingredientes.add(new Ingrediente("aji", 300));
                break;
            case 14:
                break;
            default:
                break;
        }
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

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public TipoMasa getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(TipoMasa tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public void separador() {
        System.out.println("---------------");

    }

}
