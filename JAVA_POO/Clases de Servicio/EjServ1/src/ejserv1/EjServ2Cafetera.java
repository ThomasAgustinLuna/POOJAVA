/*
 Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir la 
taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará 
al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package ejserv1;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

public class EjServ2Cafetera {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera caf1 = cs.crearCafetera();
        String resp;
        int opcion;
        do {
            System.out.println("----Bienvenido----");
            System.out.println("Que desea hacer?");
            System.out.println("1-Llenar Cafetera");
            System.out.println("2-Servir Taza");
            System.out.println("3-Vaciar Cafetera");
            System.out.println("4-Agregar Cafe");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cs.llenarCafetera(caf1);
                    break;
                case 2:
                    cs.servirTaza(caf1);
                    break;
                case 3:
                    cs.vaciarCafetera(caf1);
                    break;
                case 4:
                    cs.agregarCafe(caf1);
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
                    break;
            }
            System.out.println("Desea salir? S/N");
            resp=leer.next();
        } while (!resp.equalsIgnoreCase("s"));
        
    }
    
}
