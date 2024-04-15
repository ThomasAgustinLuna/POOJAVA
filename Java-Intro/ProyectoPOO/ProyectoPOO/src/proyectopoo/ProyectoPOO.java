/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import proyectopoo.entidades.Mascota;
import proyectopoo.entidades.servicios.MascotaServicio;
import proyectopoo.utilidades.Comparadores;

public class ProyectoPOO {

    public static void main(String[] args) {
        
        MascotaServicio servMasc=new MascotaServicio();
        
//        String[] nombres= {"Pepe","Pepa"};
//        
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        List <String> nombresList2= new ArrayList();
//        
//        nombresList2.addAll(1, nombresList);
//        
//        nombresList.isEmpty();
         
        ArrayList<Mascota> mascotas =  new ArrayList();
        
        mascotas.add(new Mascota("Fer","Chiquito" ,"Perro"));
        mascotas.add(new Mascota("Fer","Chiquito" ,"Perro"));
        mascotas.add(new Mascota("Fer","Chiquito" ,"Perro"));
        mascotas.add(new Mascota("Fer","Chiquito" ,"Perro"));
        mascotas.add(new Mascota("Fer","Chiquito" ,"Perro"));
        mascotas.add(new Mascota("Fer","Chiquito" ,"Perro"));
        mascotas.add(new Mascota("Pepa","Lola" ,"Gato"));
        mascotas.add(new Mascota("Pepa","Lola" ,"Gato"));
        mascotas.add(new Mascota("Pepa","Lola" ,"Gato"));
        mascotas.add(new Mascota("Pepa","Lola" ,"Gato"));
        mascotas.add(new Mascota("Pepa","Lola" ,"Gato"));
        mascotas.add(new Mascota("Pepa","Lola" ,"Gato"));
        Collections.sort(mascotas, Comparadores.ordenarPorNombreDesc);
        Collections.shuffle(mascotas);
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
//      servMasc.fabricaMascota(1);
//      
//      servMasc.eliminarMascotaPorNombre("lola");
//      
//      servMasc.mostrarMascotas();
//      servMasc.actualizarMascota(0);
//      
//      servMasc.mostrarMascotas();
//      
//      servMasc.eliminarMascota(3);
//      
//      servMasc.mostrarMascotas();
//        Scanner leer = new Scanner(System.in).useDelimiter("\n");
//
//        Mascota m1 = new Mascota("Fernando Chiquito", "chiquito", "Perro");
//
//        m1.setNombre("pepe chiquito");
//        m1.pasear(100);
//        System.out.println(m1);
//    public String nombre;
//    public String apodo;
//    public String tipo; //conejo,loro,etc
//    public String color;
//    public int edad;
//    public boolean cola;
//    public String raza;
//        ArrayList<String> nombreArray = new ArrayList<>();
//        nombreArray.add("hola");
//        nombreArray.add("caca");
//        nombreArray.add("gg");
//        System.out.println(nombreArray.size());
//        System.out.println(nombreArray.get(1));
//        System.out.println(nombreArray.getClass());
//        
//        System.out.println(nombreArray.isEmpty());
//        System.out.println(nombreArray.remove(2));
//        System.out.println(nombreArray.get(1));
//        
//        for (String nombreArray1 : nombreArray) {
//            System.out.println(nombreArray1);
//        }
        
    }

}
