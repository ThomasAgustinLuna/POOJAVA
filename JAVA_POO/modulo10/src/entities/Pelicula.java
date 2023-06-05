package entities;

public class Pelicula {
    private final String titulo; // Título de la película
    private final String director; // Director de la película
    private final double duracion; // Duración de la película

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo; // Inicializa el título de la película
        this.director = director; // Inicializa el director de la película
        this.duracion = duracion; // Inicializa la duración de la película
    }

    // Getter para el título de la película
    public String getTitulo() {
        return titulo;
    }

    // Getter para el director de la película
    public String getDirector() {
        return director;
    }

    // Getter para la duración de la película
    public double getDuracion() {
        return duracion;
    }

    // Método para convertir un objeto de tipo Pelicula a una cadena de caracteres
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}