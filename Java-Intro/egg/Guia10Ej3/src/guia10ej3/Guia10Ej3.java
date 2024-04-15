/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10ej3;

import Entity.Alumno;
import Services.ServiceAlumno;
import java.util.ArrayList;

/**
 *
 * @author play_
 */
public class Guia10Ej3 {
    public static void main(String[] args) {
        
         
        ServiceAlumno n = new ServiceAlumno();     
        ArrayList<Alumno> Alumnos= new ArrayList();
        n.comprobador(Alumnos);
        n.creador(Alumnos);
        Alumnos.forEach((e)->{System.out.println(e);});
    }
    
}

