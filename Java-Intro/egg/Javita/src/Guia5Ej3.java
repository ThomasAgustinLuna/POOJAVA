
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
public class Guia5Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        
        for (int i = 0; i < n; i++) {
            vector[i] = leer.nextInt();
            System.out.println(vector[i]);
        }
        
        int cd1=0, cd2=0, cd3=0, cd4=0, cd5=0;

        for (int elemento : vector) {
            if (elemento <= 9) {
                cd1++;
                
            }
            else if(elemento <=99){
                cd2++;
              
            }else if(elemento <=999){
                cd3++;
            }else if(elemento<=9999){
                cd4++; 
            }else {
                cd5++;
            }
          
            
           
        }
        System.out.println("La cantidad de numeros con 1 digito son:" + cd1);
        System.out.println("La cantidad de numeros con 2 digito son:" + cd2);
        System.out.println("La cantidad de numeros con 3 digito son:" + cd3);
        System.out.println("La cantidad de numeros con 4 digito son:" + cd4);
        System.out.println("La cantidad de numeros con 5 digito son:" + cd5);

    }
    
}
