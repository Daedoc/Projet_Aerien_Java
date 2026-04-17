import java.util.ArrayList;

public class Vol {
    private String numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;
    private Avion avion;
    private Aeroport  aeroportDepart;
    private Aeroport aeroportArrivee;
    private ArrayList<Reservation> reservations;

    public Vol(){
        numeroVol = "";
        origine ="";
        destination="";
        dateHeureArrivee = "";
        dateHeureDepart ="";
        etat="";
        avion = null;
        aeroportArrivee = null;
        aeroportDepart = null;
        reservations = new ArrayList<>();
    }
    public Vol(String numeroVol, String origine,String destination,
               String dateHeureDepart,String dateHeureArrivee,String etat,
                Avion avion, Aeroport aeroportArrivee,Aeroport aeroportDepart,
               ArrayList<Reservation> reservations){
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
        this.avion =avion;
        this.aeroportDepart=aeroportDepart;
        this.aeroportArrivee=aeroportArrivee;
        this.reservations = new ArrayList<>();
    }

    public String getNumeroVol(){return numeroVol; }
    public String getOrigine(){return origine; }
    public String getDestination(){return destination; }
    public String getDateHeureDepart(){return dateHeureDepart;}
    public String getDateHeureArrivee(){return dateHeureArrivee; }
    public String getEtat(){return etat; }
    public Avion getAvion(){return avion; }
    public Aeroport getAeroportDepart(){return aeroportDepart; }
    public Aeroport getAeroportArrivee(){return aeroportArrivee; }
    public ArrayList<Reservation> getReservations(){return reservations; }

    public void setNumeroVol(String numeroVol){this.numeroVol=numeroVol; }
    public void setOrigine(String origine){this.origine=origine; }
    public void setDestination(String destination){this.destination=destination; }
    public void setDateHeureArrivee(String dateHeureArrivee){this.dateHeureArrivee=dateHeureArrivee; }
    public void setDateHeureDepart(String dateHeureDepart){this.dateHeureDepart=dateHeureDepart; }
    public void setEtat(String etat){this.etat=etat; }
    public void setAvion(Avion avion) {this.avion = avion;}
    public void setAeroportDepart(Aeroport aeroportDepart) {this.aeroportDepart = aeroportDepart;}
    public void setAeroportArrivee(Aeroport aeroportArrivee) {this.aeroportArrivee = aeroportArrivee;}
    public void setReservations(ArrayList<Reservation> reservations) {this.reservations = reservations;}

    public void planifierVol(ArrayList<Vol> planning){
        planning.add(this);
        System.out.println("Vol " +numeroVol+ " ajouté au planning");
    }
    public void annulerVol(){
        etat = "Annulé";
        System.out.println("Vol "+numeroVol+" a été "+etat);
    }
    public void modifierVol(String origine, String destination,String dateHeureDepart,
                            String dateHeureArrivee, String etat){
        setOrigine(origine);
        setDestination(destination);
        setDateHeureDepart(dateHeureDepart);
        setDateHeureArrivee(dateHeureArrivee);
        setEtat(etat);
        System.out.println("--- Le vol "+numeroVol+" a bien été modifié! ---");
    }
    public void listingPassenger(){
        System.out.println("--- Liste des passagers du vol "+numeroVol+" ---");
        for (int i = 0 ; i<reservations.size();i++){
            System.out.println(reservations.get(i).getPassager());
        }
    }

    @Override
    public String toString(){
        return "Numéro de Vol : "+numeroVol+
                "\nOrigine : "+origine+
                "\nDestination : "+destination+
                "\nHeure de Départ : "+dateHeureDepart+
                "\nHeure d'arrivée : "+dateHeureArrivee+
                "\nEtat : "+etat+
                "\nAvion : "+avion+
                "\nAéroport de Départ : "+aeroportDepart+
                "\nAéroport d'arrivée : "+aeroportArrivee+
                "\nRéservations : "+reservations;
    }




}
