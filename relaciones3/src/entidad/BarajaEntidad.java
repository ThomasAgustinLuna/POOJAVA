/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author thell
 */
public class BarajaEntidad {
     private ArrayList<CartasEntidad> cartas;

    public BarajaEntidad() {
    }

    public BarajaEntidad(ArrayList<CartasEntidad> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<CartasEntidad> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<CartasEntidad> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "BarajaEntidad{" + "cartas=" + cartas + '}';
    }


    }
     
    

