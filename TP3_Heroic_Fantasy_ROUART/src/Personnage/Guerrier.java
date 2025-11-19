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

    public Guerrier(String nom,int PV, Boolean cheval ) {
        super(nom, PV);
        this.cheval = cheval;
    }

    public void setCheval(Boolean cheval) {
        this.cheval = cheval;
    }
    
}
