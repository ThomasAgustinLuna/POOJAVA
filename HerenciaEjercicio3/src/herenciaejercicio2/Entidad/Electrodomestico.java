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
public class Electrodomestico {
    
    protected double precio;
    protected String color;
    protected String consumoEnergetico;
    protected int peso;

    public Electrodomestico() {
    }

    
    public Electrodomestico(double precio, String color, String consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(){
    
        if(this.consumoEnergetico.equalsIgnoreCase("A") || this.consumoEnergetico.equalsIgnoreCase("B")
         ||this.consumoEnergetico.equalsIgnoreCase("C") || this.consumoEnergetico.equalsIgnoreCase("D")
         ||this.consumoEnergetico.equalsIgnoreCase("E") || this.consumoEnergetico.equalsIgnoreCase("F")){
    }else {
            this.consumoEnergetico = "F";
        }
    }

    public void comprobarColor(){
    
        if(this.color.equalsIgnoreCase("BLANCO") || this.color.equalsIgnoreCase("NEGRO")
         ||this.color.equalsIgnoreCase("AZUL") || this.color.equalsIgnoreCase("ROJO")
         ||this.color.equalsIgnoreCase("GRIS")){
            System.out.println(this.color);
        }else {
            this.color = "BLANCO";
            System.out.println(this.color);
        }
    }
    
    public void crearElectrodomestico(){
    
        Scanner leer = new Scanner(System.in);
        System.out.println("Elija un color");
        this.color= leer.nextLine();
        comprobarColor();
        System.out.println("Elija el consumo electrico: A/B/C/D/E/F");
        this.consumoEnergetico = leer.nextLine();
        comprobarConsumoEnergetico();
        System.out.println("Peso deseable");
        this.peso = leer.nextInt();
        System.out.println("El precio base es de 1000");
        this.precio = 1000;
        
        
    }

    public double precioFinal(){
    
        double precioFinal=0;
        double precioPorLetra=0;
        double PrecioPorPeso=0;
        
        if("A".equalsIgnoreCase(this.consumoEnergetico)){
            precioPorLetra = 1000;
        }else if("B".equalsIgnoreCase(this.consumoEnergetico)){
            precioPorLetra = 800;
        }else if("C".equalsIgnoreCase(this.consumoEnergetico)){
            precioPorLetra = 600;
        }else if("D".equalsIgnoreCase(this.consumoEnergetico)){
            precioPorLetra = 500;
        }else if("E".equalsIgnoreCase(this.consumoEnergetico)){
            precioPorLetra = 300;
        }else if("F".equalsIgnoreCase(this.consumoEnergetico)){
            precioPorLetra = 100;
        }
        
        if(1 <= this.peso && 19 >= this.peso){
            PrecioPorPeso = 100;
        }else if(20 <= this.peso && 49 >= this.peso){
            PrecioPorPeso = 500;
        }else if(50 <= this.peso && 79 >= this.peso){
            PrecioPorPeso = 800;
        }else if(80 <= this.peso){
            PrecioPorPeso = 1000;
        }
        
        precioFinal = this.precio + PrecioPorPeso + precioPorLetra;
       
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    
    
}

