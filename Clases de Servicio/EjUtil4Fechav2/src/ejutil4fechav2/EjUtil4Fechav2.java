/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).

 */
package ejutil4fechav2;

import java.util.Date;
import servicios.FechaServicios;


public class EjUtil4Fechav2 {

  
    public static void main(String[] args) {
       FechaServicios fs=new FechaServicios();
       Date nac=fs.fechaNacimiento();
       Date actual=fs.fechaActual();
       fs.diferencia(nac, actual);
       
       
       
    }
    
}
