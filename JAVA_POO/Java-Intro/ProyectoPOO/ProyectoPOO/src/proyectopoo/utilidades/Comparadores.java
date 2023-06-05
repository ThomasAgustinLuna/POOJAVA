/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.utilidades;

import java.util.Comparator;
import proyectopoo.entidades.Mascota;

/**
 *
 * @author Tomas
 */
public class Comparadores {
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            
            
            return t1.getNombre().compareTo(t.getNombre());
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota t, Mascota t1) {
            
            
            return t1.getEdad().compareTo(t.getEdad());
        }
    };
    
}
