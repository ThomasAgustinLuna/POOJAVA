/*
 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package entities;

/**
 *
 * @author Tomas
 */
public class Animal {
    protected String name;
    protected String food;
    protected Integer date;
    protected String breed;

    public Animal() {
    }

    public Animal(String name, String food, Integer date, String breed) {
        this.name = name;
        this.food = food;
        this.date = date;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public void feedIt(){
        System.out.println("Este animal se alimenta de: "+food);
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", food=" + food + ", date=" + date + ", breed=" + breed + '}';
    }
    
}
