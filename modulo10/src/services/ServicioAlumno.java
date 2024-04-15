package services;

import entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioAlumno {
    // Declaración de un ArrayList para almacenar objetos de la clase Alumno
    private final ArrayList<Alumno> listaAlumnos;

    // Constructor de la clase que inicializa el ArrayList
    public ServicioAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    // Método para crear un nuevo objeto de la clase Alumno y añadirlo al ArrayList
    public void crearAlumno() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre del alumno
        System.out.print("Introduce el nombre del alumno: ");
        String nombre = scanner.nextLine();

        // Crea un ArrayList para almacenar las notas del alumno
        ArrayList<Integer> notas = new ArrayList<>();

        // Pide al usuario que introduzca las tres notas del alumno y las añade al ArrayList
        System.out.println("Introduce las tres notas del alumno:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            int nota = scanner.nextInt();
            notas.add(nota);
        }

        // Crea un objeto de la clase Alumno con el nombre y las notas introducidos y lo añade al ArrayList
        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);
    }

    // Método para calcular la nota final de un alumno y mostrarla por pantalla
    public void notaFinal() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el nombre del alumno cuya nota final desea calcular
        System.out.print("Introduce el nombre del alumno para calcular su nota final: ");
        String nombre = scanner.nextLine();

        // Recorre el ArrayList de alumnos hasta encontrar el objeto con el nombre introducido
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                // Si se encuentra el alumno, calcula su nota final y la muestra por pantalla
                double notaFinal = alumno.notaFinal();
                System.out.println("La nota final del alumno " + nombre + " es " + notaFinal);
                return;
            }
        }

        // Si no se encuentra el alumno, muestra un mensaje de error por pantalla
        System.out.println("El alumno " + nombre + " no se encuentra en la lista.");
    }
}