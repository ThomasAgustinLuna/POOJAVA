/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.NIF;
import java.util.Scanner;

/**
 *
 * @author play_
 */
public class NIFServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNif() {
        NIF p = new NIF();
        String arr[] = new String[]{"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        long contenedor;
        do {
            System.out.println("Ingrese su DNI");
            contenedor = leer.nextLong();
        } while (String.valueOf(contenedor).length() > 8);

        long resultado = contenedor % 23;
        p.setDni(contenedor);
        p.setLetra(arr[(int) resultado]);
        return p;
    }

    public void mostrar(NIF p) {
        System.out.println(p.getDni() + "-" + p.getLetra());
    }
}
