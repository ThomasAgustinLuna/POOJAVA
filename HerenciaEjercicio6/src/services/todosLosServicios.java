/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Edificio;
import entities.EdificioOficinas;
import entities.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class todosLosServicios {
    
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    

 
    public EdificioOficinas crearEdiOfi(){
        
        EdificioOficinas eof=new EdificioOficinas();
        System.out.println("----Bienvenido----");
        System.out.println("Por favor ingrese el ancho del edificio");
        eof.setAncho(read.nextDouble());
        System.out.println("Ahora por favor ingrese el alto");
        eof.setAlto(read.nextDouble());
        System.out.println("Ahora por favor ingrese el largo");
        eof.setLargo(read.nextDouble());
        eof.cantidadPersonas();
        System.out.println(eof.toString());
        return eof;
    }
    
    public Polideportivo crearPoli(){
        
        Polideportivo poli=new Polideportivo();
        System.out.println("----Bienvenido----");
        System.out.println("Por favor ingrese el ancho del edificio");
        poli.setAncho(read.nextDouble());
        System.out.println("Ahora por favor ingrese el alto");
        poli.setAlto(read.nextDouble());
        System.out.println("Ahora por favor ingrese el largo");
        poli.setLargo(read.nextDouble());
        System.out.println("Por favor ingrese el nombre del polideportivo");
        poli.setNombre(read.next());
        System.out.println("El polideportivo es techado? SI/NO ");
        String aux=read.next();
        if (aux.equalsIgnoreCase("si")) {
            poli.setTechado(true);
        }else{
            poli.setTechado(false);
        }
       
        System.out.println(poli.toString());
        
        return poli;
    }
    
}
