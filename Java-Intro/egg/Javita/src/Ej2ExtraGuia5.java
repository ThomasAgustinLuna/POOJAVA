
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
public class Ej2ExtraGuia5 {

    /**
     * Escriba un programa que averigüe si dos vectores de
     * N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de los vectores");
        int dim = leer.nextInt();
        
        int[] vec1 = new int[dim];
        int[] vec2 = new int[dim];
        Boolean bandera = true;
        for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese numeros para el primer vector");
            int num = leer.nextInt();
            vec1[i] = num;
                    
            
        }
            for (int i = 0; i < dim; i++) {
            System.out.println("Ingrese numeros para el segundo vector");
            int num = leer.nextInt();
            vec2[i] = num;
                    
        }
            //comprueba si vec1 y vec2 son iguales posición por posición.
            for (int i = 0; i < dim; i++) {
                if (vec1[i] == vec2[i]) {
                    bandera = true;
                    
                }else
                {
                    bandera = false;
                }
            
        }
            if(bandera == true){
                System.out.println("Los vectores son iguales");
                
            }else
            {
                System.out.println("Los vectores son diferentes");
            }
            
    }
    
}
