
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 */
public class Guia4Ej3 {

    /**
     * Crea una aplicación que a través de una función nos convierta una cantidad 
     * de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros
     * la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
     */
    
    public static void conversion(double moneda){
        Scanner leer = new Scanner (System.in);
        System.out.println("A qué desea cambiar?, LIBRAS, PESOS o YENES");
        String decision = leer.next();
        decision = decision.toLowerCase();
                
        switch(decision){
            case "libras":
                moneda = moneda * 0.86;
                break;
                
            case "pesos":
                moneda = moneda *1.268611;
                break;
            case "yenes":
                moneda = moneda * 129.852;
                break;
        
        }
        System.out.println("La conversión se realizó exitosamente a " + decision + " y el total es: " + moneda);
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero");
        
        double dinero = leer.nextLong();
        
        conversion(dinero);
        
        
    }
    
}
