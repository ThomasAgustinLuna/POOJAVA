/*
 Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package entities;

/**
 *
 * @author Tomas
 */
public class Dni {
    private  String serie;
    private  Integer num;

    public Dni() {
    }

    public Dni(String serie, Integer num) {
        this.serie = serie;
        this.num = num;
    }

    public String getSerie() {
        return serie;
    }

    public Integer getNum() {
        return num;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    
    
}
