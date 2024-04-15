
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 * Crear un programa que dado un número determine si es par o impar.
 */
public class Ej1Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
    
        
        System.out.println("Ingrese un número y se dirá si es par o impar");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        if(num%2==0){
            System.out.println("El número :" + num + " es par");
        }
        else
        {
            System.out.println("El número es impar");
        }
        
    }
    
}
