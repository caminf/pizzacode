package com.pizzacode;

// es un ingrediente, tiene otros componentes que lo diferencian de los ingredientes tradicionales

public class Masa extends Ingrediente {

    private TipoMasa tipo;
    private Tamanio tamanio;

    public Masa(String nombre, double precio) {
        super(nombre, precio);

    }

    public TipoMasa getTipo() {
        return tipo;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

}
