/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para crear el 
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método 
para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ej4rectangulos;

import entidades.Rectangulo;
import java.util.Scanner;


public class Ej4Rectangulos {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        

       Rectangulo r1 = new Rectangulo(leer.nextInt(),leer.nextInt());
       r1.perim(r1.getBase(), r1.getAltura());
       r1.superfi(r1.getBase(), r1.getAltura());
       r1.mostrar(r1.getBase(), r1.getAltura());
        
    }
    
}
