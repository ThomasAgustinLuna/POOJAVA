/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 */
public class Ej3ExtraGuia5 {

    /**
     * Crear una función que rellene un vector con números aleatorios,
     * pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
     */
    
    public static void LlenarVector(int[] vec, int dimension){
        
        
        for (int i = 0; i < dimension ; i++) {
            vec[i] = (int) (Math.random()*10);
        }
        
    }
    
    public static void ImprimirVector(int[] vec, int dimension){
            
        for (int i = 0; i < dimension; i++) {
            System.out.print("[  " + vec[i] + "  ]" );
        }
        
    }
    
    public static void main(String[] args) {
        int dimen = 5;
        int[] vector = new int[5];
        
        LlenarVector(vector, dimen);
               
        ImprimirVector(vector, dimen);      
 
    }
    
}
