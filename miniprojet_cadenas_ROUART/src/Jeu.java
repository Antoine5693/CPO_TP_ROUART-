import java.util.Random;

public class Jeu {

     int[] combinaisonSecrete = new int[4];
     int nombreTentativesMax = 10;
     int tentativesEffectuees = 0;

    public Jeu() {
        genererNouvelleCombinaison();
    }


    private void genererNouvelleCombinaison() {
        Random r = new Random();
        for (int i = 0; i < nombreTentativesMax; i++) {
            combinaisonSecrete[i] = r.nextInt(10); 
        }
        tentativesEffectuees = 0; 
    }

     public void verifierTentative(int val1, int val2, int val3, int val4) {
        int[] user = {val1, val2, val3, val4};
        int exact = 0;
        int tropHaut = 0;
        int tropBas = 0;

        for (int i = 0; i < combinaisonSecrete.length; i++) {
            if (user[i] == combinaisonSecrete[i]) {
                exact++;
            } else if (user[i] > combinaisonSecrete[i]) {
                tropHaut++;
            } else {
                tropBas++;
            }
        }
    
        System.out.println("Exact : " + exact);
        System.out.println("Trop haut : " + tropHaut);
        System.out.println("Trop bas : " + tropBas);

        if (exact == 4) {
            System.out.println("Félicitations ! Vous avez trouvé la combinaison !");
        }
    }
    private boolean estPerdu() {
        return tentativesEffectuees >= nombreTentativesMax;
    }
  
    public int getTentativesRestantes() {
        return nombreTentativesMax - tentativesEffectuees;
    }

    public int[] getCombinaisonSecrete() {
        return combinaisonSecrete;
    }

    