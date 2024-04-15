/*

Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaices() y si devolvió́ true, imprime las 2 posibles soluciones.


 */
package Servicios;

import Entity.Raiz;

/**
 *
 * @author play_
 */
public class RaizServicio {
   public double getDiscriminante(Raiz p){
       double asd = Math.pow(p.getB(),2) - (4 * p.getA() * p.getC()) ;
       p.setDiscriminante(asd);
       return asd;
   }     
   
   public Boolean tieneRaices(Raiz p){
       
       return p.getDiscriminante() >= 0;
   }
   
   public Boolean tieneRaiz(Raiz p){
  
       return p.getDiscriminante() == 0;
   }
   
   public void obtieneRaices(Raiz p){
       double positiva =  (-p.getB())+ Math.sqrt(Math.pow(p.getB(),2) - (4 * p.getA() * p.getC()))/2* p.getA();
       double negativo =  (-p.getB())- Math.sqrt(Math.pow(p.getB(),2) - (4 * p.getA() * p.getC()))/2* p.getA();    
      if(tieneRaices(p)){
          System.out.println("x1 : " + positiva);
          System.out.println("x2 : " + negativo);
      } 
   }
      public void obtieneRaiz(Raiz p){
          double resultado = - p.getB() / 2 * p.getA();
      if(tieneRaiz(p)){
          System.out.println("x: " + resultado);
      } 
   }
    public void calcular(Raiz p){  
            if(tieneRaiz(p)){
               obtieneRaiz(p);
            }
            if(tieneRaices(p)){
               obtieneRaices(p);
            }
            if(p.getDiscriminante() < 0){
                System.out.println("No tiene raices");
            }
    }
}
