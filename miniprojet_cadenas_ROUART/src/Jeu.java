import java.util.Random;

public class Jeu {

     int[] combinaisonSecrete = new int[4];
  

    public Jeu() {
        genererNouvelleCombinaison();
    }


    private void genererNouvelleCombinaison() {
        Random r = new Random();
        for (int i = 0; i < combinaisonSecrete.length; i++) {
         combinaisonSecrete[i] = r.nextInt(10);
         }
        
    }

  
   

    public int[] getCombinaisonSecrete() {
        return combinaisonSecrete;
    }}

    