/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.

 */

package ej1libro;

import Entidades.Libro;
import java.util.Scanner;


public class Ej1Libro {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Por favor ingrese los datos del libro(titulo,autor,numero de pag, numero ISBN ");
        Libro l1=new Libro(leer.next(),leer.next(),leer.nextInt(),leer.nextInt());
        
        System.out.println(l1.toString());
        
    }
    
    
}
