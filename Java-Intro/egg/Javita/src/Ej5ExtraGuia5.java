
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
public class Ej5ExtraGuia5 {

    /**
     * Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios y muestre la suma de sus elementos.
     */
    public static void main(String[] args) {
        
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int[][] mat = new int[n][m];
        
        
        int sumador = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = (int)(Math.random()*10);
                sumador = sumador + mat[i][j];
                System.out.print("[ " + mat[i][j]+ "] ");
            }
            System.out.println("");
        }
        System.out.println("El total de los elementos sumados en la matriz es  " + sumador);
    }
    
}
