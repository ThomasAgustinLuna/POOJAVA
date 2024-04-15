package entities;

import java.util.Random;

public class Sintetizador extends Armadura implements Composicion {

    private int consumo;

    public Sintetizador() {
         this.consumo=0;
    }

    public Sintetizador(int consumo) {
        this.consumo = consumo;
    }

    public Sintetizador(int consumo, boolean danio, boolean destruido) {
        super(danio, destruido);
        this.consumo = consumo;
    }

    @Override
    public String colorPrim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String colorSec() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer resistencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void leer(int tiempo) {
        consumo = tiempo * 1000000;
        uso();

    }

    @Override
     public void uso() {
        double probabilidad = 0.3;//probabilidad de 30%
        Random random = new Random();
        double aleatorio = random.nextDouble();//genera un numero aleatorio entre 0.0 y 1.0

        this.setDanio(aleatorio > probabilidad);

    }

    @Override
    public void reparandoDanios() {
        double probabilidad = 0.4;//probabilidad de 40%
        Random random = new Random();
        double aleatorio = random.nextDouble();//genera un numero aleatorio entre 0.0 y 1.0

         System.out.println("se inicia reparacion");
        do {
            aleatorio=random.nextDouble();
            this.setDanio(aleatorio <= probabilidad);
            if (this.isDanio()==true) {
                System.out.println("esta costando reparar...");
            }else{
                System.out.println("se reparo con exito el sintetizador ");
            }
        } while (this.isDanio()==true);

    }

}
