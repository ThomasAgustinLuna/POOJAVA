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
package ejcolec3alumnogrupo;

import entities.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import services.StudentService;

/**
 *
 * @author Tomas
 */
public class EjColec3AlumnoGrupo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        StudentService ss=new StudentService();
        ArrayList <Student> students=new ArrayList();
        ss.createStudent(students);
        System.out.println("");
        System.out.println(students);
        System.out.println("");
        System.out.println("Por favor ingrese el nombre del alumno al que desea calcular el promedio");
        String ans=read.next();
        Iterator <Student> it=students.iterator();
        
        while (it.hasNext()) {
            Student aux = it.next();
            if (aux.getName().equalsIgnoreCase(ans)) {
                System.out.println("EL promedio final del alumno seleccionado es de: "+ss.finalGrade(aux));
                break;
            }
            
        }
        
        
        
        
    }
    
}
