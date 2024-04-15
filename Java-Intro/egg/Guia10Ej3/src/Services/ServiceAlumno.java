/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author play_
 */
public class ServiceAlumno {
        
        public void crearAlumno(ArrayList<Alumno> al) {
            Scanner read = new Scanner(System.in);
            Alumno n = new Alumno();
            ArrayList<Integer> aux = new ArrayList();
            System.out.println("ingrese el nombre del alumno ");
            n.setNombre(read.next());
            System.out.println("ingrese la nota 1 del alumno ");
            aux.add(read.nextInt());
            System.out.println("ingrese la nota 2 del alumno ");
            aux.add(read.nextInt());
            System.out.println("ingrese la nota 3 del alumno ");
            aux.add(read.nextInt());
            n.setNotas(aux);
            al.add(n);
        }

        public void creador(ArrayList<Alumno> al) {
            Scanner read = new Scanner(System.in);                      
            int res;
            do {
                System.out.println("¿Desea crear un alumno nuevo? 1.si 2.no ");
                res = read.nextInt();
                if (res == 1) {
                    crearAlumno(al);
                }
            } while (res != 2);
        }
        public void comprobador(ArrayList<Alumno> al){
            if(al.size() < 1){
               crearAlumno(al);
            }
        }
    }
