
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maty
 */
public class Baraja {
    Scanner leer = new Scanner(System.in);
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> auxiliar = new ArrayList();
    private int cont = 0;
    private int pedidas;
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("---El trucardo---");
            System.out.println("Elegí lo que querés hacer pibe");
            System.out.println("1- Mezclar.");
            System.out.println("2- Mostrar cartas disponibles.");
            System.out.println("3- Repartir.");
            System.out.println("4- Mostrar todas las cartas.");
            System.out.println("5- Mostrar cartas ya usadas.");
            System.out.println("6- Salir");
            System.out.println("");
            
        opcion = leer.nextInt();
        switch (opcion){
           case 1:  
               barajar();
               break;
           case 2:
               cartasDisponibles();
               break;
           case 3:
               darCartas();
               break;
           case 4:
               mostrarBaraja();
               break;
           case 5:
               cartasMonton();
               break;
           case 6:
               System.out.println("Gracias por jugar ameo :)");
               break;
        }} while (opcion < 6);
    }
    
    public Baraja() {
        //La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
        cartas =new ArrayList ();
        String[] palo= {"ESPADAS","BASTOS","OROS","COPAS"};
        int[] numeracion={1,2,3,4,5,6,7,10,11,12};//del 0 al 9
       
        for (int i = 0; i < 4; i++) {
            //recorro palo
            String auxPalo= palo[i];
            for (int j = 0; j<10; j++) {
                //recorro numeracion
                int auxNum= numeracion[j];
                cartas.add(new Carta(auxNum,auxPalo));
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(cartas);
        System.out.println("¡Cartas mezcladas!");
    }
    
    public void siguienteCarta() {
        System.out.println(cartas.get(0));
        auxiliar.add(cartas.get(0));
        cartas.remove(0);
        cont++;
    }
    
    public void cartasDisponibles() {
        System.out.println("Cartas disponibles:" + (40 - cont));
    }
    
    public void darCartas() { 
        System.out.print("Cartas a pedir: ");
        pedidas = leer.nextInt();
        if (cartas.size() > pedidas) {
            for (int i = 0; i < pedidas; i++) {
                siguienteCarta();
            }
        } else {
            System.out.println("No hay mas cartas.");
        }
    }
    
    public void cartasMonton() {
        Iterator <Carta> it2 = auxiliar.iterator();
        boolean band = false;
        while (it2.hasNext()) {
            Carta next = it2.next();
            System.out.println(next.toString());
            band = true;
        } 
        
        if (band == false) {
            System.out.println("Todavia no se han dado cartas.");
        }
    }
    
    public void mostrarBaraja() {
        System.out.println(cartas);
    }
}