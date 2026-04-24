import java.util.ArrayList;

public class Statistiques {
    private ArrayList<Vol> vols;
    private ArrayList<Passager> passagers;

    public Statistiques(ArrayList<Vol> vols, ArrayList<Passager> passagers) {
        this.vols = vols;
        this.passagers = passagers;
    }

    // Retourne le nombre total de vols
    public int nombreDeVols() {
        return vols.size();
    }

    // Retourne le nombre total de passagers
    public int nombreDePassagers() {
        return passagers.size();
    }

    // Affiche les destinations et combien de fois elles apparaissent
    public void destinationsPopulaires() {
        System.out.println("--- Destinations les plus populaires ---");
        for (int i = 0; i < vols.size(); i++) {
            System.out.println("Destination : " + vols.get(i).getDestination()
                    + " | Vol : " + vols.get(i).getNumeroVol());
        }
    }

    // Génère un rapport complet
    public void genererRapport() {
        System.out.println("========== RAPPORT ==========");
        System.out.println("Nombre de vols : " + nombreDeVols());
        System.out.println("Nombre de passagers : " + nombreDePassagers());
        destinationsPopulaires();
        System.out.println("=============================");
    }
}