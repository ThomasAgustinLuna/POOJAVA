/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package heren_animal;

import entities.Animal;
import entities.Cat;
import entities.Dog;
import entities.Horse;

/**
 *
 * @author Tomas
 */
public class Heren_Animal {

  
    public static void main(String[] args) {
        Animal perro1=new Dog("Stich","Carne",15,"Doberman");
        perro1.feedIt();
        Animal perro2=new Dog("Teddy","Croquetas",10,"Chihuahua");
        perro2.feedIt();
        Animal gato1=new Cat("Pelusa","Galletas",15,"Siamés");
        gato1.feedIt();
        Animal caballo1=new Horse("Spark","Pasto",25,"Azabache");
        caballo1.feedIt();
    }
    
}
