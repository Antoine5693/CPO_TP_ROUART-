/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_rouart;

/**
 *
 * @author Rouart Antoine
 */
public class TP2_manip_ROUART {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ;
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
        
        System.out.println("Avant echange :");
        System.out.println("nb de calories de Assiette 1 " + assiette1.nbCalories );
        System.out.println("nb de calories de Assiette 2 " + assiette2.nbCalories );

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\nApres echange :");
        System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);        
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
        
        
        Moussaka[] tabMoussaka = new Moussaka[10];


        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(400); 
        }
        for (int i = 0; i < tabMoussaka.length; i++) {
    System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
} 
 
        
    }
    
}