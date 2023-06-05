/*
 Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */

package ejmalo_rela_2;

import entities.Player;
import entities.Team;
import java.util.ArrayList;


public class EjMALO_Rela_2 {

   
    public static void main(String[] args) {
        Player p1=new Player();
        Player p2=new Player();
        p1.setName("thomas");
       p1.setLastName("luna");
       p1.setNumber(10);
       p1.setPosition(9);
       p2.setName("tobias");
       p2.setLastName("luna");
       p2.setNumber(7);
       p2.setPosition(5);
       Team t1=new Team();
       ArrayList <Player> aux=new ArrayList();
       aux.add(p2);
       aux.add(p1);
       t1.setPlayers(aux);
        System.out.println(t1.toString());
       
    }
    
}
