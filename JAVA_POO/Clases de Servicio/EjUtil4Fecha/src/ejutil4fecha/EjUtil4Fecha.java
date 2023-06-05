/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
 */
package ejutil4fecha;

import java.util.Date;
import servicios.DateServicio;


public class EjUtil4Fecha {

    
    public static void main(String[] args) {
        DateServicio ds=new DateServicio();
        Date edad=ds.fechaNacimiento();
        Date actual=ds.fechaActual();
        System.out.println("La fecha de nacimiento igresada es: ");
        System.out.println(edad.toString());
        System.out.println("La fecha actual es: ");
        System.out.println(actual.toString());
        System.out.println("La edad del usuario es de: ");
        System.out.println(ds.diferencia(edad, actual));
        
    }
    
}
