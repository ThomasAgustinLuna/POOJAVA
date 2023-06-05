package modulo10;

import java.util.ArrayList;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        // Crea un ArrayList para almacenar las razas de perros introducidas por el usuario
        ArrayList<String> razasPerros = new ArrayList<>();
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para pedir al usuario que introduzca una raza de perro o escriba "salir" para finalizar
        boolean salir = false;
        while (!salir) {
            System.out.print("Introduce una raza de perro o escribe 'salir' para finalizar: ");
            String raza = scanner.nextLine();

            if (raza.equalsIgnoreCase("salir")) { // Si el usuario escribe "salir", sale del bucle
                salir = true;
            } else { // Si el usuario introduce una raza de perro, la añade al ArrayList
                razasPerros.add(raza);
            }
        }

        // Imprime las razas de perros guardadas en el ArrayList
        System.out.println("Las razas de perros guardadas son:");
        razasPerros.forEach((raza) -> {
            System.out.println(raza);
        });
    }
}