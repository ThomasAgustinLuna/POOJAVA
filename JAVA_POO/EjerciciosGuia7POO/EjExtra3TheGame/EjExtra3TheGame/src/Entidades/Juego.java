/*
 Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos 
y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número 
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

 */
package Entidades;

import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public int num;

    public Juego() {
    }

    public Juego(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void iniciar_juego() {

        int intentos = 0;
        int resp;
        int ptsJ1 = 0;
        int ptsJ2 = 0;
        int resp2;
        int j1;
        int j2;
        String resp3;

        do {
            System.out.println("Que jugador va a elegir numero? 1/2");
            resp = leer.nextInt();
            if (resp == 1) {
                j1 = 1;
                j2 = 2;
            } else {
                j1 = 2;
                j2 = 1;
            }

            System.out.println("Jugador " + j1 + " elija un numero");
            num = leer.nextInt();

            do {
                System.out.println("Jugador " + j2 + " ,cual es el numero del jugador " + j1 + "? "+(3-intentos)+" intento/s");
                resp2 = leer.nextInt();
                if (resp2>num) {
                    System.out.println("Mas Bajo");
                    
                }else if(resp2<num){
                    System.out.println("Mas Alto");
                }
                if (resp2 != num) {
                    intentos++;

                } else {
                    if (j1 == 1) {
                        ptsJ2++;
                        System.out.println("Jugador 2 gana con " + (intentos+1)+" intento/s");
                        intentos=0;
                        break;
                    } else {
                        ptsJ1++;
                        System.out.println("Jugador 1 gana con " + (intentos+1)+" intento/s");
                        intentos=0;
                        break;
                    }

                }
            } while (intentos < 3);
            if (intentos != 3 && j1 == 1&&resp2!=num) {
                ptsJ1++;
                System.out.println("El juego termino, jugador 1 gana.");

            }else if(intentos != 3 && j1 == 2&&resp2!=num) {
                ptsJ2++;
                System.out.println("El juego termino, jugador 2 gana.");
            }else if(intentos==3 && j1==1){
                ptsJ1++;
                System.out.println("El juego termino, jugador 1 gana.");
            }else if(intentos==3 && j1==2){
                ptsJ2++;
                System.out.println("El juego termino, jugador 2 gana.");
            }else{
                
            }
            System.out.println("juegos ganados por jugador 1: "+ptsJ1);
            System.out.println("juegos ganados por jugador 2: "+ptsJ2);
            intentos=0;
            System.out.println("Desean seguir jugando? s/n");
            resp3 = leer.next();
        } while (!resp3.equalsIgnoreCase("n"));
        System.out.println("GAME OVER");

    }
}
