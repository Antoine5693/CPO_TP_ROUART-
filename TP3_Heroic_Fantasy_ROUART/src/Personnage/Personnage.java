/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;
import Armes.*;
import java.util.ArrayList;
/**
 *
 * @author Rouart Antoine
 */
public abstract class Personnage {
    String nom;
    int PV;
    Arme Arme_en_Main = null;

    public Personnage(String nom, int PV) {
        this.nom = nom;
        this.PV = PV;
    }
    
    ArrayList<Arme> TabA = new ArrayList<>();   
    int Taille1 = TabA.size();
    
    public void ajouteArme(Arme newArme){     
    if (Taille1 <= 5) {
       TabA.add(newArme);}
    else{
       System.out.println("Deja 5 armes");}    
    } 
    
    public void equiperArme(Arme nomArme) {
    for (Arme a: TabA){
            if (a==nomArme){
                Arme_en_Main=nomArme;  
                }}        
    }           

    public Arme getArme_en_Main() {
        return Arme_en_Main;
        
        
    }

    @Override
    public String toString() {
        return "Personnage{" + "nom=" + nom + ", PV=" + PV + ", Arme_en_Main=" + Arme_en_Main + ", TabA=" + TabA + ", Taille1=" + Taille1 + '}';
    }
}

             

   
