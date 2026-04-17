import java.util.ArrayList;

public class Main {
    public  static  void main (String[] args) {
        // 1. Créer des aéroports
        Aeroport cdg = new Aeroport("Charles de Gaulle", "Paris", "Aéroport principal de Paris");
        Aeroport jfk = new Aeroport("JFK", "New York", "Aéroport international de New York");

        // 2. Créer un avion
        Avion avion1 = new Avion("F-GKXJ", "Airbus A320", 180, null);

        // 3. Créer un vol
        Vol vol1 = new Vol("AF123", "Paris", "New York",
                "18/04/2025 10:00", "18/04/2025 22:00",
                "Prévu", avion1, cdg, jfk, new ArrayList<>());

        // 4. Affecter l'avion au vol
        avion1.affecterVol(vol1);

        // 5. Vérifier la disponibilité de l'avion
        avion1.verifierDisponibilite();
        Passager p1 = new Passager("AB123456", "P001",
                "Alice", "Paris", "0612345678");
        p1.reserverVol(1, "18/04/2025", "En attente",
                vol1);
        p1.getReservations().get(0).confirmerReservation();
    }
}
