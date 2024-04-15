/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 */
import java.util.Scanner;

public class trampa {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];

        // llena la matriz de números
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int numeros = (int) (Math.random() * 10);
                String num = String.valueOf(numeros);
                matriz[i][j] = num;
            }
        }

        String[] palabras = new String[5];

        // llena el vector de palabras con las palabras ingresadas
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra de 3 a 5 letras:");
            palabras[i] = leer.next().toUpperCase();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 letras. Ingrese nuevamente:");
                palabras[i] = leer.next().toUpperCase();
            }
        }

        // el número random de filas
        int random = (int) (Math.random() * 10) * 2;
        System.out.println(random);

        // for que llena el array de palabras
        int columna = 0;
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < palabras[j].length(); i++) {
                matriz[random][columna] = Character.toString(palabras[j].charAt(i));
                columna++;
            }
        }

        // imprime la matriz
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}