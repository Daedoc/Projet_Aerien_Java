import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class PassagerTest {

    private Passager passager;
    private Vol vol;

    @BeforeEach
    void setUp() {
        passager = new Passager("AB123", "P001", "Alice", "Paris", "0612345678");
        vol = new Vol("AF123", "Paris", "New York",
                "18/04/2025 10:00", "18/04/2025 22:00",
                "Prévu", null, null, null, new ArrayList<>());
    }

    // ===== TEST 1 — Liste réservations vide au départ =====
    @Test
    void testListeReservationsVide() {
        assertTrue(passager.getReservations().isEmpty());
        // assertTrue → vérifie que la condition est VRAIE
    }

    // ===== TEST 2 — Après reserverVol(), la liste a 1 élément =====
    @Test
    void testReserverVol() {
        passager.reserverVol(1, "18/04/2025", "En attente", vol);
        assertEquals(1, passager.getReservations().size());
    }

    // ===== TEST 3 — Après annulerReservation(), la liste est vide =====
    @Test
    void testAnnulerReservation() {
        passager.reserverVol(1, "18/04/2025", "En attente", vol);
        passager.annulerReservation(1);
        assertTrue(passager.getReservations().isEmpty());
    }

    // ===== TEST 4 — Vérifier le passeport =====
    @Test
    void testPasseport() {
        assertEquals("AB123", passager.getPasseport());
    }
}