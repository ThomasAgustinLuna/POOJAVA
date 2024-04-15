/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2;

import herenciaejercicio2.Entidad.Electrodomestico;
import herenciaejercicio2.Entidad.Lavadero;
import herenciaejercicio2.Entidad.Televisor;

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
        Lavadero lavadero = new Lavadero();
        Televisor televisor = new Televisor();
        
       
        System.out.println("Que caracteristicas buscas para tu lavadero");
        lavadero.crearLavadora();
        lavadero.comprobarColor();
        System.out.println("El precio final es de: "+lavadero.precioFinal());
        System.out.println("Que caracteristicas buscas para tu televisor");
        televisor.crearTelevisor();
        System.out.println("El precio final es de: "+televisor.precioFinal());
    }
    
}
