
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
public class Ej1ExtraGuia5 {

    /**
     * Realizar un algoritmo que calcule la suma de todos los elementos
     * de un vector de tamaño N, con los valores ingresados por el usuario.
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese números para llenar el vector");
            int num = leer.nextInt();
            vector[i] = num;
        }
        
        int aux = 0;
        
        for (int i = 0; i < n; i++) {
            aux = aux + vector[i];
        }
        
        System.out.println("El valor final es " +aux);
    }
    
}
