package entities;

import java.util.Objects;

public class Pais implements Comparable<Pais> {
    private final String nombre; // Nombre del país

    public Pais(String nombre) {
        this.nombre = nombre; // Inicializa el nombre del país
    }

    // Getter para el nombre del país
    public String getNombre() {
        return nombre;
    }

    // Método para comparar objetos de tipo Pais
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si los objetos son iguales, devuelve true
        if (o == null || getClass() != o.getClass()) return false; // Si el objeto es nulo o no es una instancia de Pais, devuelve false
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre); // Devuelve true si los nombres de los países son iguales, false de lo contrario
    }

    // Método para calcular el hashcode de un objeto de tipo Pais
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    // Método para convertir un objeto de tipo Pais a una cadena de caracteres
    @Override
    public String toString() {
        return nombre;
    }

    // Método para comparar dos objetos de tipo Pais
    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareToIgnoreCase(o.nombre); // Compara los nombres de los países ignorando mayúsculas y minúsculas
    }
}