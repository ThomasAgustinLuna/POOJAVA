
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
public class Ejemplo1Guia4 {

    /**
     * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer número
     * múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino informe que no lo son.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int pepito = leer.nextInt();
        int pepito1 = leer.nextInt();
        
        EsMultiplo(pepito, pepito1);
    }
    
    public static void EsMultiplo(int n1, int n2){
     
        if (n1 % n2 == 0) {
            System.out.println("Es multiplo");
           
        }
        else
        {
            System.out.println("No son multiplos");
        }
    }
}
