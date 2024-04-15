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
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class PeliculaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula(ArrayList<Pelicula> pelis) {
        String resp;

        do {
            Pelicula p = new Pelicula();

            System.out.println("Por favor ingrese el titulo de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ahora por favor ingrese el director");
            p.setDirector(leer.next());
            System.out.println("Por favor ingrese la duracion en horas");
            p.setDuracion(leer.nextInt());
            pelis.add(p);
            System.out.println("Desea crear otra pelicula?");
            resp = leer.next();
        } while (!resp.equalsIgnoreCase("n"));

    }
    public void mostrarPorDuracion(ArrayList <Pelicula> pelis){
        Iterator <Pelicula> it=pelis.iterator();
        System.out.println("Las peliculas con duración mayor a una hora son..");
        while (it.hasNext()) {
            Pelicula aux=new Pelicula();
            aux=it.next();
            String aux1=aux.getTitulo();
            Integer aux2=aux.getDuracion();
            String aux3=aux.getDirector();
            if (aux.getDuracion()>1) {
                
                System.out.println("Titulo: "+aux1);
                System.out.println("Director: "+aux3);
                System.out.println("Duracion: "+aux2);
                System.out.println("");
            }
            
        }
    }
    

}
