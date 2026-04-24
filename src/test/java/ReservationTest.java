import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ReservationTest {

    // Les objets qu'on va tester
    private Reservation reservation;
    private Passager passager;
    private Vol vol;

    // @BeforeEach → s'exécute AVANT chaque test
    // Permet de préparer les objets une seule fois
    @BeforeEach
    void setUp() {
        passager = new Passager("AB123", "P001", "Alice", "Paris", "0612345678");
        vol = new Vol("AF123", "Paris", "New York",
                "18/04/2025 10:00", "18/04/2025 22:00",
                "Prévu", null, null, null, new java.util.ArrayList<>());
        reservation = new Reservation(1, "18/04/2025", "En attente", vol, passager);
    }

    // ===== TEST 1 — Vérifier que le numéro de réservation est correct =====
    @Test
    void testNumeroReservation() {
        assertEquals(1, reservation.getNumeroReservation());
        // assertEquals(valeur attendue, valeur obtenue)
    }

    // ===== TEST 2 — Vérifier que confirmerReservation() change bien le statut =====
    @Test
    void testConfirmerReservation() {
        reservation.confirmerReservation();
        assertEquals("Confirmé", reservation.getStatut());
    }

    // ===== TEST 3 — Vérifier qu'annulerReservation() change bien le statut =====
    @Test
    void testAnnulerReservation() {
        reservation.annulerReservation();
        assertEquals("Annulé", reservation.getStatut());
    }

    // ===== TEST 4 — Vérifier que le passager est bien lié à la réservation =====
    @Test
    void testPassagerReservation() {
        assertEquals("Alice", reservation.getPassager().getNom());
    }

    // ===== TEST 5 — Vérifier que le vol est bien lié à la réservation =====
    @Test
    void testVolReservation() {
        assertEquals("AF123", reservation.getVol().getNumeroVol());
    }
}