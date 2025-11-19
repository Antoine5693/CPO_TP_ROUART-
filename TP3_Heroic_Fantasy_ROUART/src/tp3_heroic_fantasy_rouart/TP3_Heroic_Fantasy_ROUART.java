/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_rouart;

/**
 *
 * @author Rouart Antoine
 */
import Personnage.Personnage;
import Personnage.Guerrier;
import Personnage.Magicien;
import Armes.Baton;
import Armes.Epee;
import Armes.Arme;
import java.util.ArrayList;
public class TP3_Heroic_Fantasy_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Epee Excalibur = new Epee ("Excalibur",7,5 );
         Epee Durandal = new Epee("Durandal",4,7);
         Baton Chene = new Baton("Chene",4, 5);
         Baton Charme = new Baton("Charme", 5, 6)  ;
         
         
         ArrayList<Arme> armes = new ArrayList<>();
          
             armes.add(Excalibur);
             armes.add(Durandal);
             armes.add(Chene) ;
             armes.add(Charme);
            
             for (Arme a: armes){
                 System.out.println(a);
             }
            int Taille = armes.size(); 
            System.out.println("\nNombre d'arme : " + Taille);
            
             
 
    Magicien gandalf = new Magicien("Gandalf",65,true);
    Magicien garcimore = new Magicien ("Garcimore",44,false);  
    
    Guerrier Conan = new Guerrier("Conan", 78,false) ;
    Guerrier Lannister = new Guerrier("Lannister", 45,true)  ;
    
    ArrayList<Personnage> perso = new ArrayList<>();
          
             perso.add(gandalf);
             perso.add(garcimore);
             perso.add(Conan);
             perso.add(Lannister);
            
            for (Personnage a: perso){
                 System.out.println(a);
             }
            int T = perso.size(); 
            System.out.println("\nNombre de perso : " + T);
            
            
    
}}
