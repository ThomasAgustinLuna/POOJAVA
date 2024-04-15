/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author play_
 */
public class Raiz {
   private double a, b , c, discriminante;

    
    public Raiz(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminante = discriminante;
    }
    
       public Raiz() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void setDiscriminante(double discriminante){
        this.discriminante = discriminante;
    }
    
    public double getDiscriminante(){
        return discriminante;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
   
   
   
   
   
}
