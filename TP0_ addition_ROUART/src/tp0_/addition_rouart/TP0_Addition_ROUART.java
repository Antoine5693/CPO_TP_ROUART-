/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.addition_rouart;

import java.util.Scanner;

/**
 *
 * @author Rouart Antoine
 */
public class TP0_Addition_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nb; 
// nombre d'entiers à additionner
        int result; // resultat 
        int ind; //indice  // initialisation  
        result=0;  // addition des nb premiers entiers  
        ind=1; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");  
        nb=sc.nextInt(); 
        while (ind< nb) { 
        result=result+ind;  ind++; } 
        System.out.println("la somme des "+ nb + "  entiers est: "+result); }
  
    }
    

