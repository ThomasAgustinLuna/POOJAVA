/*
Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el
examen final. La escuela nos ha pedido que calculemos el promedio de notas
final de todos sus alumnos y saber qué alumnos han recibido una nota por
encima de ese promedio.
Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final).
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package servicios;

import entidades.Estudiante;
import java.util.Scanner;


public class EstudianteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    
    public Estudiante cargarEstudiante(){
        
        Estudiante alumnos=new Estudiante();
        System.out.println("Por favor ingrese el nombre del alumno");
        alumnos.setNombre(leer.next());
        System.out.println("Por favor ingrese la nota del alumno");
        alumnos.setNota(leer.nextDouble());
        
        return alumnos;
    }
    
    public double mostrarPromedios(Estudiante []alumnos){
        double sumaNotas=0;
        double promedio;
        for (int i = 0; i < alumnos.length; i++) {
            sumaNotas+=alumnos[i].getNota();
            
        }
        promedio=sumaNotas/alumnos.length;
        
        return promedio;
    }
    
    public void mayorPromedio(Estudiante []alumnos){
        int cont=0;
        double promedio=this.mostrarPromedios(alumnos);
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota()>promedio) {
                cont++;
            }
        }
        String alumMay[]=new String[cont];
        int cont2=0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota()>promedio) {
                alumMay[cont2]=alumnos[i].getNombre();
                cont2++;
            }
        }
        
        System.out.println("Los estudiantes que obtubieron una nota mayor al promedio fueron: ");
        for (String alumMay1 : alumMay) {
            System.out.println(alumMay1);
        }
        
    }
}
