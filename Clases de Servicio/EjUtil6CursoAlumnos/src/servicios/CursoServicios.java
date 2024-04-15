/*

Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. Nosotros nos encargaremos 
de almacenar esta información en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos 
atributos para llenar el objeto Curso. En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. Para ello, se deben multiplicar 
la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

public class CursoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int total;

    public String[] cargarAlumnos() {
        System.out.println("cuantos alumnos del grupo de 5 asistieron en total?");
        this.total = leer.nextInt();
        String[] alum = new String[total];
        for (int i = 0; i < alum.length; i++) {
            System.out.println("Por favor ingrese el nombre del alumno " + (i + 1));
            alum[i] = leer.next();

        }

        return alum;
    }

    public Curso crearCurso() {
        Curso c1 = new Curso();
        System.out.println("Por favor ingrese el nombre del curso");
        c1.setNombreCurso(leer.next());
        System.out.println("Por favor ingrese la cantidad de horas diarias");
        c1.setCantHorasDia(leer.nextInt());
        System.out.println("Por favor ingrese la cantidad de dias por semana del curso");
        c1.setCantDiasSem(leer.nextInt());
        String turno;
        do {
            System.out.println("Ingrese el turno M o T");
            turno = leer.next();

        } while (!turno.equalsIgnoreCase("M") && !turno.equalsIgnoreCase("T"));
        c1.setTurno(turno);
        System.out.println("Por favor ingrese el precio por hora");
        c1.setPrecioH(leer.nextInt());
        c1.setAlumnos(this.cargarAlumnos());

        return c1;
    }

    public void calcularGanancia(Curso c1) {

        double ganancia = c1.getCantHorasDia() * c1.getPrecioH() * this.total * c1.getCantDiasSem();

        System.out.println("La ganancia total del curso es de: " + ganancia);

    }

}
