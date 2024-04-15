/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8extra2;

import Entity.NIF;
import Service.NIFServicio;

/**
 *
 * @author play_
 */
public class Guia8Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFServicio a = new NIFServicio();
        NIF nif =  a.crearNif();
       
       a.mostrar(nif);
        
    }
    
}
