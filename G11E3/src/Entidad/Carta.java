
package Entidad;

import java.util.Random;

/**
 *
 * @author maty
 */
public class Carta {
    private Integer numcarta;
    private String palo;

    public Carta() {
    }

    public Carta(Integer numcarta, String palo) {
        this.numcarta = numcarta;
        this.palo = palo;
    }

    public Integer getNumcarta() {
        return numcarta;
    }

    public void setNumcarta(Integer numcarta) {
        this.numcarta = numcarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numcarta=" + numcarta + ", palo=" + palo + '}';
    }
}
