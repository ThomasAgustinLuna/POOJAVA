/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaejercicio2.Entidad;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public final class Lavadero extends Electrodomestico{
    
    protected int carga;

    public Lavadero() {
    }

    public Lavadero(int carga, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
    
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Carga deseable");
        this.carga = leer.nextInt();
    }

    @Override
    public double precioFinal() {
        
        double consumoFinal=0;
        double precioPorCarga=0;
        
        if (30 < this.carga) {
            precioPorCarga=500;
        }else {
            precioPorCarga=0;
        }
        
              
        consumoFinal=  super.precioFinal() + precioPorCarga;
        
        return consumoFinal;
    }
    
    @Override
    public String toString() {
        return "Lavadero{" + "carga=" + carga + '}';
    }
    
    
}
