package entities;

import java.util.ArrayList;

public class Alumno {
    // Variables de instancia
    private final String nombre; // Nombre del alumno
    private final ArrayList<Integer> notas; // Lista de notas del alumno

    // Constructor
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre; // Inicializa el nombre del alumno
        this.notas = notas; // Inicializa la lista de notas del alumno
    }

    // Getter para el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Getter para la lista de notas del alumno
    public ArrayList<Integer> getNotas() {
        return notas;
    }

    // Método para calcular la nota final del alumno
    public double notaFinal() {
        int suma = 0; // Inicializa la variable de la suma de notas a cero
        suma = notas.stream().map((nota) -> nota).reduce(suma, Integer::sum); // Usa un flujo para sumar todas las notas del alumno
        double promedio = (double) suma / notas.size(); // Calcula el promedio de las notas
        return promedio; // Devuelve la nota final del alumno
    }
}