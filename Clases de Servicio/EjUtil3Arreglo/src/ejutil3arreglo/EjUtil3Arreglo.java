/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, 
en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package ejutil3arreglo;

import servicios.ArregloService;

public class EjUtil3Arreglo {

   
    public static void main(String[] args) {
        double[]a=new double[50];
        double[]b= new double[20];
        ArregloService as=new ArregloService();
       
        as.inicializarA(a);
        System.out.println("Asi quedo A");
        as.mostrar(a);
        System.out.println("Si lo ordenamos");
        as.ordenar(a);
        as.mostrar(a);
        System.out.println("Ahora inicializamos b");
        as.inicializarB(a, b);
        System.out.println("Asi quedo A");
        as.mostrar(a);
        System.out.println("Asi quedo B");
        as.mostrar(b);
        
    }
    
}
