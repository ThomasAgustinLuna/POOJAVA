
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
public class Guia4Ej4 {

    /**
     * Crea una aplicación que nos pida un número por teclado y con una función
     * se lo pasamos por parámetro para que nos indique si es o no un número
     * primo, debe devolver true si es primo, sino false.
     */
    public static Boolean EsPrimo(int numero) {
        Boolean resultado = true;
        
        int contador = 0;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {

              resultado = false;
             

            }
        }
            return resultado;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número y sabrá si es primo o no.");
        int num = leer.nextInt();

        if (EsPrimo(num)){
            System.out.println("Es primo");
        }
        else
        {
            System.out.println("No es primo");
        }
        
        

    }

}
