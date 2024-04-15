/*
 Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. Luego, en RaicesServicio las operaciones 
que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con 
los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package servicios;

import entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices CrearRaices() {
        Raices raiz = new Raices();
        System.out.println("Por favor ingrese el valor de A");
        raiz.setA(leer.nextInt());
        System.out.println("Por favor ingrese el valor de B");
        raiz.setB(leer.nextInt());
        System.out.println("Por favor ingrese el valor de C");
        raiz.setC(leer.nextInt());

        return raiz;
    }

    public void getDiscriminante(Raices r) {

        r.setDiscri(Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC()));

    }

    public boolean tieneRaices(Raices r) {

        if (r.getDiscri() > 0) {
            return true;
        }

        return false;
    }

    public boolean tieneRaiz(Raices r) {

        if (r.getDiscri() == 0) {
            return true;
        }

        return false;
    }
    
    // (-b±      √((b^2)-(4*a*c)))/(2*a)

    public void obtenerRaices(Raices r) {

        if (this.tieneRaices(r)) {
           System.out.println("Solucion x1= " + (-(r.getB()) + Math.sqrt((Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC() ))) / (2 * r.getA()   )               );
           System.out.println("Solucion x2= " + (-(r.getB()) - Math.sqrt((Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC() ))) / (2 * r.getA()   )               );
        }
        
         
        
    }

    public void obtenerRaiz(Raices r) {
        
        if (this.tieneRaiz(r)) {
            System.out.println("Solucion x1= " + (-(r.getB()) - Math.sqrt((Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC() )) / (2 * r.getA()   )               ));
        }
        
    }
    public boolean solucionCompleja(Raices r){
        
        if (r.getDiscri()<0) {
            return true;
        }
        
        return false;
    }

   public void calcular(Raices r){
       if (this.tieneRaices(r)) {
           this.obtenerRaices(r);
       }else if(this.tieneRaiz(r)){
           this.obtenerRaiz(r);
       }else if(this.solucionCompleja(r)){
           System.out.println("Esta ecuación de segundo grado solo tiene una solución compleja o imaginaria");
       }
   }
   
    

}
