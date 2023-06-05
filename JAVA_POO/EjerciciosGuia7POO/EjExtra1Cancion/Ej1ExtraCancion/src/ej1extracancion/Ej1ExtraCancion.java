/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además 
dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba como 
parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

 */
package ej1extracancion;

import Entidades.Cancion;
import java.util.Scanner;


public class Ej1ExtraCancion {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion c1=new Cancion(leer.nextLine(),leer.nextLine());
        
        System.out.println(c1.toString());
        System.out.println("Fin");

    }
    
}
