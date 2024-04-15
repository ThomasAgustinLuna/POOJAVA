/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo.entidades.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import proyectopoo.entidades.Mascota;

/**
 *
 * @author Tomas
 */
public class MascotaServicio {

    private Scanner leer;
    private List<Mascota> mascotas;

    public MascotaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();

    }

    public Mascota crearMascota() {
        System.out.println("introducir nombre");
        String nombre = leer.next();
        System.out.println("introducir apodo");
        String apodo = leer.next();
        System.out.println("introducir tipo");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);

    }

    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }

    public void mostrarMascotas() {
        System.out.println("Las mascotas actuales de la lista de mascotas son");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }

        System.out.println("cantidad = " + mascotas.size());
    }

    /**
     * crea mascotas, TODOS chiquitos
     *
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la
     * lista
     */
    public void fabricaChiquitos(int cantidad) {

        for (int i = 0; i < cantidad; i++) {

            mascotas.add(new Mascota("Fer", "chiquito", "Beagle"));

        }

    }

    /**
     * crea mascotas pidiendo datos por teclado
     *
     * @param cantidad
     */
    public void fabricaMascota(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();

            agregarMascota(mascotaCreada);

            System.out.println(mascotaCreada.toString());
        }
    }
//    //TO DO Añadir Try and Catch
//    public void actualizarMascota(int index){
//        Mascota m = mascotas.get(index);
//        m.setApodo("Roberto");
//        
//    }

    public void actualizarMascota(int index) {
        
        if (index <= (mascotas.size() - 1)) {
            System.out.println("");
            System.out.println("--------Actualizar--------");
            Mascota m = crearMascota();

            mascotas.set(index, m);
        }else{
            System.out.println("El indice es erroneo,fallo al actualizar");
        }

    }

    public void eliminarMascota(int index) {
        
        if (index <= (mascotas.size() - 1)) {
            mascotas.remove(index);
        }else{
            System.out.println("El indice es erroneo, fallo al eliminar");
        }
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m=mascotas.get(i);
            if (m.getNombre().equals(nombre)) {
                mascotas.remove(i);
            }
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m=mascotas.get(i);
            if (m.getNombre().equals(nombreViejo)) {
                m.setNombre(nombreNuevo);
            }
        }
        
        
    }

}
