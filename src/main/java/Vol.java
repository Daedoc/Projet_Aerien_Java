import java.util.ArrayList;

public class Vol {
    public String numeroVol;
    public String origine;
    public String destination;
    public String dateHeureDepart;
    public String dateHeureArrivée;
    public String etat;


    Avion avion;
    Aeroport  aeroportDepart;
    Aeroport aeroportArrivee;
    ArrayList<Reservation> reservations;
}
