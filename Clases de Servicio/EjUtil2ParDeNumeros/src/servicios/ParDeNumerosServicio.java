/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package servicios;

import entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class ParDeNumerosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ParDeNumeros crearNumeros() {
        ParDeNumeros numeros = new ParDeNumeros();

        return numeros;
    }

    public void MostrarValores(ParDeNumeros p1) {
        System.out.println("Los numeros guardados son:");
        System.out.println(p1.getNum1());
        System.out.println(p1.getNum2());

    }

    public double devolverMayor(ParDeNumeros p1) {
        if (p1.getNum1() > p1.getNum2()) {
            System.out.println("El numero 1 es mayor al numero 2");
            return p1.getNum1();
        } else if (p1.getNum2() > p1.getNum1()) {
            System.out.println("El numero 2 es mayor al numero 1");
            return p1.getNum2();
        } else {
            System.out.println("Los 2 numeros son iguales");
        }
        return p1.getNum1();

    }

    public double calcularPotencia(ParDeNumeros p1) {
        if (this.devolverMayor(p1) == p1.getNum1()) {
            return Math.pow(Math.round(p1.getNum1()), Math.round(p1.getNum2()));

        }
        return Math.pow(Math.round(p1.getNum2()), Math.round(p1.getNum1()));
    }

    public double calcularRaiz(ParDeNumeros p1) {
        if (this.devolverMayor(p1) < p1.getNum1()) {
            return Math.sqrt(Math.abs(p1.getNum2()));

        }
        return Math.sqrt(Math.abs(p1.getNum1()));
    }

}
