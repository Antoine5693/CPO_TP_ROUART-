/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_rouart;

/**
 *
 * @author Rouart Antoine
 */
public class Voiture {
    String modele;
    String marque;
    int nbVoiture;   
    String Proprietaire; 

    public Voiture(String nom, String marque, int nbVoiture) {
        this.modele = nom;
        this.marque = marque;
        this.nbVoiture = nbVoiture;      
    }

    @Override
    public String toString() {
        return "Voiture{" + "modele=" + modele + ", marque=" + marque + ", nbVoiture=" + nbVoiture + '}';
    }

    
    
}
