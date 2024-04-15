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
public class ObjetoRadar {
    
    private boolean hostil;
    
    private double resistencia, x, y, z ;

    public ObjetoRadar() {
    }

    public ObjetoRadar(boolean hostil, double resistencia, double x, double y, double z) {
        this.hostil = hostil;
        this.resistencia = resistencia;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean isHostil() {
        return hostil;
    }

    public void setHostil(boolean hostil) {
        this.hostil = hostil;
    }

    public double getResistencia() {
        return resistencia;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "ObjetoRadar{" + "hostil=" + hostil + ", resistencia=" + resistencia + ", x=" + x + ", y=" + y + ", z=" + z + '}';
    }
    
   
    
    
}
