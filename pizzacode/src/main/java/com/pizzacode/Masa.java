package com.pizzacode;

// es un ingrediente, tiene otros componentes que lo diferencian de los ingredientes tradicionales

public class Masa extends Ingrediente {

    private TipoMasa tipo;
    private Tamanio tamanio;

    public Masa(String nombre) {
        super(nombre);

    }

    public Masa(double precio, TipoMasa tipo, Tamanio tamanio) {
        super(precio);
        this.tipo = tipo;
        this.tamanio = tamanio;
        
    }
    

    public TipoMasa getTipo() {
        return tipo;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

}
