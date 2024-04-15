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
public final class Televisor extends Electrodomestico {
    
    protected int resolicion;
    protected boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolicion, boolean TDT, double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolicion = resolicion;
        this.TDT = TDT;
    }

    public int getResolicion() {
        return resolicion;
    }

    public void setResolicion(int resolicion) {
        this.resolicion = resolicion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
    
        Scanner leer = new Scanner(System.in);
        super.crearElectrodomestico();
        System.out.println("Resolucion del televisor (Pulgadas)");
        this.resolicion = leer.nextInt();
        leer.nextLine();
        System.out.println("¿Desea que tenga TDT? S/N ");
        String opc= leer.nextLine();
        if ("s".equalsIgnoreCase(opc)) {
            this.TDT= true;
        }else{
            this.TDT= false;
        }
    }
    
    @Override
    public double precioFinal(){
    
        double consumoFinal=0;
        double precioPorResolucion=0;
        double precioPorTdt=0;
        
        if (this.TDT == true && 40 < this.resolicion ) {
            precioPorResolucion= super.precioFinal() * 0.3;
        }else{
            precioPorResolucion = 0;
        }
        
        if (this.TDT==true) {
            precioPorTdt = 500;
        }else{
            precioPorTdt= 0;
        }
        
        consumoFinal = super.precioFinal() + precioPorResolucion + precioPorTdt;
        return consumoFinal;
    }
    
    public void mostrarPrecioFinal(){
    
        System.out.println("El precio final es $"+precioFinal());
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolicion=" + resolicion + ", TDT=" + TDT + '}';
    }
}
