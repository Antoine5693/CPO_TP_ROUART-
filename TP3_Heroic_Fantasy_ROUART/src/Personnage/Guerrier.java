/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

/**
 *
 * @author Rouart Antoine
 */
public class Guerrier extends Personnage{
    Boolean cheval;
    static int nbGuerrier=0;

    public Guerrier(String nom,int PV, Boolean cheval ) {
        super(nom, PV);
        this.cheval = cheval;
        nbGuerrier++;
    }

    public void setCheval(Boolean cheval) {
        this.cheval = cheval;
    }
    
    public static int nbGuerrier(){
        return nbGuerrier;    
    }
    
}
