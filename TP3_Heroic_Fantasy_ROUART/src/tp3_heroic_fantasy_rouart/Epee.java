/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_rouart;

/**
 *
 * @author Rouart Antoine
 */
public class Epee extends Arme {
   int finesse;
    public Epee(String nom,int NA, int finesse) {
        super(NA, nom);
        if (finesse > 100) {
            System.out.println("épéé émoussé");
        }  
                else {
                this.finesse = finesse;}
    }

    @Override
    public String toString() {        
        return  "\nnom : " + nom +"\nniveau d'attaque " + NA + " \nfinesse = " + finesse  ;
    }

 
    }
    
    

