/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, 
crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

 */
package ejextra5empleado;

import entidades.Empleado;
import java.util.Scanner;


public class EjExtra5Empleado {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese nombre, edad y salario del empleado");
        Empleado e1= new Empleado(leer.nextLine(),leer.nextInt(),leer.nextDouble());
        e1.calcular_aumento(e1.getSalario(), e1.getEdad());
        System.out.println(e1.toString());
    }
    
}
