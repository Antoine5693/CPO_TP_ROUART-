/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_rouart;

import java.util.Random;
import java.util.Scanner;

public class TP1_stats_ROUART {
    public static void main(String[] args) {
        int[] faces = new int[6];       
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien de lancers ? ");
        int m = sc.nextInt();
        Random generateurAleat = new Random();
        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);        
            faces[tirage]++; 
        }
        System.out.println("\nResultats des lancers :");
        for (int i = 0; i < faces.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois");
        }
        sc.close();
    }
}
