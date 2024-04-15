//Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase V
//edificio tendrá como métodos:
//• Método calcularSuperficie(): calcula la superficie del edificio. V
//• Método calcularVolumen(): calcula el volumen del edifico. V
//Estos métodos serán abstractos y los implementarán las siguientes clases: V
//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre. V
//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
//
//16
//Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.
package herenciaejercicio6;

import entities.Edificio;
import java.util.ArrayList;
import services.todosLosServicios;

public class HerenciaEjercicio6 {

    public static void main(String[] args) {
        todosLosServicios tds = new todosLosServicios();
        ArrayList<Edificio> edis = new ArrayList();

        edis.add(tds.crearEdiOfi());
        edis.add(tds.crearPoli());
        edis.add(tds.crearEdiOfi());
        edis.add(tds.crearPoli());

        for (Edificio edi : edis) {
            System.out.println("La superficie de este edificio es de: " + edi.calcularSuperficie());
            System.out.println("El volumen de este edificio es de: " + edi.calcularVolumen());
            System.out.println(edi.getClass());
           
        }
    }
}
