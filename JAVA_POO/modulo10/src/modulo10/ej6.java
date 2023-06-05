package modulo10;

import java.util.Scanner;
import services.ServicioProducto;

public class ej6 {
    public static void main(String[] args) {
        // Crea un objeto de la clase ServicioProducto para gestionar los productos
        ServicioProducto servicio = new ServicioProducto();
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para mostrar un menú de opciones y realizar acciones en función de la opción seleccionada
        boolean salir = false;
        while (!salir) {
            System.out.println("\n----- MENÚ -----");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Si el usuario selecciona la opción 1, agrega un nuevo producto
                    servicio.agregarProducto();
                    break;
                case 2: // Si el usuario selecciona la opción 2, modifica el precio de un producto existente
                    servicio.modificarPrecio();
                    break;
                case 3: // Si el usuario selecciona la opción 3, elimina un producto existente
                    servicio.eliminarProducto();
                    break;
                case 4: // Si el usuario selecciona la opción 4, muestra todos los productos existentes
                    servicio.mostrarProductos();
                    break;
                case 5: // Si el usuario selecciona la opción 5, sale del bucle y termina el programa
                    salir = true;
                    break;
                default: // Si el usuario selecciona una opción inválida, muestra un mensaje de error
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}