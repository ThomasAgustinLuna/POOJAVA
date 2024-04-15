package Entidades;

import java.util.Scanner;

public class Barco {

    protected String matricula;

    protected int eslora;

    protected double costo;
    
    protected int anio;

    public Barco() {
        crearBarco();
        this.costo=eslora*10;
    }

    public Barco(String matricula, int eslora, int anio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anio = anio;
        this.costo=eslora*10;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", costo=" + costo + ", anio=" + anio + '}';
    }

  
    
    public void crearBarco(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la Matricula: ");
        this.matricula = leer.next();
        System.out.println("Ingrese la eslora: ");
        this.eslora = leer.nextInt();
        System.out.println("Ingrese el año de fabricación: ");
        this.anio = leer.nextInt();
    }
    
}
