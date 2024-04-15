
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 * Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
public class Guia3Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int dimension;
       
      Scanner leer = new Scanner(System.in);
      
        System.out.println("Ingrese el número");
        dimension = leer.nextInt();
        
        for(int i=0;i<dimension; i++){
            for(int j=0;j<dimension; j++){
                if(i>0 && i<(dimension-1)){
                    if(j>0 && j<(dimension-1)){
                     System.out.print("  ");
                    }else{
                         System.out.print(" x");
                    }
                }
                else
                {
                    System.out.print(" x");
                }
                     
            }
            System.out.println("");
        }
        
    }
    
}
