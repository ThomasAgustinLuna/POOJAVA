
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
public class Ej4ExtraGuia5 {

    /**
     *  
     *10 alumnos para luego obtener una cantidad de aprobados y desaprobados.
     * Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
     * Las ponderaciones de cada nota son: 1er trabajo 10% , 2nd trabajo 15% , 1er integrador 25 , 2nd Integrador 50%;
     */
    

  public static void main(String[] args) {
    double[][] notas = {
      {7, 8, 6, 9},   // Notas del alumno 1
      {5, 6, 7, 8},   // Notas del alumno 2
      {9, 8, 8, 7},   // Notas del alumno 3
      {6, 7, 5, 4},   // Notas del alumno 4
      {8, 9, 7, 8},   // Notas del alumno 5
      {7, 6, 7, 8},   // Notas del alumno 6
      {9, 8, 9, 9},   // Notas del alumno 7
      {6, 5, 7, 6},   // Notas del alumno 8
      {7, 8, 8, 9},   // Notas del alumno 9
      {8, 9, 7, 8}    // Notas del alumno 10
    };

    int aprobados = 0;
    int desaprobados = 0;

    for (int i = 0; i < notas.length; i++) {
      double promedio = 0;

     
      promedio += notas[i][0] * 0.1;  // 10% del primer trabajo práctico evaluativo
      promedio += notas[i][1] * 0.15; // 15% del segundo trabajo práctico evaluativo
      promedio += notas[i][2] * 0.25; // 25% del primer integrador
      promedio += notas[i][3] * 0.5;  // 50% del segundo integrador

      
      if (promedio >= 7) {
        aprobados++;
      } else {
        desaprobados++;
      }
    }

    System.out.println("Cantidad de aprobados: " + aprobados);
    System.out.println("Cantidad de desaprobados: " + desaprobados);
  }
}
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 
        /*
        Scanner leer = new Scanner (System.in);
        
       double[][] mat = new double[10][4];
        
           for (int i = 0; i < 10; i++) {
               for (int j = 0; j < 4; j++) {
                   mat[i][j] = (Math.random()*10);
                   
               }
        }
           for (int i = 0; i < 10; i++) {
               for (int j = 0; j < 4; j++) {
                
               }
                 System.out.println(mat[i][0]);
        }
           
           
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 4; j++) { 
                mat[i][0] = (mat[i][j] * 1.10);
            
             }
                  
        }
        
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                  System.out.print("[  " + mat[i][j] + "  ]" );
            }
             System.out.println("");
        }
        

    }
 */   
