/*
 Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package entities;

import java.util.Random;

/**
 *
 * @author Tomas
 */
public class Gun {
    private int actualPoss;
    private int waterPoss;
    
    public Gun(){
        
    }

    public Gun(int actualPoss, int waterPoss) {
        this.actualPoss = actualPoss;
        this.waterPoss = waterPoss;
    }

    public int getActualPoss() {
        return actualPoss;
    }

    public void setActualPoss(int actualPoss) {
        this.actualPoss = actualPoss;
    }

    public int getWaterPoss() {
        return waterPoss;
    }

    public void setWaterPoss(int waterPoss) {
        this.waterPoss = waterPoss;
    }

    @Override
    public String toString() {
        return "Gun{" + "actualPoss=" + actualPoss + ", waterPoss=" + waterPoss + '}';
    }
    
    
    
   
}
