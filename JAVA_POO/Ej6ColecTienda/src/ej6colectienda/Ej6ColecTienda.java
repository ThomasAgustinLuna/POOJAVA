/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package ej6colectienda;

import Services.ShopService;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Ej6ColecTienda {

    public static void main(String[] args) {
        ShopService ss = new ShopService();
        ss.menu();
    }

}
