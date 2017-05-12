/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;


import java.io.Serializable {
/**
 *
 * @author blakejensen
 */
public class Player implements Serializable{
    private  String name;
    private double bestDistance; 
    
    public Player () {
    }
    
    public String getName() {
        return name;
    }
    
   public void setName (String name) {
       this.name = name;
   }
   s
   public double getBestDistance() {
       return bestDistance;
   }
   
   public void setBestDistance(double bestDistance){
       this.bestDistance= bestDistance;
   }
   
}

}