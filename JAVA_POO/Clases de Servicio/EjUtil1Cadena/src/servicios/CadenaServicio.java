/*
Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena CrearCadena() {
        Cadena cad = new Cadena();
        System.out.println("Por favor ingrese la frase");
        cad.setFrase(leer.nextLine());

        return cad;
    }

    public int mostrarVocales(Cadena cad) {
        int vocales = 0;

        if (cad.getFrase().equalsIgnoreCase("a") || cad.getFrase().equalsIgnoreCase("e") || cad.getFrase().equalsIgnoreCase("i") || cad.getFrase().equalsIgnoreCase("o") || cad.getFrase().equalsIgnoreCase("u")) {
            vocales++;
        }

        return vocales;
    }
    
//    public void mostrarVocales(Cadena c1) {
//        char[] vector = c1.getFrase().toCharArray();
//        int cont = 0;
//        for (int i = 0; i < c1.getLongitud(); i++) {
//            System.out.print(vector[i]);
//        }
//        System.out.println("");
//        for (int i = 0; i < c1.getLongitud(); i++) {
//            if (vector[i] == ('a') || vector[i] == ('e') || vector[i] == ('i') || vector[i] == ('o') || vector[i] == ('u')){
//                cont++;
//            }
//        }
//        System.out.println(cont);
//    }

    public void invertirFrase(Cadena cad) {
        String[] fras = new String[cad.getFrase().length()];
        for (int i = 0; i < cad.getFrase().length(); i++) {
            fras[i]=cad.getFrase().substring(i, i+1).toLowerCase();
        }
        System.out.println("La frase invertida quedaria...");
        for (int i = cad.getFrase().length() - 1; i >= 0; i--) {
            System.out.print(fras[i]);
        }
        System.out.println("");

    }

    public void vecesRepetido(Cadena cad) {
        System.out.println("Por favor ingrese el caracter que desea corroborar");
        String car=leer.next();
        String[] fras = new String[cad.getFrase().length()];
        int carCont=0;
        boolean repite=false;
        for (int i = 0; i < cad.getFrase().length(); i++) {
            fras[i]=cad.getFrase().substring(i, i+1).toLowerCase();
            if (fras[i].equalsIgnoreCase(car)&&repite==false) {
                repite=true;
            }else if(fras[i].equalsIgnoreCase(car)&&repite){
                carCont++;
            }
        }
        System.out.println("El caracter ingresado se repite en la frase: "+carCont+" vez/ces");
        
    }
    
    public void compararLongitud(Cadena cad1,Cadena cad2){
        if (cad1.getFrase().length()>cad2.getFrase().length()) {
            System.out.println("La primer frase es mayor a la segunda");
        }else{
            System.out.println("La segunda frase es mayor a la primera");
        }
    }

    public void unirFrases(Cadena cad1,Cadena cad2){
        
        String frase;
        frase=cad1.getFrase().concat(cad2.getFrase());
        System.out.println("Las dos frases unidas quedarian...");
        System.out.println(frase);
        
    }
    
    public void remplazar(Cadena cad){
        System.out.println("Por favor ingrese el caracter especial por el cual se remplazaran todas las A de su frase");
        String cha=leer.next();
        String []fras=new String[cad.getFrase().length()];
        for (int i = 0; i < cad.getFrase().length(); i++) {
            fras[i]=cad.getFrase().substring(i, i+1).toLowerCase();
            if (fras[i].equalsIgnoreCase("a")) {
                fras[i]=cha;
            }
        }
        System.out.println("La frase quedaria...");
        for (int i = 0; i < cad.getFrase().length(); i++) {
            System.out.print(fras[i]);
        }
        System.out.println("");
    }
    
    public boolean contiene(Cadena cad){
        
        String letra=leer.next();
        System.out.println("La frase contiene la letra "+letra+"?");
        
        String []fras=new String[cad.getFrase().length()];
        for (int i = 0; i < cad.getFrase().length(); i++) {
            fras[i]=cad.getFrase().substring(i, i+1).toLowerCase();
            if (fras[i].equalsIgnoreCase(letra)) {
                return true;
            }
        }
          
        return false;
    }
    
    
}
