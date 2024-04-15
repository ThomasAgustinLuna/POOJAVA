/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ej1y2colecrazas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Tomas
 */
public class Ej1y2ColecRazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        

        ArrayList <String> razas=new ArrayList();
        String resp;
        //Se pide la raza, y se pregunta si se desea seguir ingresando, de no ser asi se abandona el bucle  y se muestra la lista de razas
        do {
            System.out.println("Por favor ingrese una raza de perro");
            razas.add(leer.next());
            System.out.println("Desea agregar otra raza? S/N");
            resp=leer.next();
        } while (!resp.equalsIgnoreCase("n"));
        
        razas.forEach((raza) -> {System.out.println(raza);});
        
        Iterator <String> it = razas.iterator();
        System.out.println("Por favor ingrese una raza a eliminar");
        String resp2=leer.next();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(resp2)) {
                it.remove();
                break;
            }
            if (it.hasNext()==false&&!aux.equalsIgnoreCase(resp2)) {
                System.out.println("La raza ingresada no se encontro en la lista");
            }
        }
        
        Collections.sort(razas,Comparadores.ordenarPorNombreDesc);
        for (String raza : razas) {
            System.out.println(raza);
        }
        
        
    }
    
}
