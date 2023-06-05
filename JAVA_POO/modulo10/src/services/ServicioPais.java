package services;

import entities.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ServicioPais {
    // Declaración de un HashSet para almacenar objetos de la clase Pais
    private final Set<Pais> paises;

    // Constructor de la clase que inicializa el HashSet
    public ServicioPais() {
        paises = new HashSet<>();
    }

    // Método para crear un nuevo objeto de la clase Pais y añadirlo al HashSet
    public void agregarPais() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre del país
        System.out.print("Introduce el nombre del país: ");
        String nombre = scanner.nextLine();

        // Crea un objeto de la clase Pais con el nombre introducido y lo añade al HashSet
        Pais pais = new Pais(nombre);
        if (paises.add(pais)) {
            System.out.println("País agregado correctamente.");
        } else {
            System.out.println("El país ya se encuentra en la lista.");
        }
    }

    // Método para mostrar todos los objetos de la clase Pais en el HashSet
    public void mostrarPaises() {
        System.out.println("Lista de países:");
        paises.forEach((pais) -> {
            System.out.println(pais);
        });
    }

    // Método para mostrar todos los objetos de la clase Pais en el HashSet ordenados alfabéticamente
    public void mostrarPaisesOrdenados() {
        // Crea un TreeSet a partir del HashSet para ordenar los objetos de la clase Pais alfabéticamente
        Set<Pais> paisesOrdenados = new TreeSet<>(paises);
        System.out.println("Lista de países ordenados alfabéticamente:");
        paisesOrdenados.forEach((pais) -> {
            System.out.println(pais);
        });
    }

    // Método para eliminar un objeto de la clase Pais del HashSet
    public void eliminarPais() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre del país que desea eliminar
        System.out.print("Introduce el nombre del país a eliminar: ");
        String nombre = scanner.nextLine();

        // Crea un iterador para recorrer el HashSet y eliminar el objeto de la clase Pais con el nombre introducido
        Iterator<Pais> iterator = paises.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equalsIgnoreCase(nombre)) {
                iterator.remove();
                System.out.println("País eliminado correctamente.");
                encontrado = true;
            }
        }

        // Si no se encuentra el país, muestra un mensaje de error por pantalla
        if (!encontrado) {
            System.out.println("El país no se encuentra en la lista.");
        }
    }
}