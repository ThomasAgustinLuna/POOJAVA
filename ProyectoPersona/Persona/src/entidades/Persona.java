
package entidades;

import java.util.Date;




public class Persona {
    
    public String nombre;
    public int dni;
    public Date edad;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        
    }

    public Persona(String nombre, int dni, Date edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    
    
    
    
}
