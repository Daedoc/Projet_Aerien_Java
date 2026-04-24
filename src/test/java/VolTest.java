import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class VolTest {

    private Vol vol;

    @BeforeEach
    void setUp() {
        vol = new Vol("AF123", "Paris", "New York",
                "18/04/2025 10:00", "18/04/2025 22:00",
                "Prévu", null, null, null, new ArrayList<>());
    }

    // ===== TEST 1 — Vérifier le numéro de vol =====
    @Test
    void testNumeroVol() {
        assertEquals("AF123", vol.getNumeroVol());
    }

    // ===== TEST 2 — annulerVol() change l'état à "Annulé" =====
    @Test
    void testAnnulerVol() {
        vol.annulerVol();
        assertEquals("Annulé", vol.getEtat());
    }

    // ===== TEST 3 — Vérifier origine et destination =====
    @Test
    void testOrigineDestination() {
        assertEquals("Paris", vol.getOrigine());
        assertEquals("New York", vol.getDestination());
    }
}