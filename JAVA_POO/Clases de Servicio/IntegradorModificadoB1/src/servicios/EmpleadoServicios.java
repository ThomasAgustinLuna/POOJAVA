/*
 Imagina que tienes una lista de empleados en una pequeña empresa, y deseas
calcular su salario promedio y saber cuáles empleados tienen un salario
superior al promedio.
Para hacer esto, debes crear un objeto de tipo Empleado, cuyos atributos serán
el nombre y el salario (que representa el salario mensual del empleado). La
empresa cuenta con solamente 6 empleados, por lo que deberás crear los 6
objetos Empleado con sus respectivos salarios.
Una vez creados los empleados, deberás guardarlos en un arreglo de objetos
tipo Empleado. Utilizando ese arreglo, tendrás que realizar las dos tareas que
te piden:
1. Calcular y mostrar el salario promedio de todos los empleados.
2. Retornar otro arreglo con los nombres de los empleados que tienen un
salario mayor al promedio.
Finalmente, debes mostrar todos los empleados con un salario superior al
promedio.
Recuerda que para crear un vector de objetos, la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];
 */
package servicios;

import entidades.Empleado;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class EmpleadoServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public Empleado crearEmpleado(){
        Empleado e=new Empleado();
        System.out.println("Por favor ingrese el nombre del empleado");
        e.setNombre(leer.next());
        System.out.println("Por favor ingrese el salario del empleado");
        e.setSalario(leer.nextDouble());
        
        return e;
    }
    private double promedio;
    public void calcularSalario(Empleado []e){
        
        double sumaSalario=0;
        
        for (int i = 0; i < e.length; i++) {
            sumaSalario+=e[i].getSalario();
        }
        
        
           
            
        
        this.promedio=sumaSalario/6;
        
        System.out.println("El salario de cada empleado es: "+promedio);
       
    }
    private String []nombAux;
    public void salarioMayor(Empleado[]e){
        
       int cont=0;
        
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalario()>this.promedio) {
                cont++;
            }
        }
         String[]nombres=new String[cont];
         this.nombAux=new String[cont];
        for (int i = 0; i < e.length; i++) {
            if (e[i].getSalario()>this.promedio) {
               nombres[i]=e[i].getNombre();
               this.nombAux[i]=e[i].getNombre();
            }
        }
        
    }
    
    public void mostrarMayorSalario(){
        
        
        System.out.println("Las personas con mayor salario son...");
        for (int i = 0; i < this.nombAux.length; i++) {
            System.out.println(this.nombAux[i]);
        }
    }
    
}
