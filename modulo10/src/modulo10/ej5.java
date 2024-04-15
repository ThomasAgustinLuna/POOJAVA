package modulo10;

import java.util.Scanner;
import services.ServicioPais;

public class ej5 {
    public static void main(String[] args) {
        // Crea un objeto de la clase ServicioPais para gestionar los países
        ServicioPais servicio = new ServicioPais();
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para pedir al usuario que introduzca nombres de países o escriba "salir" para finalizar
        boolean salir = false;
        while (!salir) {
            System.out.print("Introduce el nombre de un país (o 'salir' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) { // Si el usuario escribe "salir", sale del bucle
                salir = true;
            } else { // Si el usuario introduce un nombre de país, lo añade a la lista de países
                servicio.agregarPais();
            }
        }

        // Muestra la lista de países
        servicio.mostrarPaises();

        // Muestra la lista de países ordenada alfabéticamente
        servicio.mostrarPaisesOrdenados();

        // Pide al usuario que introduzca un país para eliminar de la lista
        servicio.eliminarPais();

        // Muestra la lista de países actualizada después de la eliminación
        servicio.mostrarPaises();
    }
}