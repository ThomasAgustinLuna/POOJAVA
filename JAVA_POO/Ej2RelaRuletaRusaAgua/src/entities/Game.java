/*
 Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entities;

import java.util.ArrayList;




/**
 *
 * @author Tomas
 */
public class Game {
    private ArrayList<Player> pa;
    private Gun g;

    public Game() {
        pa=new ArrayList();
        g=new Gun();
    }

    public Game(Gun g) {
        this.g = g;
    }

    public ArrayList<Player> getPs() {
        return pa;
    }

    public void setPs(ArrayList<Player> ps) {
        this.pa = ps;
    }

    public Gun getG() {
        return g;
    }

    public void setG(Gun g) {
        this.g = g;
    }

    @Override
    public String toString() {
        return "Game{" + "ps=" + pa + ", g=" + g + '}';
    }
    
    
    
}
