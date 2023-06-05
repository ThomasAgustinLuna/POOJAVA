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
package services;

import entities.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class StudentService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    

    public void createStudent(ArrayList<Student> stu){
        String ans;
        do {
            Student s1=new Student();
            ArrayList <Integer> aux=new ArrayList();
            
            System.out.println("Por favor ingrese el nombre del estudiante");
            s1.setName(read.next());
            System.out.println("Por favor ingrese la nota 1");
            aux.add(read.nextInt());
            System.out.println("Por favor ingrese la nota 2");
            aux.add(read.nextInt());
            System.out.println("Por favor ingrese la nota 3");
            aux.add(read.nextInt());
            s1.setGrades(aux);
            stu.add(s1);
            System.out.println("Desea seguir ingresando alumnos? s/n");
            ans=read.next();
            
            
        } while (!ans.equalsIgnoreCase("n"));
        
        
    }
    public double finalGrade(Student stu){
        int addGrades=0;
        Iterator <Integer> it=stu.getGrades().iterator();
        
        while (it.hasNext()) {
            Integer aux = it.next();
            addGrades+=aux;
            
        }
        
        
        
        double fGrade=addGrades/3;
        return fGrade;
    }
    
    
}
