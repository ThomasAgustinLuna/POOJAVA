package modulo10;

import java.util.Scanner;
import services.ServicioAlumno;

public class ej3 {
    public static void main(String[] args) {
        // Crea un objeto de la clase ServicioAlumno para gestionar los alumnos
        ServicioAlumno servicio = new ServicioAlumno();
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para preguntar al usuario si desea crear un nuevo alumno o salir del programa
        boolean salir = false;
        while (!salir) {
            System.out.print("¿Desea crear un nuevo alumno? (s/n): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) { // Si el usuario responde "s", crea un nuevo alumno
                servicio.crearAlumno();
            } else { // Si el usuario responde cualquier otra cosa, sale del bucle
                salir = true;
            }
        }

        // Calcula la nota final de todos los alumnos creados
        servicio.notaFinal();
    }
}