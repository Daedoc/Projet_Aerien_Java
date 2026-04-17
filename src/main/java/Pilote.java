public class Pilote extends Employe{
    private String licence ;
    private int heuresDeVol;

    public Pilote(){
        super();
        licence = "";
        heuresDeVol = 0;
    }
    public Pilote(String licence, int heuresDeVol,
                  String numeroEmploye, String dateEmbauche,
                  String identifiant, String nom, String adresse, String contact){
        super(numeroEmploye,dateEmbauche,identifiant, nom, adresse, contact);
        this.licence=licence;
        this.heuresDeVol=heuresDeVol;
    }

    public String getLicence(){return licence;}
    public int getHeuresDeVol(){return heuresDeVol;}
    public void setLicence(String licence){this.licence = licence;}
    public void setHeuresDeVol(int heuresDeVol){this.heuresDeVol = heuresDeVol;}

    public void affecterVol(){}
    public void obtenirVol(){}
    @Override
    public void obtenirRole(){System.out.println("La personne demandée est Pilote");}
    @Override
    public String toString(){
        return super.toString()+
                "\nLicence : "+licence+
                "\nHeures de Vol : "+heuresDeVol;
    }

}
