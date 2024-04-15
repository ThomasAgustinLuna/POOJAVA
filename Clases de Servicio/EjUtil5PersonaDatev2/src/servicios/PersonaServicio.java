/*

Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Date fechaNacimiento() {
        Date fecha = new Date();
        System.out.println("Por favor ingrese su dia de nacimiento");
        fecha.setDate(leer.nextInt());
        System.out.println("Por favor ingrese su mes de nacimiento");
        fecha.setMonth(leer.nextInt() - 1);
        System.out.println("Por favor ingrese su año de nacimiento");
        fecha.setYear(leer.nextInt() - 1900);
        return fecha;
    }

    public Persona crearPersona() {
        Persona p1 = new Persona();
        System.out.println("Por favor ingrese el nombre de la persona");
        p1.setNombre(leer.next());
        p1.setFecha(this.fechaNacimiento());
        return p1;

    }

    public void calcularEdad(Persona p1) {
        Date actual = new Date();

        System.out.println("La edad de la persona es de: " + (actual.getYear() - p1.getFecha().getYear()));

    }

    public boolean menorQue(Persona p1, int edad) {
        Date actual = new Date();
        int ed = actual.getYear() - p1.getFecha().getYear();

        return ed < edad;
    }

    public void mostrarPersona(Persona p1) {

        System.out.println(p1.toString());
    }
    
    
}
