/*
 Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo,
puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona per = new Persona();
        System.out.println("Por favor ingrese nombre de la persona");
        per.setNombre(leer.next());
        System.out.println("Ahora, por favor ingrese la edad de la persona");
        per.setEdad(leer.nextInt());
        String resp;
        do {
            System.out.println("Por favor ingrese el sexo de la persona (M)Mujer,(H)Hombre,(O)Otro");
            resp = leer.next();
            if (!resp.equalsIgnoreCase("h") && !resp.equalsIgnoreCase("m") && !resp.equalsIgnoreCase("o")) {
                System.out.println("La opcion ingresada es incorrecta");
            } else if (resp.equalsIgnoreCase("h")) {
                per.setSexo("H");
            } else if (resp.equalsIgnoreCase("m")) {
                per.setSexo("M");
            } else if (resp.equalsIgnoreCase("o")) {
                per.setSexo("O");
            }
        } while (!resp.equalsIgnoreCase("h") && !resp.equalsIgnoreCase("m") && !resp.equalsIgnoreCase("o"));
        System.out.println("Por favor ingrese el peso de la persona (en kilos)");
        per.setPeso(leer.nextDouble());
        System.out.println("Por ultimo ingrese la altura de la persona(en metros)");
        per.setAlt(leer.nextDouble());

        return per;
    }

    public boolean esMayorDeEdad(Persona per) {
        boolean mayor;

        if (per.getEdad() > 18 || per.getEdad() == 18) {
            mayor = true;
        } else {
            mayor = false;
        }

        return mayor;
    }

    public int calcularIMC(Persona per) {
        int iMC;
        double calc;
        calc = per.getPeso() / (Math.pow(per.getAlt(), 2));
        if (calc < 20) {
            iMC = -1;
        } else if (calc >= 20 && calc <= 25) {
            iMC = 0;
        } else {
            iMC = 1;
        }

        return iMC;
    }

}
