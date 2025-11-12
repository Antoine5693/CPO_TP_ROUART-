/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_rouart;

/**
 *
 * @author Rouart Antoine
 */
public abstract class Arme {
    int NA;
    String nom;

    public Arme(int NA, String nom) {
        if (NA > 100) {
            System.out.println("Valeur > 100");
        }  
                else {
        this.NA = NA;        
    }
    this.nom = nom;}

    @Override
    public String toString() {
        return "Arme{" + "NA=" + NA + ", nom=" + nom + '}';
    }
        
}
