/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package entities;


public class Player {
    private String name;
    private String lastName;
    private Integer position;
    private Integer number;

    public Player() {
    }

    public Player(String name, String lastName, Integer position, Integer number) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", lastName=" + lastName + ", position=" + position + ", number=" + number + '}';
    }

   

    
    
    
    
}
