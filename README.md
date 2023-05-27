<h1 align="center"> BIENVENIDOS A PIZZA CODE </h1>

<div align="center">  
  <img src = "https://github.com/caminf/pizzacode/assets/48688160/e60a0a4b-07ea-4e6b-84b1-8f4ff5d3046e">
   
  Aca se encuentran las versiones del codigo de la pizzeria.
  Documentación se encuentra mas detalladamente en la plataforma digital
  [Confluence](https://cinfante01.atlassian.net/l/cp/fdpXrhY7) .

</div>     

## DESCRIPCION DEL PROYECTO

Pizzacode es un proyecto basado en Java 17.0.7 + Apache Maven 3.9.1 el cual consiste en la creacion de una pizzeria virtual.
Este proyecto busca facilitar las ordenes de compra de una pizzeria, el sistema debera contar opciones para, agregar usuarios, agregar boletas, pagar boletas y ver los usuarios disponibles.

Cada producto tendrá su respectivo valor e ingredientes, existen pizzas temáticas que contienen ingredientes previamente seleccionados, estas tienen un valor único que podría ir aumentando a medida que el usuario decida agregar o cambiar ingredientes. También existen las pizzas personalizadas, en este caso, el usuario tiene la opción de escoger entre distintas opciones, ya sea escoger la masa, la salsa, agregar o quitar ingredientes y guardar pizzas.

<h4 align="center">
:construction: Proyecto en construcción :construction:
</h4>

## ORDEN DE FUNCIONAMIENTO EN EL PROGRAMA

Al iniciar el programa un menu nos mostrara 4 opciones para elegir 

1.- Ordenar

2.- Pagar

3.- Ver usuarios

4.- Registrar usuario

![menu_principal](https://github.com/caminf/pizzacode/assets/48688160/13cb11a8-61d6-4416-b465-3a22a9f12395)

La(s) condicion(es) son:
  - No se puede comprar sin que no exista un usuario registrado.
   
  ![restriccion_orden](https://github.com/caminf/pizzacode/assets/48688160/fc1f3af1-cda8-40e5-9785-95c20cb6bc9f)
  
   - Un usuario debe ser registrado para poder utilizar la opcion Pagar.
     
   <img src = "https://github.com/caminf/pizzacode/assets/48688160/416155bb-9f57-46f6-bc2b-1468200559fc">
    
  - No se puede utilizar el carrito(pagar) si es que no se ha creado un usuario o una orden de compra(Boleta).
  
  ![image](https://github.com/caminf/pizzacode/assets/48688160/25231452-3cb6-4fea-9205-c4f5e66c771c)

  - Un usuario ya registrado no puede pagar si no tiene boletas disponibles.
  
  ![restriccion_usr_Boletas](https://github.com/caminf/pizzacode/assets/48688160/a7442af7-f49a-4820-a7d3-e6614d5f10aa)


Una vez registrado el usuario, las opciones mostrar usuario y ordenar estaran disponibles:

![ver_usr](https://github.com/caminf/pizzacode/assets/48688160/ea2bb0a4-ee95-4141-934f-1599b1575229)

Al momento de seleccionar la opcion ordenar se mostrara una pestaña para seleccionar el usuario o los usuarios anteriormente registrado.

![ordenar](https://github.com/caminf/pizzacode/assets/48688160/a33a9f4d-a59f-4773-8905-35c12f9ff2a1)

En la pestaña siguiente se mostrara un apartado para la seleccion de Pizzas, esta opcion aun se encuentra en desarrollo, por lo tanto solo se seleccionaran pizzas default.

![mostrar_pizzas](https://github.com/caminf/pizzacode/assets/48688160/8cbcb6ca-2b17-4382-9674-cba5dfeb45d5)


El usuario se generara una orden de compra, esta contendra la o las boletas, junto con el detalle de las pizzas y los montos totales.

![boletas](https://github.com/caminf/pizzacode/assets/48688160/c9688e38-9aac-44cf-a362-35311fbec77e)


Estas boletas contendran la informacion de la pizza, sus ingredientes (masa, salsa,+agregados), estas pizzas pueden 
ser pizzas default o pizzas personalizadas.

Luego de esto al usuario se le consultara si desea agregar mas ingredientes.

En la boleta se contendra el valor total del pedido, junto con el detalle de esta.

## Tecnologias Utilizadas

- Java 17.0.7
- Apache Maven 3.9.1
- SonarQube 8.9.10
- Visual Studio Code 1.78.2
- Confluence

