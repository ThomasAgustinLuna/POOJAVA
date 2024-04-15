/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12extra1;

import Entidades.Barco;
import Servicios.ServicioAlquiler;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Guia12Extra1 {

  
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");

        List<Barco> l1 = new ArrayList();
        ServicioAlquiler sa = new ServicioAlquiler();
        boolean seguir = true;
        while (seguir) {
            System.out.println("-----Bienvenido-----");
            System.out.println("1-crear velero");
            System.out.println("2-crear motor");
            System.out.println("3-crear yate");
            System.out.println("4-salir");
            int opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    l1.add(sa.crearVelero());
                    break;
                case 2:
                    l1.add(sa.crearBarcoAMotor());
                    break;
                case 3:
                    l1.add(sa.crearYate());
                    break;
                case 4:
                    seguir = false;
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }
        sa.crearAlquiler(l1);
        sa.mostrarAlqquiler();
    }

}
