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
package services;

import entities.Game;
import entities.Gun;
import entities.Player;
import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class GameService {
    Game g=new Game();
    GunService gs=new GunService();
    public void loadGame(ArrayList<Player>pa,Gun gu){
        g.setG(gu);
        g.setPs(pa);
    }
    
    public void round(int rounds){
        
        if (gs.wet(g.getG())==false) {
            gs.nextShoot(g.getG());
           
        }else{
            
            System.out.println("El jugador"+g.getPs().get(rounds).getName()+"Se mejo, y el juego termino");
        }
       
        
    }
    
}
