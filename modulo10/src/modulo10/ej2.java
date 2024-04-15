package modulo10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ej2 {
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

        // Imprime las razas de perros guardadas en el ArrayList, ordenadas alfabéticamente
        System.out.println("Las razas de perros guardadas son:");
        Collections.sort(razasPerros);
        razasPerros.forEach((raza) -> {
            System.out.println(raza);
        });

        // Pide al usuario que introduzca una raza de perro para eliminar de la lista
        System.out.print("Introduce una raza de perro para eliminar de la lista: ");
        String razaEliminar = scanner.nextLine();

        // Crea un iterador para recorrer el ArrayList y buscar la raza de perro a eliminar
        Iterator<String> iterador = razasPerros.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            String raza = iterador.next();
            if (raza.equalsIgnoreCase(razaEliminar)) { // Si encuentra la raza de perro, la elimina del ArrayList
                iterador.remove();
                encontrado = true;
                break;
            }
        }

        // Informa al usuario si la raza de perro fue eliminada o no
        if (encontrado) {
            System.out.println("La raza de perro " + razaEliminar + " ha sido eliminada.");
        } else {
            System.out.println("La raza de perro " + razaEliminar + " no se encontró en la lista.");
        }

        // Imprime las razas de perros guardadas en el ArrayList después de la eliminación, ordenadas alfabéticamente
        System.out.println("Las razas de perros guardadas son:");
        Collections.sort(razasPerros);
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}