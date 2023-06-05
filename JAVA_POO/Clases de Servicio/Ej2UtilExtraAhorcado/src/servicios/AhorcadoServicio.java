/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con la palabra del 
usuario, pone la longitud de la palabra, como la longitud del vector. Después ingresa la palabra en 
el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. Y también, 
guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa 
el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada 
es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false 
si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus 
oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e 
informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará 
en el main.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class AhorcadoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int longi;
    private String[] aux=new String[longi];
    public Ahorcado crearJuego(){
        Ahorcado ah=new Ahorcado();
        System.out.println("Por favor ingrese la palabra a adivinar");
        String palabra=leer.next();
        longi=palabra.length();
        String[]aux=new String[longi];
        for (int i = 0; i < longi; i++) {
            aux[i]=palabra.substring(i,(i+1));
        }
        ah.setPalabra(aux);
        System.out.println("Por favor ingrese cantidad de jugadas maximas");
        ah.setCantJ(leer.nextInt());
        
        return ah;
    }
    
    public void longitud(){
        System.out.println("El largo de la palabra es de:"+longi);
    }
//    Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada 
//es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscarLetra(Ahorcado ah){
        System.out.println("por favor jugador ingrese la letra a adivinar en el ahorcado");
        String letra=leer.next();
       boolean band=false;
       int cont =0;
        for (int i = 0; i < longi; i++) {
            if (ah.getPalabra()[i].equalsIgnoreCase(letra)) {
                band=true;
                cont++;
                aux[i]=letra;
            }
            
        }
        
        if (band) {
            System.out.println("Bien! la letra estaba "+cont+" vez/ces");
        }else{
            System.out.println(" :( la letra no estaba.");
            
        }
        
    }
    
//    Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
//sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false 
//si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus 
//oportunidades.
    
    public boolean encontradasLetras(){
        
        
        return true;
    }
    
    
    

    
}
