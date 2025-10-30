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
        // TODO code application logic here        
        Random generateurAleat = new Random(); 
        int n = generateurAleat.nextInt(100); 
        Scanner scanner = new Scanner(System.in);
        int chiffre = -1;
        while (chiffre != n) {
        System.out.print("Entrez un nombre entre 0 et 100: ");
        chiffre = scanner.nextInt(); // Lecture d'une ligne de text
        if (n>chiffre){
            System.out.println("Trop petit");
        }
        
        else if (chiffre==n) {
        System.out.println("Tu as gagne");    
        }
        
        else{
            System.out.println("Trop grand");
        }
        
      }   
      scanner.close();
    }
    
}
