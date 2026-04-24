import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Listes globales
        ArrayList<Passager> passagers = new ArrayList<>();
        ArrayList<Vol> vols = new ArrayList<>();
        ArrayList<Avion> avions = new ArrayList<>();
        ArrayList<Aeroport> aeroports = new ArrayList<>();

        int choix = 0;

        while (choix != 7) {
            System.out.println("\n=== Système de Réservation ===");
            System.out.println("1. Créer un passager");
            System.out.println("2. Créer un aéroport");
            System.out.println("3. Créer un avion");
            System.out.println("4. Créer un vol");
            System.out.println("5. Réserver un vol");
            System.out.println("6. Afficher le rapport");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine(); // vide le buffer après nextInt()

            switch (choix) {

                case 1: // Créer un passager
                    System.out.print("Identifiant : ");
                    String id = sc.nextLine();
                    System.out.print("Nom : ");
                    String nom = sc.nextLine();
                    System.out.print("Adresse : ");
                    String adresse = sc.nextLine();
                    System.out.print("Contact : ");
                    String contact = sc.nextLine();
                    System.out.print("Numéro de passeport : ");
                    String passeport = sc.nextLine();

                    Passager p = new Passager(passeport, id, nom, adresse, contact);
                    passagers.add(p);
                    System.out.println("✅ Passager " + nom + " créé !");
                    break;

                case 2: // Créer un aéroport
                    System.out.print("Nom de l'aéroport : ");
                    String nomAero = sc.nextLine();
                    System.out.print("Ville : ");
                    String ville = sc.nextLine();
                    System.out.print("Description : ");
                    String description = sc.nextLine();

                    Aeroport aeroport = new Aeroport(nomAero, ville, description);
                    aeroports.add(aeroport);
                    System.out.println("✅ Aéroport " + nomAero + " créé !");
                    break;

                case 3: // Créer un avion
                    System.out.print("Immatriculation : ");
                    String immat = sc.nextLine();
                    System.out.print("Modèle : ");
                    String modele = sc.nextLine();
                    System.out.print("Capacité : ");
                    int capacite = sc.nextInt();
                    sc.nextLine();

                    Avion avion = new Avion(immat, modele, capacite, null);
                    avions.add(avion);
                    System.out.println("✅ Avion " + modele + " créé !");
                    break;

                case 4: // Créer un vol
                    if (avions.isEmpty() || aeroports.size() < 2) {
                        System.out.println("❌ Créez d'abord au moins 1 avion et 2 aéroports !");
                        break;
                    }

                    System.out.print("Numéro de vol : ");
                    String numVol = sc.nextLine();
                    System.out.print("Origine : ");
                    String origine = sc.nextLine();
                    System.out.print("Destination : ");
                    String destination = sc.nextLine();
                    System.out.print("Date/heure départ : ");
                    String depart = sc.nextLine();
                    System.out.print("Date/heure arrivée : ");
                    String arrivee = sc.nextLine();

                    Vol vol = new Vol(numVol, origine, destination,
                            depart, arrivee, "Prévu",
                            avions.get(0), aeroports.get(0),
                            aeroports.get(1), new ArrayList<>());
                    vols.add(vol);
                    avions.get(0).affecterVol(vol);
                    System.out.println("✅ Vol " + numVol + " créé !");
                    break;

                case 5: // Réserver un vol
                    if (passagers.isEmpty() || vols.isEmpty()) {
                        System.out.println("❌ Créez d'abord un passager et un vol !");
                        break;
                    }

                    System.out.print("Numéro de réservation : ");
                    int numResa = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Date de réservation : ");
                    String dateResa = sc.nextLine();

                    // On prend le premier passager et premier vol pour simplifier
                    passagers.get(0).reserverVol(numResa, dateResa, "En attente", vols.get(0));
                    System.out.println("✅ Réservation effectuée !");
                    break;

                case 6: // Rapport
                    Statistiques stats = new Statistiques(vols, passagers);
                    stats.genererRapport();
                    break;

                case 7:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("❌ Choix invalide !");
            }
        }
        sc.close();
    }
}