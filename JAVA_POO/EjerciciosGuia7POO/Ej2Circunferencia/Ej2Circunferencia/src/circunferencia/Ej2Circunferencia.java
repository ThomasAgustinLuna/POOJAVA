/*
Declarar una clase llamada Ej2Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Ej2Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
package circunferencia;

import Entidades.Circunferencia;
import java.util.Scanner;


public class Ej2Circunferencia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Circunferencia c1=new Circunferencia(leer.nextDouble());
        
        c1.area(c1.getRadio());
        c1.perimetro(c1.getRadio());
        
        System.out.println(c1.toString());

    }
    
}
