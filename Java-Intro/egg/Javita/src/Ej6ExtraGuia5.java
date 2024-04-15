
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
public class Ej6ExtraGuia5 {

    /**
     * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando
     * construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal
     * en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras
     * rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
     */
    
    public static void main(String[] args) {
//        
        Scanner leer = new Scanner (System.in);
        String[][] matriz = new String [20][20];
        
        //llena la matriz de numeros
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int numeros = (int)(Math.random()*10);
                String num = String.valueOf(numeros);
                matriz[i][j] = num;
                
                
            }
            System.out.println("");
        }
        
               
        String[] palabras = new String[5]; 
        
        //llena el vector de palabras con las palabras ingresadas
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las palabras");
            palabras[i] = leer.next();
            
            while(palabras[i].length() < 3 || palabras[i].length() > 5){
                System.out.println("Ingrese nuevamente una palabra de 3 a 5 letras");
                palabras[i] = leer.next();
                palabras[i] = palabras[i].toUpperCase();
            }   
        }
        //el numero random de filas
        int random = (int) ((Math.random()*10)*2);
        System.out.println(random);
      
        //for que llena el array de palabras
        
        int columna = 0;
        
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < palabras[j].length(); i++) {
                     matriz[random][columna] = palabras[j].substring(i, i+1);
                     columna++;
            }
         }
            
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[  "+ matriz[i][j] + "  ]");
            }
            System.out.println("");
        }
        
        
    }
    
}

