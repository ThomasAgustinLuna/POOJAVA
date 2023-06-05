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
package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class AlumnoServicio {

    Scanner read = new Scanner(System.in);

    public void crearAlumno(ArrayList<Alumno> al) {
        Alumno n = new Alumno();
        ArrayList<Integer> aux = new ArrayList();

        System.out.println("ingrese el alumno ");
        n.setNombre(read.next());
        System.out.println("ingrese las nota 1 del alumno ");
        aux.add(read.nextInt());
        System.out.println("ingrese las nota 2 del alumno ");
        aux.add(read.nextInt());
        System.out.println("ingrese las nota 3 del alumno ");
        aux.add(read.nextInt());
        n.setNotas(aux);
        al.add(n);

    }

    public void creador(ArrayList<Alumno> al) {
        int res;
        do {

            System.out.println(" desea crear otro alumno 1.si 2.no ");
            res = read.nextInt();
            if (res == 1) {
                crearAlumno(al);
            }
        } while (res != 2);

    }

    public void comprobador(ArrayList<Alumno> al) {
        if (al.size() < 1) {
            crearAlumno(al);
        }
    }
    public double notaFinal(Alumno al){
        int sumanotas=0;
       Iterator <Integer> it = al.getNotas().iterator();
       
       while (it.hasNext()) {
            Integer aux = it.next();
            sumanotas+=aux;
        }
        double notFinal =sumanotas/3;
        
        return notFinal;
    }

}
