package entities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Dispositivos implements Composicion {

    private float reactor;

    private Integer salud;

    private Bota bota1 = new Bota(0, false, false);

    private Bota bota2 = new Bota(0, false, false);

    private Guante guante1 = new Guante(0, false, false);

    private Guante guante2 = new Guante(0, false, false);

    private Consola consola = new Consola(0, false, false);

    private Sintetizador sinte = new Sintetizador(0, false, false);

    private ArrayList<Armadura> ala = new ArrayList();

    private ArrayList<ObjetoRadar> or = new ArrayList();

    private Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Dispositivos() {
//        this.reactor = Float.MAX_VALUE;
        this.reactor = 1000000000f;
    }

    public Dispositivos(Integer salud, Bota bota1, Bota bota2, Guante guante1, Guante guante2, Consola consola, Sintetizador sinte) {
//        this.reactor = Float.MAX_VALUE;
        this.reactor = 1000000000f;
        this.salud = salud;
        this.bota1 = bota1;
        this.bota2 = bota2;
        this.guante1 = guante1;
        this.guante2 = guante2;
        this.consola = consola;
        this.sinte = sinte;
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

    public float getReactor() {
        return reactor;
    }

    public void setReactor(float reactor) {
        this.reactor = reactor;
    }

    public Integer getSalud() {
        return salud;
    }

    public void setSalud(Integer salud) {
        this.salud = salud;
    }

    public Bota getBota1() {
        return bota1;
    }

    public void setBota1(Bota bota1) {
        this.bota1 = bota1;
    }

    public Bota getBota2() {
        return bota2;
    }

    public void setBota2(Bota bota2) {
        this.bota2 = bota2;
    }

    public Guante getGuante1() {
        return guante1;
    }

    public void setGuante1(Guante guante1) {
        this.guante1 = guante1;
    }

    public Guante getGuante2() {
        return guante2;
    }

    public void setGuante2(Guante guante2) {
        this.guante2 = guante2;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSinte() {
        return sinte;
    }

    public void setSinte(Sintetizador sinte) {
        this.sinte = sinte;
    }

    public void iniciandoSistema() {

        ala.add(guante1);
        ala.add(guante2);
        ala.add(bota1);
        ala.add(bota2);
        ala.add(consola);
        ala.add(sinte);

    }

    public void caminar() {
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insuficiente para caminar");
        } else {

            System.out.println("Cuanto tiempo desea caminar?");
            int resp = read.nextInt();
            bota1.caminar(resp);
            bota2.caminar(resp);
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
//            System.out.println("dañamos intencionalmente una bota");
//            bota1.setDanio(true);
//            System.out.println("llamamos el metodo de reparar danios");
//            bota1.reparandoDanios();
//            bota2.reparandoDanios();
//            this.sufriendoDanios();
        }

    }
//reactor * 100 / 1000000000 < 10

    public void correr() {
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insuficiente para correr");
        } else {

            System.out.println("Cuanto tiempo desea correr?");
            int resp = read.nextInt();
            bota1.correr(resp);
            bota2.correr(resp);
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
        }
    }

    public void propulsarse() {
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insuficiente para propulsarse");
        } else {

            System.out.println("Cuanto tiempo desea propulsarse?");
            int resp = read.nextInt();
            bota1.propulsarse(resp);
            bota2.propulsarse(resp);
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
        }
    }
