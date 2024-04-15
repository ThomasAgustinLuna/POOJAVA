/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.Motor;
import Entidades.Velero;
import Entidades.Yate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dario
 */
public class ServicioAlquiler {
    private long diffMili;
    private long diffDias;
    DateFormat formateador= new SimpleDateFormat("dd/M/yy");
    Alquiler a1= new Alquiler();
    public Barco crearVelero(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        Velero v1= new Velero();
      
        System.out.println("Ingrese la cantidad de mástiles ");
        v1.setCantMastiles(leer.nextInt());
       return v1;
      
    }
    public Motor crearBarcoAMotor(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        Motor m1= new Motor();
       
        System.out.println("Ingrese la potencia del motor en CV ");
        m1.setCV(leer.nextDouble());
        
    return m1;
      
    }
    public Barco crearYate(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        Motor m1= crearBarcoAMotor();
        
        System.out.println("Ingrese la cantidad de camarotes ");
        
        Yate y1= new Yate(leer.nextInt(),m1.getCV(),m1.getMatricula(),m1.getEslora(),m1.getAnio());
       return y1;
    }
    
    public void crearAlquiler(List <Barco> l1){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
        
        System.out.println("Ingrese el nombre del cliente");
        a1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del cliente");
        a1.setDNI(leer.nextInt());
        Calendar calendario= new GregorianCalendar();
         
        System.out.println("Ingrese la fecha de alquiler (dd/mm/aa)");
            String fechaIngresada = leer.next();
            try {
            Date fecha= formateador.parse(fechaIngresada);
            a1.setFechaAlquiler(fecha);
            } catch (ParseException e) {
            e.printStackTrace();
            }
        
        System.out.println("Ingrese la fecha de devolución (dd/mm/aa)");
            String fechaDevolucion = leer.next();
            
            try {
            Date fecha= formateador.parse(fechaDevolucion);
            Date aux1=formateador.parse(fechaIngresada);
            Date aux2=formateador.parse(fechaDevolucion);
                if (aux2.getTime()>aux1.getTime()) {
                     this.diffMili=aux2.getTime()-aux1.getTime();
                }else{
                    this.diffMili=aux1.getTime()-aux2.getTime();
                }
           
            this.diffDias=this.diffMili/(24*60*60*1000);
            
            a1.setFechaDevolucion(fecha);
            } catch (ParseException e) {
            e.printStackTrace();
            }
            
        System.out.println("Ingrese la posición de amarre");
        a1.setPosicionAmarre(leer.nextInt());
        int cont=1, opc=0;
       
        for (Barco barco : l1) {
            System.out.println(cont + " - " + barco);
            cont ++;
            
        }
        System.out.println("Seleccione Barco");
        opc=leer.nextInt();
        Barco b1=l1.get((opc-1));
        a1.setBarco(b1);
        
    }
    
    /*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
    
    public void mostrarLista(ArrayList <Barco>l1){
        System.out.println(l1);
       
    }
    
    public void mostrarAlqquiler(){
        System.out.println(a1.toString());
      
       System.out.println("El costo final de alquiler es de: "+a1.getBarco().getCosto()*this.diffDias);   
    }
}
