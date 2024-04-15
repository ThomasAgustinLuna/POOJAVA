/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author ernes
 */
public class Ej6Guia5 {


    
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
                // Verificar que los números ingresados están entre 1 y 9
                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("El número ingresado debe estar entre 1 y 9. Intente nuevamente.");
                    System.out.printf("Elemento [%d][%d]: ", i, j);
                    matriz[i][j] = input.nextInt();
                }
            }
        }
        
        // Verificar si la matriz es un cuadrado mágico
        boolean esMagico = true;
        int sumaObjetivo = matriz[0][0] + matriz[0][1] + matriz[0][2]; // Suma de la primera fila
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) {
                esMagico = false;
                break;
            }
        }
        // Verificar columnas
        if (esMagico) {
            for (int i = 0; i < 3; i++) {
                int sumaColumna = 0;
                for (int j = 0; j < 3; j++) {
                    sumaColumna += matriz[j][i];
                }
                if (sumaColumna != sumaObjetivo) {
                    esMagico = false;
                    break;
                }
            }
        }
        // Verificar diagonales
        if (esMagico) {
            int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
            int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
            if (sumaDiagonal1 != sumaObjetivo || sumaDiagonal2 != sumaObjetivo) {
                esMagico = false;
            }
        }
        
        // Imprimir el resultado
        if (esMagico) {
            System.out.println("La matriz es un cuadrado mágico");
        } else {
            System.out.println("La matriz no es un cuadrado mágico");
        }
        
        input.close();
    }
}