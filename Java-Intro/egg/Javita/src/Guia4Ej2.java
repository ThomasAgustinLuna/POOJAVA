
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e 
 * indique si son mayores o menores de edad. Después de cada persona, 
 * el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 *
 */

/**
 *
 * @author play_
 */
public class Guia4Ej2 {

    /**
     * @param args the command line arguments
     */
    
    private static void mayorOno(){
        Scanner leer = new Scanner (System.in);
        String seguir, nombre;
        int edad;
        
        do{
        System.out.println("Ingrese nombre y edad");
        nombre = leer.nextLine();
        edad = leer.nextInt();
        leer.nextLine();
        
        if(edad >= 18){
            System.out.println(nombre + " es mayor!");
        }
        else
        {
            System.out.println(nombre + " es menor!");
        }
        
            System.out.println("Seguimos? Si/No");
            seguir = leer.nextLine();
            seguir = seguir.toLowerCase();
            
        } while(!seguir.equals("no"));
        
    }
    
    public static void main(String[] args) {
        mayorOno();
    }
    
}
