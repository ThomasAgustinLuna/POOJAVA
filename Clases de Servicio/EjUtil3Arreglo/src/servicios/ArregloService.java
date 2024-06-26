/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, 
en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package servicios;

import entidades.Arreglo;
import java.util.Arrays;

/**
 *
 * @author Tomas
 */
public class ArregloService {

    

    public void inicializarA(double[] a) {
        for (int i = 0; i < 50; i++) {
            a[i]=(int)(Math.random()*10);
        }
    }

    public void mostrar(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

    public void ordenar(double[] v) {
        Arrays.sort(v);
    }

    public void inicializarB(double[] a,double [] b) {
        for (int i = 0; i < 10; i++) {
            Arrays.fill(b, i, i+1, a[i]);
        }
        Arrays.fill(b, 10, 20, 0.5);
        
    }

}
