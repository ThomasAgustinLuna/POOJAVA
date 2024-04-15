/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2;

import herenciaejercicio2.Entidad.Electrodomestico;
import herenciaejercicio2.Entidad.Lavadero;
import herenciaejercicio2.Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author leand
 */
public class HerenciaEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Electrodomestico e = new Electrodomestico();
        Lavadero l1 = new Lavadero();
        Lavadero l2 = new Lavadero();
        Televisor t1= new Televisor();
        Televisor t2= new Televisor();
        ArrayList <Electrodomestico> cositos= new ArrayList();
       
        System.out.println("Que caracteristicas buscas para tu lavadora");
        l1.crearLavadora();
        l1.comprobarColor();
        System.out.println("El precio final es de: "+l1.precioFinal());
        cositos.add(l1);
        System.out.println("Que caracteristicas buscar para la segunda lavadora");
        l2.crearLavadora();
        l2.comprobarColor();
        System.out.println("El precio final es de: "+l2.precioFinal());
        cositos.add(l2);
        System.out.println("Que caracteristicas buscas para tu televisor");
        t1.crearTelevisor();
        System.out.println("El precio final es de: "+t1.precioFinal());
        cositos.add(t1);
        System.out.println("Que caracteristicas buscas para tu segundo televisor");
        t2.crearTelevisor();
        System.out.println("El precio final es de: "+t2.precioFinal());
         cositos.add(t2);
         Double sumaF=0.0;
         for (Electrodomestico cosito : cositos) {
             System.out.println("El precio final de este es: "+cosito.precioFinal());
             sumaF+=cosito.precioFinal();
        }
         System.out.println("La suma de los precios de todos los electrodomesticos es de: "+sumaF);
    }
    
}
