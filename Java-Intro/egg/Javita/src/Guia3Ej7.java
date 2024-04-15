
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
public class Guia3Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       int cuentaCorrecta = 0 , cuentaIncorrecta = 0;
       String frase;
       
       do{
           System.out.println("Ingrese una frase que comience con X y finalice con O");
           frase = leer.nextLine();
           if(frase.equals("&&&&&")){
               break; //Acá corta y sale del do-while
           }
           if(frase.length() == 5 && (frase.substring(0,1)).equals("X") && (frase.substring(4,5)).equals("O")){
            cuentaCorrecta++;
           }
           else
           {
               cuentaIncorrecta++;
           }
       }while(true); //true como condicion que se repita siempre hasta que llegue a un break
        System.out.println("Lecturas correctas: "+ cuentaCorrecta);
        System.out.println("Lecturas incorrectas: "+ cuentaIncorrecta);
    }
    
}
