/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.

 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Cuenta {

    private long saldo;
    private String titular;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta() {
        saldo = 10000000;
    }

    public Cuenta(long saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;

    }

    public long getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_dinero() {
        long monto;
        String resp;
        System.out.println("--------------------------------");
        System.out.println("Bienvenido "+titular);
        System.out.println("Su salgo actual es de: " + saldo);
        System.out.println("--------------------------------");
        do {
            do {
                System.out.println("Por favor ingrese el monto a extraer");
                monto = leer.nextLong();
                if (monto > saldo) {
                    System.out.println("el numero ingresado excede el limite en su cuenta");
                }
            } while (monto > saldo);

            saldo -= monto;
            System.out.println("Su saldo actual es de: " + saldo);
            System.out.println("Desea Salir? s/n");
            resp = leer.next();

        } while (!resp.equalsIgnoreCase("s"));
        System.out.println("Gracias por utilizar nuestros servicios");

    }
}
