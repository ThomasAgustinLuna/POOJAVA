
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
public class Guia5Ej2 {

    /**
     * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
     * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
     */
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = (int) ( Math.random() *10);
            System.out.println(vector[i]);
            
        }
        
        System.out.println("Ingrese un número que desea buscar");
        int num = leer.nextInt();
        int contador = 0;
        int x = 0;
        for (int elemento: vector) {
            x++;
            if(elemento == num){
                contador++;
                System.out.println("El número se encuentra en la posición" + x);
            }
        }
        System.out.println("Las veces que se repite fueron :"+ contador);
    }
    
}
