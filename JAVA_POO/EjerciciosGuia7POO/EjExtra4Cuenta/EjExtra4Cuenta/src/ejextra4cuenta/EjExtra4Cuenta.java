/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.

 */
package ejextra4cuenta;

import entidades.Cuenta;
import java.util.Scanner;


public class EjExtra4Cuenta {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta c1=new Cuenta();
        System.out.println("Por favor ingrese su nombre");
        c1.setTitular(leer.nextLine());
        c1.retirar_dinero();
        

    }
    
}
