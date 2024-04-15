/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ej4coleccine;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import servicios.PeliculaServicio;
import utilidades.Comparadores;

/**
 *
 * @author Tomas
 */
public class Ej4ColecCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PeliculaServicio ps= new PeliculaServicio();
        ArrayList <Pelicula> pelis=new ArrayList();
        ps.crearPelicula(pelis);
        System.out.println("La peliculas son...");
        System.out.println(pelis);
        System.out.println("");
        
        ps.mostrarPorDuracion(pelis);
        
        System.out.println("Se mostrara la lista ordenada por duración mayor");
        Collections.sort(pelis,Comparadores.ordenarPorDuraciónMayor);
        System.out.println(pelis);
        System.out.println("");
        System.out.println("se mostrara la lista ordenada por duracion menor");
        Collections.sort(pelis,Comparadores.ordenarPorDuraciónMenor);
         System.out.println(pelis);
        System.out.println("");
        System.out.println("Se mostrara la lista ordenada alfabeticamente por titulo");
        Collections.sort(pelis,Comparadores.ordenarAlfabeticamenteTitulo);
         System.out.println(pelis);
        System.out.println("");
        System.out.println("Se mostrara la lista ordenada alfabeticamente por director");
        Collections.sort(pelis,Comparadores.ordenarAlfabeticamenteDirector);
         System.out.println(pelis);
        
    }
    
}
