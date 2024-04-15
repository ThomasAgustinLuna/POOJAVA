
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
public class Guia3Ej5 {

    /**
     * @param args the command line arguments.
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a 
     * continuación solicite números al usuario hasta que 
     * la suma de los números introducidos supere el límite inicial.
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int limite, aux, acumulador; 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un limite");
        limite = leer.nextInt();
        acumulador = 0;
        
        while(acumulador < limite){
            System.out.println("Ingrese un número");
            aux = leer.nextInt();
            acumulador += aux;
        }
        System.out.println("El número que superó el limite fue " + acumulador);
    }
    
}
