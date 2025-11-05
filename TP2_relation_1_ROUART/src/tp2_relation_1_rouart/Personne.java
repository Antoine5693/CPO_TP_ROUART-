/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_rouart;

/**
 *
 * @author Rouart Antoine
 */
public class Personne {
    String nom;
    String pseudo;
    

    public Personne(String nom, String pseudo) {
        this.nom = nom;
        this.pseudo = pseudo;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", pseudo=" + pseudo + '}';
    }
    
    

        
            
}
