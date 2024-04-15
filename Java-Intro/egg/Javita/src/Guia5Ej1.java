/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 */
public class Guia5Ej1 {

    /**
     * Realizar un algoritmo que llene un vector con los 100 
     * primeros números enteros y los muestre por pantalla en orden descendente.
     */
    
    public static void main(String[] args) {
    
        int[] vector = new int[100];

        for (int i = 1; i < vector.length; i++) {
                       
            vector[i]= i;
            
        }
        
        for (int i = (vector.length-1); i >= 0 ; i--) {
            System.out.println("[  " + vector[i] + "  ]");
            
        }
    }
    
}
