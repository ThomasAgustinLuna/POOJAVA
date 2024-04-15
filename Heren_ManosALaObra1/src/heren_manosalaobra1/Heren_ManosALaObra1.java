/*
 Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.
 */
package heren_manosalaobra1;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Heren_ManosALaObra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Animal> animals=new ArrayList <>();
        Animal a=new Animal();
        Animal b=new Dog();
        Animal c=new Cat();
        animals.add(a);
        animals.add(b);
        animals.add(c);
        for (Animal animal : animals) {
            animal.MakeNoise();
        }
    }
    
}
