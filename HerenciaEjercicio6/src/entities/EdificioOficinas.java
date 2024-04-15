package entities;

import java.util.ArrayList;
import java.util.Scanner;

public class EdificioOficinas extends Edificio {

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    private int oficinas = 0;

    private int cantPer;

    private int numPisos;

    public EdificioOficinas() {
    }

    public EdificioOficinas(int oficinas, int cantPer, int numPisos) {
        this.oficinas = oficinas;
        this.cantPer = cantPer;
        this.numPisos = numPisos;
    }

    public EdificioOficinas(int oficinas, int cantPer, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.cantPer = cantPer;
        this.numPisos = numPisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getCantPer() {
        return cantPer;
    }

    public void setCantPer(int cantPer) {
        this.cantPer = cantPer;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return "EdificioOficinas{" + "oficinas=" + oficinas + ", cantPer=" + cantPer + ", numPisos=" + numPisos +'}'+super.toString();
    }

//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
    public void cantidadPersonas() {
        
        System.out.println("Ingrese por favor la cantidad de personas maxima por oficina");
        this.cantPer = read.nextInt();
        System.out.println("Ahora ingrese la cantidad de pisos del edificio de oficinas");
        this.numPisos = read.nextInt();
        
        for (int i = 0; i < numPisos; i++) {
            System.out.println("Ingrese la cantidad de oficinas en el piso " + (i + 1));
            int aux = read.nextInt();
            oficinas += aux;
            System.out.println("La cantidad de personas que entran en el piso "+ (i+1)+" son: "+aux*cantPer);
        }


        System.out.println("La cantidad de personas que entran en un edificio es de: " + cantPer * oficinas);
        
    }

    @Override
    public double calcularSuperficie() {
        return super.getLargo()*super.getAncho();  
    }

    @Override
    public double calcularVolumen() {
        return super.getLargo()*super.getAlto()*super.getAncho();
    }
}
