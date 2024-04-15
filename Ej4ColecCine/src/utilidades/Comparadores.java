/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Tomas
 */
public class Comparadores {

    public static Comparator<Pelicula> ordenarPorDuraciónMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
     public static Comparator<Pelicula> ordenarPorDuraciónMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
     
     public static Comparator<Pelicula> ordenarAlfabeticamenteTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
        }
    };
     
     public static Comparator<Pelicula> ordenarAlfabeticamenteDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
    };
     
}

