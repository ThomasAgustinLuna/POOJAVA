/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import ej1.entidades.CuentaBancaria;
import ej1.servicios.CuentaBancariaServicios;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicios cbs = new CuentaBancariaServicios();
        CuentaBancaria c1 = cbs.crearCuenta();
      String respuesta;
        int opcion;

        do {
            System.out.println("1-Ingresar");
            System.out.println("2-Retirar");
            System.out.println("3-Extracion");
            System.out.println("4 consultar saldo");
            System.out.println("5 consultar datos");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cbs.ingresar(c1);
                    break;
                case 2:
                    cbs.retirar(c1);
                    break;
                case 3:
                    cbs.extraccionRapida(c1);
                    break;
                case 4:
                    cbs.consultarSaldo(c1);
                    break;
                case 5:
                    cbs.consultarDatos(c1);
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta");
            }
            System.out.println("Desea salir? S/N");
            respuesta=leer.next();
        } while (!respuesta.equalsIgnoreCase("s"));
        
        
        
    }
    
}