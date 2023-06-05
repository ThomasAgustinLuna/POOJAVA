/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopService {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> shop = new HashMap();

    public void menu() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        int op;
        do {

            System.out.println("-------Bienvenido-------");
            System.out.println("Por favor elija una opcion");
            System.out.println("1-Introducir un producto");
            System.out.println("2-Modificar su precio");
            System.out.println("3-Eliminar un producto");
            System.out.println("4-Mostrar productos");
            System.out.println("5-Salir");
            System.out.println("");
            op = read.nextInt();
            switch (op) {

                case 1:
                    this.addItem();
                    break;
                case 2:
                    this.changePrice();
                    break;
                case 3:
                    this.deleteItem();
                    break;
                case 4:
                    this.showItems();
                    break;
                default:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
            }

        } while (op != 5);

    }

    public void addItem() {
        String ans;
        do {
            String item;
            Double price;
            System.out.println("Por favor ingrese el nombre del producto");
            item = read.next();
            System.out.println("Por favor ingrese el precio del producto");
            price = read.nextDouble();
            shop.put(item, price);
            System.out.println("Desea seguir ingresando productos? s/n");
            ans = read.next();
        } while (!ans.equalsIgnoreCase("n"));

    }

    public void changePrice() {
        System.out.println("Ingrese nombre del producto a modificar y seguido su nuevo precio");
        shop.replace(read.next(), read.nextDouble());
    }

    public void deleteItem() {
        System.out.println("Ingrese el nombre del producto a eliminar");
        shop.remove(read.next());
    }

    public void showItems() {
        System.out.println(shop);
    }

}
