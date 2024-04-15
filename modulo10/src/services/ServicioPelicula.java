package services;
import entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioPelicula {
    // Declaración de un ArrayList para almacenar objetos de la clase Pelicula
    private final ArrayList<Pelicula> listaPeliculas;

    // Constructor de la clase que inicializa el ArrayList
    public ServicioPelicula() {
        listaPeliculas = new ArrayList<>();
    }

    // Método para crear un nuevo objeto de la clase Pelicula y añadirlo al ArrayList
    public void crearPelicula() {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que introduzca el título, el director y la duración de la película
        System.out.print("Introduce el título de la película: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce el director de la película: ");
        String director = scanner.nextLine();

        System.out.print("Introduce la duración de la película (en horas): ");
        double duracion = scanner.nextDouble();

        // Crea un objeto de la clase Pelicula con los datos introducidos y lo añade al ArrayList
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        listaPeliculas.add(pelicula);
    }

    // Método para mostrar todos los objetos de la clase Pelicula en el ArrayList
    public void mostrarTodas() {
        System.out.println("Todas las películas:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    // Método para mostrar todos los objetos de la clase Pelicula en el ArrayList con una duración mayor a una hora
    public void mostrarDuracionMayoraUnaHora() {
        System.out.println("Películas con duración mayor a una hora:");
        listaPeliculas.stream().filter((pelicula) -> (pelicula.getDuracion() > 1)).forEachOrdered((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    // Método para ordenar los objetos de la clase Pelicula en el ArrayList por duración de mayor a menor
    public void ordenarPorDuracionDeMayorAMenor() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> Double.compare(p2.getDuracion(), p1.getDuracion()));

        System.out.println("Películas ordenadas por duración de mayor a menor:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    // Método para ordenar los objetos de la clase Pelicula en el ArrayList por duración de menor a mayor
    public void ordenarPorDuracionDeMenorAMayor() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> Double.compare(p1.getDuracion(), p2.getDuracion()));

        System.out.println("Películas ordenadas por duración de menor a mayor:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    // Método para ordenar los objetos de la clase Pelicula en el ArrayList por título
    public void ordenarPorTitulo() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo()));

        System.out.println("Películas ordenadas por título:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }

    // Método para ordenar los objetos de la clase Pelicula en el ArrayList por director
    public void ordenarPorDirector() {
        Collections.sort(listaPeliculas, (Pelicula p1, Pelicula p2) -> p1.getDirector().compareToIgnoreCase(p2.getDirector()));

        System.out.println("Películas ordenadas por director:");
        listaPeliculas.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
    }
}