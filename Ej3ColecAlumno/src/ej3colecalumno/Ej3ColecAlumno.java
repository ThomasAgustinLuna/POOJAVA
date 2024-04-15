/*
 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ej3colecalumno;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import servicios.AlumnoServicio;

/**
 *
 * @author Tomas
 */
public class Ej3ColecAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        

        AlumnoServicio n = new AlumnoServicio();

        ArrayList<Alumno> Alumnos = new ArrayList();
        n.comprobador(Alumnos);
        n.creador(Alumnos);
        System.out.println("Los alumnos  y las notas son..");
        Alumnos.forEach((e)->{System.out.println(e);});
        Iterator <Alumno> it = Alumnos.iterator();
        System.out.println("Ingrese el nombre del alumno al cual quiere calcular su promedio");
        String resp= leer.next();
        while (it.hasNext()) {
            Alumno aux=new Alumno();
            aux=it.next();
            String aux1=aux.getNombre();
            double aux2=n.notaFinal(aux);
            if (aux1.equalsIgnoreCase(resp)) {
                
                System.out.println("El promedio del alumno elegido es de "+aux2);
                break;
            }
            
        }
        
        
    }

}
