import java.io.*;
import java.util.ArrayList;

public class GestionFichiers {

    // ============ LECTURE — Importer les vols depuis un CSV ============
    public static void importerVols(String cheminFichier, ArrayList<Vol> vols) {
        try (BufferedReader reader = new BufferedReader(new FileReader(cheminFichier))) {

            String ligne;
            reader.readLine(); // ← Saute la première ligne (en-tête)

            while ((ligne = reader.readLine()) != null) {
                String[] valeurs = ligne.split(";"); // ← Découpe la ligne

                Vol vol = new Vol(
                        valeurs[0], // numeroVol
                        valeurs[1], // origine
                        valeurs[2], // destination
                        valeurs[3], // dateHeureDepart
                        valeurs[4], // dateHeureArrivee
                        valeurs[5], // etat
                        null,        // avion (pas dans le CSV)
                        null,        // aeroportDepart
                        null,        // aeroportArrivee
                        new ArrayList<>() // reservations vide
                );
                vols.add(vol);
            }
            System.out.println("--- Vols importés avec succès !");

        } catch (IOException e) {
            System.err.println("--- Erreur lecture : " + e.getMessage());
        }
    }

    // ============ ÉCRITURE — Sauvegarder une réservation ============
    public static void sauvegarderReservation(String cheminFichier, Reservation r) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cheminFichier, true))) {

            writer.write(
                    r.getNumeroReservation() + ";" +
                            r.getDateReservation() + ";" +
                            r.getStatut() + ";" +
                            r.getPassager().getNom() + ";" +
                            r.getVol().getNumeroVol()
            );
            writer.newLine(); // ← Saut de ligne après chaque réservation
            System.out.println("--- Réservation sauvegardée ! ---");

        } catch (IOException e) {
            System.err.println("--- Erreur écriture : " + e.getMessage());
        }
    }

    // ============ LECTURE — Exporter les vols vers un CSV ============
    public static void exporterVols(String cheminFichier, ArrayList<Vol> vols) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(cheminFichier))) {

            // Écrire l'en-tête
            writer.write("numeroVol;origine;destination;dateHeureDepart;dateHeureArrivee;etat");
            writer.newLine();

            // Écrire chaque vol
            for (Vol vol : vols) {
                writer.write(
                        vol.getNumeroVol() + ";" +
                                vol.getOrigine() + ";" +
                                vol.getDestination() + ";" +
                                vol.getDateHeureDepart() + ";" +
                                vol.getDateHeureArrivee() + ";" +
                                vol.getEtat()
                );
                writer.newLine();
            }
            System.out.println("--- Vols exportés avec succès ! ---");

        } catch (IOException e) {
            System.err.println("--- Erreur export : " + e.getMessage());
        }
    }
}