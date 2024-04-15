/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra1;

import Entity.Raiz;
import Servicios.RaizServicio;

/**
 *
 * @author play_
 */
public class Guia8Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    Raiz asd = new Raiz(1, 2, 1);
    RaizServicio ra = new RaizServicio();
    
    System.out.println("Este es el discriminante :" + ra.getDiscriminante(asd));
    ra.calcular(asd);    
    }    
}
