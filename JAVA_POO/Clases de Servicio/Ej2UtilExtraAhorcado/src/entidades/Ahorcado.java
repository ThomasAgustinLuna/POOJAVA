/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Tomas
 */
public class Ahorcado {
    private String [] palabra;
    private int cantJ;
    private int cantL;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantJ, int cantL) {
        this.palabra = palabra;
        this.cantJ = cantJ;
        this.cantL = cantL;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantJ() {
        return cantJ;
    }

    public void setCantJ(int cantJ) {
        this.cantJ = cantJ;
    }

    public int getCantL() {
        return cantL;
    }

    public void setCantL(int cantL) {
        this.cantL = cantL;
    }
    
    
    
}
