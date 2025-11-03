/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP1_guessMyNumber_ROUART;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rouart Antoine
 */
public class GuessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choisissez un niveau de difficulté :");
            System.out.println("1) Facile");
            System.out.println("2) Normal");
            System.out.println("3) Difficile");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();
            
            int max = 100;
            int limiteCoups = Integer.MAX_VALUE; // infini par défaut
            boolean aide = false;
            
            switch (choix) {
                case 1 -> {
                    max = 100;
                    aide = true;
                    System.out.println("Mode facile choisi !");
                }
                case 2 -> {
                    max = 500;
                    limiteCoups = 10;
                    System.out.println("Mode normal choisi !");
                }
                case 3 -> {
                    max = 1000;
                    limiteCoups = 7;
                    System.out.println("Mode difficile choisi !");
                }
                default -> System.out.println("Choix invalide, mode facile par défaut.");
            }
            
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(max + 1);
            
            int chiffre = -1;
            int tentatives = 0;
            
            while (chiffre != n && tentatives < limiteCoups) {
                System.out.print("Entrez un nombre entre 0 et " + max + " : ");
                chiffre = scanner.nextInt();
                tentatives++;
                
                if (chiffre < n) {
                    if (aide && (n - chiffre) > max / 2) {
                        System.out.println("Vraiment trop petit !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                }
                else if (chiffre > n) {
                    if (aide && (chiffre - n) > max / 2) {
                        System.out.println("Vraiment trop grand !");
                    } else {
                        System.out.println("Trop grand !");
                    }
                }
                else {
                    System.out.println("Tu as gagné !");
                    System.out.println("Nombre de tentatives : " + tentatives);
                    break;
                }
                
                if (tentatives == limiteCoups && chiffre != n) {
                    System.out.println("Nombre de tentatives épuisé ! Le nombre était : " + n);
                }
           
            }}}}


