package modulo10;

import java.util.Scanner;
import services.ServicioPelicula;

public class ej4 {
    public static void main(String[] args) {
        // Crea un objeto de la clase ServicioPelicula para gestionar las películas
        ServicioPelicula servicio = new ServicioPelicula();
        
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle para preguntar al usuario si desea crear una nueva película o salir del programa
        boolean salir = false;
        while (!salir) {
            System.out.print("¿Desea crear una nueva película? (s/n): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("s")) { // Si el usuario responde "s", crea una nueva película
                servicio.crearPelicula();
            } else { // Si el usuario responde cualquier otra cosa, sale del bucle
                salir = true;
            }
        }

        // Muestra todas las películas creadas
        servicio.mostrarTodas();

        // Muestra las películas con duración mayor a una hora
        servicio.mostrarDuracionMayoraUnaHora();

        // Ordena las películas por duración de mayor a menor
        servicio.ordenarPorDuracionDeMayorAMenor();

        // Ordena las películas por duración de menor a mayor
        servicio.ordenarPorDuracionDeMenorAMayor();

        // Ordena las películas por título
        servicio.ordenarPorTitulo();

        // Ordena las películas por director
        servicio.ordenarPorDirector();
    }
}