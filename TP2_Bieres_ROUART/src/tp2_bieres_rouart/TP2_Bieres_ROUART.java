/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_rouart;

/**
 *
 * @author Rouart Antoine
 */
public class TP2_Bieres_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0 ,"Dubuisson");        
        uneBiere.lireEtiquette();
        BouteilleBiere deuxbiere = new BouteilleBiere("Leffe",6.6 ,"Abbaye de Leffe");
        deuxbiere.lireEtiquette();
        BouteilleBiere troibiere = new BouteilleBiere("8.6", 6 ,"Beerland");
        troibiere.lireEtiquette();
        BouteilleBiere quatrebiere = new BouteilleBiere("Diable", 100000 ,"Enfer");
        quatrebiere.lireEtiquette();
        BouteilleBiere cinqbiere = new BouteilleBiere("Dieu", 0 ,"Paradise");
        cinqbiere.lireEtiquette();
        System.out.println(uneBiere + "\n" + deuxbiere + "\n"+ troibiere +"\n"+ quatrebiere +"\n"+ cinqbiere);    
        troibiere.Decapsuler();
        uneBiere.Decapsuler();
        uneBiere.Decapsuler();
        System.out.println(uneBiere + "\n" + deuxbiere + "\n"+ troibiere +"\n"+ quatrebiere +"\n"+ cinqbiere);    
        
    }
    
}
