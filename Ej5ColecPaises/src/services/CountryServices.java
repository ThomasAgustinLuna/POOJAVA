/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package services;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tomas
 */
public class CountryServices {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    

    public void CountryCreator(Set <String> Paises){
        String ans;
        do {
            System.out.println("Por favor ingrese un pais");
            Paises.add(read.next());
            System.out.println("Desea seguir ingresando paises? s/n");
            ans=read.next();
        } while (!ans.equalsIgnoreCase("n"));
        
        
    }
    
    public void ShowCountrys(Set <String> Paises){
        System.out.println(Paises);
    }
    
    public void CountryEliminator(Set <String> Paises){
        System.out.println("Por favor ingrese el pais a eliminar");
        String ans=read.next();
        Iterator <String> it=Paises.iterator();
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(ans)) {
                System.out.println("Se removera el pais...");
                it.remove();
                System.out.println("Los paises que quedan son...");
                System.out.println(Paises);
                break;
            }
            if (it.hasNext()==false&&!aux.equalsIgnoreCase(ans)) {
                System.out.println("El pais ingresado no se encontro en el conjunto");
            }
            
        }
        
    }
    
}
