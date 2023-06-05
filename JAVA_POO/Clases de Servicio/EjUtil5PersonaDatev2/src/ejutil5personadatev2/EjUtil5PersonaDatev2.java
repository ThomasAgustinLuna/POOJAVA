/*
 
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado,
get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package ejutil5personadatev2;
import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaServicio;

public class EjUtil5PersonaDatev2 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        

      PersonaServicio ps=new PersonaServicio();
      Persona p1=ps.crearPersona();
      ps.calcularEdad(p1);
        System.out.println("por favor ingrese la edad a comparar con la persona");
        System.out.println("Es la persona menor a la edad ingresada?: "+ps.menorQue(p1, leer.nextInt()));
        System.out.println("Los datos de la persona son...");
        ps.mostrarPersona(p1);
        
    }
    
}
