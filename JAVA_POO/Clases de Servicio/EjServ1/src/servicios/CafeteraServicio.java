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
package servicios;

import entidades.Cafetera;
import java.util.Scanner;


public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        Cafetera caf= new Cafetera();
        
        caf.setCapacidadMaxima(2000);
        caf.setCantidadActual(0);
        
      return caf;  
    }
    
    public void llenarCafetera(Cafetera caf){
        caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera con exito");
    }
    
    public void servirTaza(Cafetera caf){
        System.out.println("Por favor ingrese el tamaño en Litros de la taza a servir");
        double tamaño=leer.nextDouble();
        double resto;
        System.out.println("Sirviendo Cafe...");
        if (tamaño>caf.getCantidadActual()) {
            
            resto=tamaño-caf.getCantidadActual();
            caf.setCantidadActual(0);
            System.out.println("No se lleno la taza, quedaron sin llenar: "+resto+"Lts de la taza");
            
        }else{
            caf.setCantidadActual(caf.getCantidadActual()-tamaño);
            System.out.println("Disfrute su Cafe :)");
        }
        
    }
    
    public void vaciarCafetera(Cafetera caf){
        caf.setCantidadActual(0);
        System.out.println("Se ha vaciado la cafetera, recuerde limpiar con precaución");
    }
    public void agregarCafe(Cafetera caf){
        System.out.println("Cuanto Cafe desea agregar?(Litros)");
        double cafe=leer.nextDouble();
        caf.setCantidadActual(caf.getCantidadActual()+cafe);
        System.out.println("Se han agregado "+cafe+" Lts de cafe con exito");
    }

}
