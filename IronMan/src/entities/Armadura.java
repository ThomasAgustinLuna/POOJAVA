/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Ali
 */
public abstract class Armadura implements Composicion {

    private boolean danio;

    private boolean destruido;

    public abstract void uso();

    
    public abstract void reparandoDanios();

    public Armadura() {
       this.danio=false;
       this.destruido=false;
       
    }

    public Armadura(boolean danio, boolean destruido) {
        this.danio = danio;
        this.destruido = destruido;
    }

    
    public boolean isDanio() {
        return danio;
    }

    public void setDanio(boolean danio) {
        this.danio = danio;
    }

    public boolean isDestruido() {
        return destruido;
    }

    public void setDestruido(boolean destruido) {
        this.destruido = destruido;
    }

    @Override
    public String toString() {
        return "Armadura{" + "danio=" + danio + ", destruido=" + destruido + '}';
    }

}
