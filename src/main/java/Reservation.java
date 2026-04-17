public class Reservation {
    private int numeroReservation;
    private String dateReservation;
    private String statut;
    private Vol vol;
    private Passager passager;

    public Reservation() {
        numeroReservation =0;
        dateReservation = "";
        statut = "";
    }
    public Reservation (int numeroReservation, String dateReservation,String statut, Vol vol, Passager passager){
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
        this.vol = vol ;
        this.passager = passager;
    }

    public int getNumeroReservation() {
        return numeroReservation;
    }
    public String getDateReservation() {
        return dateReservation;
    }
    public String getStatut() {
        return statut;
    }
    public  Vol getVol(){return vol;}
    public Passager getPassager(){
        return  passager;
    }

    public void setNumeroReservation(int numeroReservation) {this.numeroReservation = numeroReservation;}
    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }
    public void setStatut(String statut) {
        this.statut = statut;
    }
    public void setVol(Vol vol){
       this.vol = vol;
    }
    public void setPassager(Passager passager){this.passager = passager;}

}

