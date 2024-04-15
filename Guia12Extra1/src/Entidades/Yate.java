package Entidades;
/*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
public class Yate extends Motor {

    private int camarote;

    public Yate() {
    }

    public Yate(int camarote) {
        this.camarote = camarote;
    }

    public Yate(int camarote, double CV) {
        super(CV);
        this.camarote = camarote;
    }

    public Yate(int camarote, double CV, String matricula, int eslora, int anio) {
        super(CV, matricula, eslora, anio);
        this.camarote = camarote;
        this.costo+=this.camarote;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    @Override
    public String toString() {
        return "Yate{" + "camarote=" + camarote + '}';
    }

    
    
}
