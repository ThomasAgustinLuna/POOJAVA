package services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioProducto {
    // Declaración de un Map para almacenar productos y sus precios
    private final Map<String, Double> productos;

    // Constructor de la clase que inicializa el Map
    public ServicioProducto() {
        productos = new HashMap<>();
    }

    // Método para agregar un nuevo producto al Map
    public void agregarProducto() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre y el precio del producto
        System.out.print("Introduce el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        // Comprueba si el producto ya existe en el Map y lo añade si no existe
        if (productos.containsKey(nombre)) {
            System.out.println("El producto ya existe en la lista.");
        } else {
            productos.put(nombre, precio);
            System.out.println("Producto agregado correctamente.");
        }
    }

    // Método para modificar el precio de un producto existente en el Map
    public void modificarPrecio() {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre del producto a modificar
        System.out.print("Introduce el nombre del producto a modificar: ");
        String nombre = scanner.nextLine();

        // Comprueba si el producto existe en el Map y modifica su precio si existe
        if (productos.containsKey(nombre)) {
            System.out.print("Introduce el nuevo precio del producto: ");
            double precio = scanner.nextDouble();

            productos.put(nombre, precio);
            System.out.println("Precio modificado correctamente.");
        } else {
            System.out.println("El producto no se encuentra en la lista.");
        }
    }

    // Método para eliminar un producto existente en el Map
    public void eliminarProducto() {
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre del producto a eliminar
        System.out.print("Introduce el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        // Comprueba si el producto existe en el Map y lo elimina si existe
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no se encuentra en la lista.");
        }
    }

    // Método para mostrar todos los productos y sus precios en el Map
    public void mostrarProductos() {
        System.out.println("Lista de productos:");
        productos.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " - Precio: " + entry.getValue());
        });
    }
}