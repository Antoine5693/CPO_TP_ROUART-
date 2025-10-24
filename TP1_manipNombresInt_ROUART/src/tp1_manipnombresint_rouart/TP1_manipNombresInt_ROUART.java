package tp1_manipnombresint_rouart;

import java.util.Scanner;

public class TP1_manipNombresInt_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Entrez un nombre : ");
        int V1 = sc.nextInt();
                
        System.out.print("Entrez un nombre : ");
        int V2 = sc.nextInt();
        
        int Somme = V2 + V1;
        int Prod = V2 * V1;
        int Diff = V1 - V2;
        System.out.print("Voici la somme :" + Somme );
        System.out.print("  Voici le produit :" + Prod);
        System.out.print("  Voici la difference :" + Diff);
        if (V2!=0) {
            int quotient = V1/V2;
            int reste =V1%V2;
            System.out.println(" Le quotient est " + quotient);
            System.out.println(" le reste est " + reste);        
        } else {
            System.out.println(" Division par 0");
        }       
        sc.close();
    }
    
}
