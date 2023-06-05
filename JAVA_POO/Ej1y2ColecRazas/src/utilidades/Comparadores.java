/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Comparator;

/**
 *
 * @author Tomas
 */
public class Comparadores {
    public static Comparator <String> ordenarPorNombreDesc = new Comparator <String>() {
        @Override
        public int compare(String t, String t1) {
            return t.compareToIgnoreCase(t1);
        }
    };
  
}
