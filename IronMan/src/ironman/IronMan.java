/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ironman;

import entities.Dispositivos;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class IronMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        Dispositivos a = new Dispositivos();
        a.iniciandoSistema();
        a.simulador();

        int opcion;
        System.out.println("Jelou toni");
        do {
            System.out.println("");
            System.out.println("¿Que hacemos?");
            System.out.println("1- Caminar");
            System.out.println("2- Correr");
            System.out.println("3- Propulsar");
            System.out.println("4- Volar");
            System.out.println("5- Mostrar estado general");
            System.out.println("6-Disparar");
            System.out.println("7-Revisar dispositivos");
            System.out.println("8-Radar");
            System.out.println("9-Destruir enemigos");
            System.out.println("10- Salir");
            System.out.println("");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    a.caminar();
                    break;
                case 2:
                    a.correr();
                    break;
                case 3:
                    a.propulsarse();
                    break;
                case 4:
                    a.volar();
                    break;

                case 5:
                    a.mostrandoEstado();

                    break;
                case 6:
                    a.disparar();

                    break;
                case 7:
                    a.revisandoDisp();

                    break;
                case 8:
                    a.radarV1();

                    break;
                case 9:
                    a.destruccionEnemigos();

                    break;

                default:
                    System.out.println("ERROR. Opcion no valida");
            }
        } while (opcion < 10);

    }

}
