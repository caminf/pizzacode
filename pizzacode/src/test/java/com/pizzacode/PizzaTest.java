package com.pizzacode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PizzaTest {
    //la pizza es donde se encuentran los ingredientes y los precios de los ingredientes, 
    //aca se arma la pizza
    @BeforeAll
    public void setUp(){
        int[] seleccion = {1,2,1,1,2,4,7,13};
    }
    
    @Test
    public void checkPizza(int[] seleccion){
         
    }
    @Test
    public void checkPizzaNapolitana(){
    
    }
    

    @Test
    public void checkCosto() {
        
        Assertions.assertTrue(true);
    }

    @Test
    public void checkIngrediente(){
       
    }
    
}
