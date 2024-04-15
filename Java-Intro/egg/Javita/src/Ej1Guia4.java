
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir.
 *La aplicación debe tener una función para cada operación matemática y deben 
 *devolver sus resultados para imprimirlos en el main. 
 */

/**
 *
 * @author play_
 */
public class Ej1Guia4 {

    /**
     * @param args the command line arguments
     */
    
    private static void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción: ");
    }
    
    private static void suma(int n1, int n2){
        System.out.println(n1 + n2);
    }
    private static void resta(int n1, int n2){
        System.out.println(n1 - n2);
    }
    private static void division(int n1, int n2){
        System.out.println(n1 / n2);
    }
    private static void multiplicacion(int n1, int n2){
        System.out.println(n1 * n2);
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num1, op;
        
        System.out.println("Ingrese dos números");
        num = leer.nextInt();
        num1 = leer.nextInt();
        
        do{
            menu();
           op = leer.nextInt();
           switch(op){
                case 1: suma(num, num1); 
                break;
            
                case 2: resta(num, num1); 
                break;
                    
                case 3: multiplicacion(num, num1); 
                break;
                  
                case 4: division(num, num1); 
                break;
                
                case 5: System.out.println("Saliste exitosamente");
           }
        }while(op != 5);
        
    }
    
}
