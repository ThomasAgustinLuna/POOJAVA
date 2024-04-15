
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
public class PorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        String[] vectorCompanieros = new String[n];
        
        for (int i = 0; i <vectorCompanieros.length ; i++) {
            System.out.println("Ingrese los nombres");
            vectorCompanieros[i] = leer.next();
        }
        
        for (int i = 0; i <vectorCompanieros.length; i++) {
            System.out.print("[  " +vectorCompanieros[i] + "  ]");
        }
    }
    
}
