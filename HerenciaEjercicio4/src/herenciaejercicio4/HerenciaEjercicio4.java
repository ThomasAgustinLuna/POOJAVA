/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package herenciaejercicio4;

import entities.Circle;
import entities.Rectangle;
import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class HerenciaEjercicio4 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido");
        System.out.println("Ingrese el radio del circulo");
        Circle c1=new Circle(read.nextDouble());
        System.out.println("Ahora ingrese base y altura de su rectangulo");
        Rectangle r1=new Rectangle(read.nextDouble(),read.nextDouble());
        System.out.println("El area de su circulo es de: "+c1.areaCalculator());
        System.out.println("El perimetro de su circulo es de: "+c1.perimeterCalculator());
        System.out.println("El area de su rectangulo es de: "+r1.areaCalculator());
        System.out.println("El perimetro de su rectangulo es de: "+r1.perimeterCalculator());
        System.out.println("Espero haberlo ayudado.");
        
    }
    
}
