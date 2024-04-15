package Entidades;
/*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
public class Velero extends Barco {

    private int cantMastiles;

    public Velero() {
    }

    public Velero(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    public Velero(int cantMastiles, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.cantMastiles = cantMastiles;
        this.costo+=this.cantMastiles;
    }

   

    public int getCantMastiles() {
        return cantMastiles;
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "cantMastiles=" + cantMastiles + '}';
    }
    
    
}
