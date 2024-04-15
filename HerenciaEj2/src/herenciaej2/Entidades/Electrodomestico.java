/*
 * * Programa realizado por Pablo Casalino.
 * * Todos los derechos reservados.
 * *
 */
package herenciaej2.Entidades;

import java.util.Scanner;

/**
 * precio, color, consumo energético (letras entre A y F) y peso. Los
 * constructores que se deben implementar son los siguientes: • Un constructor
 * vacío. • Un constructor con todos los atributos pasados por parámetro. Los
 * métodos a implementar son: • Métodos getters y setters de todos los
 * atributos. • Método comprobarConsumoEnergetico(char letra): comprueba que la
 * letra es correcta, sino es correcta usara la letra F por defecto. Este método
 * se debe invocar al crear el objeto y no será visible. • Método
 * comprobarColor(String color): comprueba que el color es correcto, y si no lo
 * es, usa el color blanco por defecto. Los colores disponibles para los
 * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
 * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
 * el objeto y no será visible.
 *
 * @author pablo
 */
public class Electrodomestico {

    private Scanner sc = new Scanner(System.in);
    protected double precio;
    protected String Color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {

    }

    public Electrodomestico(double precio, String Color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.Color = Color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

//Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
//sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
//objeto y no será visible.
    private String comprobarConsumoEnergetico(String letra) {

        switch (letra.toLowerCase()) {

            case "a":
                return "a";

            case "b":
                return "b";

            case "c":
                return "c";
            case "d":
                return "d";
            case "e":
                return "e";
            default:
                return "f";

        }
    }

//  Método comprobarColor(String color): comprueba que el color es correcto, y si no lo
// * es, usa el color blanco por defecto. Los colores disponibles para los
// * electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el
// * nombre está en mayúsculas o en minúsculas. Este método se invocará al crear
// * el objeto y no será visible.
    private String comprobarColor(String color) {

        switch (color.toLowerCase()) {

            case "negro":
                return "negro";

            case "rojo":
                return "rojo";

            case "azul":
                return "azul";
            case "gris":
                return "gris";

            default:
                return "blanco";

        }

    }

//Metodo crearElectrodomestico(): le pide la información al usuario y llena el
//electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
//precio se le da un valor base de $1000.
    public Electrodomestico crearElectrodomestico() {

        Electrodomestico elect = new Electrodomestico();

        System.out.println("Ingrese el precio del electrodomestico");
        elect.setPrecio(sc.nextDouble());

        System.out.println("Ingrese el color del electrodomestico");
        elect.setColor(sc.next());

        System.out.println("Ingrese el consumo electrico del electrodomestico");
        elect.setConsumoEnergetico(sc.next().charAt(consumoEnergetico));

        System.out.println("Ingrese el peso del electrodomestic");
        elect.setPeso(sc.nextDouble());

        return elect;
    }

}
