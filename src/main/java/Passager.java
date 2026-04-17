import java.util.ArrayList;

public class Passager extends Personne {
    private String passeport;
    private ArrayList<Reservation> reservations ;

    public Passager (){
        super();
        passeport = "";
        reservations = new ArrayList<>();
    }
    public Passager(String passeport,String identifiant, String nom,String adresse,String contact){
        super(identifiant, nom, adresse, contact);
        this.passeport = passeport;
        reservations = new ArrayList<>();
    }

    public String getPasseport(){return passeport;}
    public ArrayList<Reservation> getReservations(){return reservations;}
    public void setPasseport (String passeport){this.passeport=passeport;}

    public void reserverVol(int numeroReservation,String dateReservation, String statut, Vol vol){
        Reservation r = new Reservation(numeroReservation, dateReservation, statut,vol,this);
        reservations.add(r);
    }
    public void annulerReservation(int numeroReservation){
        for (int i=0; i<reservations.size();i++){
            if (numeroReservation==reservations.get(i).getNumeroReservation()){
                reservations.remove(i);
            }
        }
    }
    public void obtenirReservation(int numeroReservation){
        for (int i =0 ; i<reservations.size();i++){
            if (numeroReservation ==reservations.get(i).getNumeroReservation()){
                System.out.println(reservations.get(i));
            }
        }
    }

    @Override
    public String toString(){return super.toString()+"\nPasseport N° : "+passeport;}
}
