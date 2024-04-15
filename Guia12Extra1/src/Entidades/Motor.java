package Entidades;
/*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
public class Motor extends Barco {

    private double CV;
    public Motor() {
        
    }

    public Motor(double CV) {
        this.CV = CV;
    }

    public Motor(double CV, String matricula, int eslora, int anio) {
        super(matricula, eslora, anio);
        this.CV = CV;
        this.costo+=this.CV;
    }

  

    public double getCV() {
        return CV;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }

    @Override
    public String toString() {
        return "Motor{" + "CV=" + CV + '}';
    }
    
    
}
