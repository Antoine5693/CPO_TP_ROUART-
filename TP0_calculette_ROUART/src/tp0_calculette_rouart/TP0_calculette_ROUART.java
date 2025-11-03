/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette_rouart;

import java.util.Scanner;

/**
 *
 * @author Rouart Antoine
 */
public class TP0_calculette_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Choisis l operateur: "
                + "1) addition"
                + "2) soustraction "
                + "3) multiplication"
                + "4) division  "
                + "5) modulo ");
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        System.out.print("Entre la premiere valeur : ");
        int operande1 = (int) sc.nextDouble();
        System.out.print("Entrez la deuxieme valeur : ");
        int operande2 = (int) sc.nextDouble();     
        int resultat = 0; 
        switch (operateur) {
            case 1 -> {
                resultat = operande1 + operande2;
                System.out.println(resultat);
            }
            case 2 -> {
                resultat = operande1 - operande2;
                System.out.println(resultat);
            }
            case 3 -> {
                resultat = operande1 * operande2;
                System.out.println(resultat);
            }
            case 4 -> { 
        if (operande2 != 0) {
            resultat = operande1 / operande2;
            System.out.println("Resultat : " + resultat);
        } else {
            System.out.println("division par zéro !");
        }
    }
    case 5 -> {
        if (operande2 != 0) {
            resultat = operande1 % operande2;
            System.out.println("Resultat : " + resultat);
        } else {
            System.out.println("division par zéro !");
        }
 
