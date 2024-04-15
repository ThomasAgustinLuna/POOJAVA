/*
  Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicio;

import entidad.BarajaEntidad;
import entidad.CartasEntidad;
import enumsCartas.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author thell
 */
public class BarajaService {

    BarajaEntidad mazoCompleto = new BarajaEntidad();//creo un objeto para todas las cartas
    BarajaEntidad mazoIncompleto = new BarajaEntidad();//creo un objeto para las cartas entregadas
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public BarajaEntidad mazo() {
        System.out.println("preparando el mazo");
        ArrayList<CartasEntidad> cartanueva = new ArrayList();//este array es para cargar las cartas

        //recorro el enum 
        for (Palo aux : Palo.values()) {
// recorro y cargo las cartas
            for (int i = 0; i < 12; i++) {
                if (i + 1 != 8 && i + 1 != 9) {//asi obviamos los 8 y 9

                    CartasEntidad cards = new CartasEntidad(i + 1, aux);
                    cartanueva.add(cards);

                }

            }
        }
        mazoCompleto.setCartas(cartanueva);
        System.out.println("mazo completo");
        System.out.println(mazoCompleto.getCartas().toString());// muestro el mazo completo
        return mazoCompleto;
    }

    public void mezclar() {//mezclamos las cartas

        Collections.shuffle((List<?>) mazoCompleto.getCartas());
        System.out.println("mazo mezclado: " + mazoCompleto.toString());

    }
private ArrayList<CartasEntidad> entregada = new ArrayList<>(); // este array es para ver las cartas entregadas
    public void siguienteCarta() {
 
  entregada.add(mazoCompleto.getCartas().get(0));
              mazoIncompleto.setCartas(entregada);
              mazoCompleto.getCartas().remove(0);
   
    }

    public void darCartas() {
      
        int rta;

        System.out.println("cuantas cartas queres?");
        rta = leer.nextInt();
        if (mazoCompleto.getCartas().size() > rta) {
            for (int i = 0; i < rta; i++) {

                siguienteCarta();
            
            }
        } else {
            System.out.println("no hay mas cartas");
        }
 System.out.println("sus cartas son: "+ mazoIncompleto.getCartas().toString() );
    }

    public void cartasDisponibles() {

        System.out.println("sus cartas disponibles son:  " + mazoCompleto.getCartas().size());

    }
    public void cartasMonton(){
        System.out.println( "se entregaron estas cartas"+entregada.toString());
    }
    public void cartasBaraja(){
        System.out.println( "te quedan estas cartas"+mazoCompleto);
    }

}
