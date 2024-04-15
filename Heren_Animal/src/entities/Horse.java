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
public final class Horse extends Animal {

    public Horse() {
    }

    public Horse(String name, String food, Integer date, String breed) {
        super(name, food, date, breed);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getFood() {
        return food;
    }

    @Override
    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public Integer getDate() {
        return date;
    }

    @Override
    public void setDate(Integer date) {
        this.date = date;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void feedIt() {
        System.out.println("Este es un Caballo");
        System.out.println("Este animal se alimenta de: " + food);
    }
}
