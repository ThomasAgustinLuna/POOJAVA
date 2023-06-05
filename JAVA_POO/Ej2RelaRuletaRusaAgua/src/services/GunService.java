/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Gun;
import java.util.Random;


public class GunService {
    public Gun gunLoader(){
        Gun g=new Gun();
        Random r=new Random();
        g.setActualPoss(r.nextInt(6));
        g.setWaterPoss(r.nextInt(6));
        return g;
    }
    
    public boolean wet(Gun g){
        return g.getActualPoss()==g.getWaterPoss();
    }
    
    public void nextShoot(Gun g){
        if (g.getActualPoss()==5) {
            g.setActualPoss(0);
        }else{
            g.setActualPoss(g.getWaterPoss()+1);
        }
        
    }
    
    public void toString(Gun g){
        g.toString();
    }
    
    
    
}
