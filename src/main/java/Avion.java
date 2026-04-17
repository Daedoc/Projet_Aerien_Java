public class Avion {
    private String immatriculation ;
    private String modele;
    private int capacite;
    private Vol monVol;

    public Avion(){
        immatriculation ="";
        modele="";
        capacite = 0;
        monVol = null;
    }
    public Avion(String immatriculation,String modele, int capacite, Vol monVol){
        this.immatriculation=immatriculation;
        this.modele = modele;
        this.capacite=capacite;
        this.monVol=monVol;
    }

    public String getImmatriculation(){return immatriculation;}
    public String getModele(){return modele;}
    public int getCapacite(){return capacite;}
    public Vol getMonVol(){return monVol;}
    public void setImmatriculation(String immatriculation){
        this.immatriculation=immatriculation;
    }
    public void setModele(String modele){this.modele=modele;}
    public void setCapacite(int capacite){this.capacite=capacite;}
    public void setMonVol(Vol monVol) {this.monVol = monVol;}

    public void affecterVol(Vol vol){
        setMonVol(vol);
        System.out.println("Le vol "+monVol.getNumeroVol()+" a bien été affecté!");
    }
    public boolean verifierDisponibilite(){
        if(monVol==null){
            System.out.println("L'avion est disponible ");
            return true;
        }else {
            System.out.println("L'avion n'est pas disponible ");
            return false;
        }
    }

    @Override
    public String toString(){
        return "Immatriculation : "+immatriculation+
                "\nModèle : "+modele+
                "\nCapacité : "+capacite+
                "\nVol : "+monVol;
    }
}
