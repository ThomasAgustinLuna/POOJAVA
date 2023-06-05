/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package servicios;

import java.util.Date;
import java.util.Scanner;


public class DateServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public Date fechaNacimiento(){
        Date fecha=new Date();
        System.out.println("Por favor ingrese su dia de nacimiento");
        fecha.setDate(leer.nextInt());
        System.out.println("Por favor ingrese su mes de nacimiento");
        fecha.setMonth(leer.nextInt()-1);
        System.out.println("Por favor ingrese su año de nacimiento");
        fecha.setYear(leer.nextInt()-1900);
        
        return fecha;
    }
    
    public Date fechaActual(){
        Date actual=new Date();
        return actual;
    }
    
    public int diferencia(Date fecha,Date actual){
        int edad=actual.getYear()-fecha.getYear();
      return edad;
    }
}
