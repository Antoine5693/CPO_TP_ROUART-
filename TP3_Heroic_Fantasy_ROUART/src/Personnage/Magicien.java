/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author Rouart Antoine
 */
public class Magicien extends Personnage {
    Boolean comfirmé;
    static int nbMagicien=0;
    public Magicien(String nom,int PV, Boolean comfirmé ) {
        super(nom, PV);
        this.comfirmé = comfirmé;
        nbMagicien++;
    }

    public static int getNbMagicien() {
        return nbMagicien;
    }

    public void setComfirmé(Boolean comfirmé) {
        this.comfirmé = comfirmé;
    }
    
}
