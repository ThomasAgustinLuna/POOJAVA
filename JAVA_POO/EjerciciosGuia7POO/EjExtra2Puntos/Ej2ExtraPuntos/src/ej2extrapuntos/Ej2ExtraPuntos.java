/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto 
puntos usando un método crearPuntos() que le pide al usuario los dos números y los 
ingresa en los atributos del objeto. Después, a través de otro método calcular y 
devolver la distancia que existe entre los dos puntos que existen en la clase Puntos. 


 */
package ej2extrapuntos;

import Entidades.Puntos;
import java.util.Scanner;


public class Ej2ExtraPuntos {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese las cordenadas (x1,y1) y seguido las de (x2,y2): ");
        Puntos cP=new Puntos(leer.nextInt(),leer.nextInt(),leer.nextInt(),leer.nextInt());
        cP.distancia(cP.getX1(), cP.getY1(), cP.getX2(), cP.getY2());

        System.out.println(cP.toString());
    }
    
}
