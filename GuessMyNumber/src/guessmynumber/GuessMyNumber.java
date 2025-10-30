/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber;

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
        System.out.print("Entrez un nombre entre 0 et 100: ");
        int chiffre = scanner.nextInt(); // Lecture d'une ligne de text
        if (n>chiffre){
            System.out.println(" trop petit /n le Nombre etait:" + n);
        }
        else if (chiffre==n) {
        System.out.println(" tu as gagne /n le Nombre etait:" + n);
    }
        else{
            System.out.println(" trop grand /n le Nombre etait:" + n);
        }
            
    }
    
}