//reactor * 100 / 1000000000 < 10

    public void disparar() {
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insuficiente para disparar");
        } else {

            System.out.println("Cuanto tiempo desea disparar?");
            int resp = read.nextInt();
            guante1.disparar(resp);
            guante2.disparar(resp);
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
        }
    }

    public void volar() {
        //no usamos el metodo uso porque ya lo traen los metodos usados
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insuficiente para volar");
        } else {

            System.out.println("cuanto tiempo desea volar?");
            int resp = read.nextInt();

            bota1.propulsarse(resp);
            bota2.propulsarse(resp);
            guante1.estabilizar(resp);
            guante2.estabilizar(resp);
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
        }

    }

    public void estadoBateria() {
//        int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
//        reactor -= restEnergia;

        System.out.println("el estado de la bateria es: " + reactor * 100 / 1000000000 + "%");

    }

    public void infoReactor() {
//        int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
//        reactor -= restEnergia;
        System.out.println("la energia actual del reactor es de: " + reactor * 8 / 1000000000 + "Gigajulios");

    }

    public void sufriendoDanios() {

        System.out.println("guante izquierdo: " + guante1.isDanio());
        System.out.println("guante derecho: " + guante2.isDanio());
        System.out.println("bota izquierda: " + bota1.isDanio());
        System.out.println("bota derecha: " + bota2.isDanio());
        System.out.println("Consola: " + consola.isDanio());
        System.out.println("Sintetizador: " + sinte.isDanio());

    }

    public void reparar() {
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("estado de bateria insufiente para reparar");
        } else {

            int op;
            do {
                System.out.println("Reparando daños...");
                System.out.println("¿Que parte desea reparar?");
                System.out.println("1- Guante Izquierdo ");
                System.out.println("2- Guante Derecho ");
                System.out.println("3- Bota Izquierda ");
                System.out.println("4- Bota Derecha ");
                System.out.println("5- Consola");
                System.out.println("6- Sintetizador");
                System.out.println("7- Salir");
                op = read.nextInt();
                switch (op) {
                    case 1:
                        if (guante1.isDestruido()) {
                            System.out.println("El dispositivo se encuentra destruido y no es posible repararlo");
                            break;
                        } else {
                            if (guante1.isDanio()) {
                                guante1.reparandoDanios();
                                System.out.println("dispositivo reparado");
                                break;
                            } else {
                                System.out.println("Este dispositivo no esta dañado");
                                break;
                            }

                        }

                    case 2:
                        if (guante2.isDestruido()) {
                            System.out.println("El dispositivo se encuentra destruido y no es posible repararlo");
                            break;
                        } else {
                            if (guante2.isDanio()) {
                                guante2.reparandoDanios();
                                System.out.println("dispositivo reparado");
                                break;
                            } else {
                                System.out.println("Este dispositivo no esta dañado");
                                break;
                            }
                        }

                    case 3:
                        if (bota1.isDestruido()) {
                            System.out.println("El dispositivo se encuentra destruido y no es posible repararlo");
                            break;
                        } else {
                            if (bota1.isDanio()) {
                                bota1.reparandoDanios();
                                System.out.println("dispositivo reparado");
                                break;
                            } else {
                                System.out.println("Este dispositivo no esta dañado");
                                break;
                            }
                        }

                    case 4:
                        if (bota2.isDestruido()) {
                            System.out.println("El dispositivo se encuentra destruido y no es posible repararlo");
                            break;
                        } else {
                            if (bota2.isDanio()) {
                                bota2.reparandoDanios();
                                System.out.println("dispositivo reparado");
                                break;

                            } else {
                                System.out.println("Este dispositivo no esta dañado");
                                break;

                            }
                        }

                    case 5:
                        if (consola.isDestruido()) {
                            System.out.println("El dispositivo se encuentra destruido y no es posible repararlo");
                            break;
                        } else {
                            if (consola.isDanio()) {
                                consola.reparandoDanios();
                                System.out.println("dispositivo reparado");
                                break;

                            } else {
                                System.out.println("Este dispositivo no esta dañado");
                                break;
                            }
                        }

                    case 6:
                        if (sinte.isDestruido()) {
                            System.out.println("El dispositivo se encuentra destruido y no es posible repararlo");
                            break;
                        } else {
                            if (sinte.isDanio()) {
                                sinte.reparandoDanios();
                                System.out.println("dispositivo reparado");
                                break;

                            } else {
                                System.out.println("Este dispositivo no esta dañado");
                                break;
                            }
                        }

                    default:
                        break;

                }

            } while (op != 7);
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
        }

    }

    public void mostrandoEstado() {

        //estado bateria, informacion de reactor, sufriendo daños y reparando daños.
        this.estadoBateria();
        this.infoReactor();
        this.sufriendoDanios();
        System.out.println("Desea reparar dispositivos? S/N");
        String resp = read.next();
        if (resp.equalsIgnoreCase("s")) {
            this.reparar();
        } else {
            System.out.println("Saliendo...");
        }

    }

    public void revisandoDisp() {
        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insufiente para revisar dspositivo");
        } else {

            for (Armadura armadura : ala) {
                if (armadura.isDestruido()) {
                    System.out.println("El dispositivo se encuentra destruido");
                } else {
                    if (armadura.isDanio()) {
                        double probabilidad = 0.3;//probabilidad de 30%
                        Random random = new Random();
                        double aleatorio = random.nextDouble();//genera un numero aleatorio entre 0.0 y 1.0

                        do {
                            armadura.reparandoDanios();
                            if (armadura.isDanio()) {
                                armadura.setDestruido(aleatorio > probabilidad);
                            }

                        } while (armadura.isDanio() == false && armadura.isDestruido());

                    } else {
                        System.out.println("este dispositivo se encuentra sano");

                    }
                }
            }
            System.out.println("Se ha reparado toda la armdura con exito!!");
            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
            reactor -= restEnergia;
        }
    }

    public void simulador() {

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            boolean hostil = random.nextBoolean();
            double resistencia = random.nextDouble() * 5000;
            double x = random.nextDouble() * 5000;
            double y = random.nextDouble() * 5000;
            double z = random.nextDouble() * 5000;

            ObjetoRadar oj = new ObjetoRadar(hostil, resistencia, x, y, z);
            or.add(oj);

        }
    }

    public void radarV1() {

        for (ObjetoRadar objetoRadar : or) {
            double distancia = Math.sqrt(Math.pow(objetoRadar.getX(), 2) + Math.pow(objetoRadar.getY(), 2) + Math.pow(objetoRadar.getZ(), 2));
            System.out.println("Distancia al objeto: " + distancia);

        }

    }

    public void destruccionEnemigos() {

        if (reactor * 100 / 1000000000 < 10) {
            System.out.println("energia insuficiente para destruir enemigos");
        } else {

            for (ObjetoRadar objetoRadar : or) {
                double distancia = Math.sqrt(Math.pow(objetoRadar.getX() - 0, 2) + Math.pow(objetoRadar.getY() - 0, 2) + Math.pow(objetoRadar.getZ() - 0, 2));
                if (distancia > 5000 && reactor * 100 / 1000000000 > 10) {
                    System.out.println("el objetivo esta fuera de alcance");
                } else if (objetoRadar.isHostil() && reactor * 100 / 1000000000 > 10) {

                    // float aux = reactor * 100 / 1000000000;
                    do {

                        if (reactor * 100 / 1000000000 < 10) {
                            System.out.println("se ha alcanzado el limite de energia, se inician acciones evasivas");

                            this.contraMedidas();
                            break;

                        } else {
                            objetoRadar.setResistencia(objetoRadar.getResistencia() - distancia);
                            guante1.disparar(1);
                            guante2.disparar(1);
                            int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
                            reactor -= restEnergia;
                            //      aux = reactor * 100 / 1000000000;
                        }

                    } while (objetoRadar.getResistencia() > 0);
                    //  or.remove(objetoRadar);
                    System.out.println("el objetivo fue destruido");

                } else if(reactor * 100 / 1000000000 < 10){
                    System.out.println("se ha alcanzado el limite de energia, se inician acciones evasivas");

                            this.contraMedidas();
                            break;
                }else if(objetoRadar.isHostil()==false && reactor * 100 / 1000000000 > 10){
                    System.out.println("el objetivo no es hostil");
                }
            }

        }
        int restEnergia = guante1.getConsumo() + guante2.getConsumo() + bota1.getConsumo() + bota2.getConsumo() + consola.getConsumo() + sinte.getConsumo();
        reactor -= restEnergia;
    }
    public void contraMedidas() {
       
        
            System.out.println("Iniciando contramedidas, viaje maximo estimado 10 km...enviando energia a los propulsores...");
            int diezKm = 5;

            bota1.propulsarse(diezKm);
            bota2.propulsarse(diezKm);
            guante1.estabilizar(diezKm);
            guante2.estabilizar(diezKm);
            
        

    }
    
}//reactor * 100 / 1000000000 < 10
