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
package PrincipalPersona;

import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Arrays;
import java.util.Date;

public class EjServ3Persona {

    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona[] pers = new Persona[4];
        int[] iMC = new int[4];
        boolean[] mayor = new boolean[4];
        double sobrePeso = 0;
        double pesoIdeal = 0;
        double bajoPeso = 0;
        int esMenor = 0;
        int esMayor = 0;
        /*---------------------------------------------*/ 
//       Integer s=new Integer("123");
//       Integer m=new Integer("321");
       Date fecha=new Date();
       Date fec=new Date(123,01,24);
        
        System.out.println(fec);
        
        /*---------------------------------------------*/
        for (int i = 0; i < 4; i++) {
            pers[i] = ps.crearPersona();
            iMC[i] = ps.calcularIMC(pers[i]);
            switch (iMC[i]) {
                case -1:
                    System.out.println("La persona esta por debajo del peso");
                    bajoPeso++;
                    break;
                case 0:
                    System.out.println("La persona esta en su peso ideal");
                    pesoIdeal++;
                    break;
                default:
                    System.out.println("La persona tiene sobrepeso");
                    sobrePeso++;
                    break;
            }
            
            mayor[i] = ps.esMayorDeEdad(pers[i]);
            if (mayor[i]) {
                esMayor++;
            } else {
                esMenor++;
            }

        }
       
        
        
        System.out.println("El porcentaje de personas por de bajo del peso ideal es del: " + ((bajoPeso / 4) * 100)+" %");
        System.out.println("El porcentaje de personas con peso ideal es del: " + ((pesoIdeal / 4) * 100)+" %");
        System.out.println("El porcentaje de personas con sobrepeso es del: " + ((sobrePeso / 4) * 100)+" %");
        System.out.println("La cantidade de personas mayores de edad es de: "+esMayor);
        System.out.println("La cantidade de personas menores de edad es de: "+esMenor);
    }

    
    
    /*public static void probando(){
        
    }*/
}
