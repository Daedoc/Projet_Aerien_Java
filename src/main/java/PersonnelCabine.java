public class PersonnelCabine extends Employe{
    private String qualification;

    public PersonnelCabine(){
        super();
        qualification = "";
    }
    public PersonnelCabine(String qualification,
                           String numeroEmploye, String dateEmbauche,
                           String identifiant, String nom, String adresse, String contact){
        super(numeroEmploye, dateEmbauche, identifiant, nom, adresse, contact);
        this.qualification=qualification;
    }

    public String getQualification(){return qualification; }
    public void setQualification(String qualification){this.qualification = qualification;}

    public void affecterVol(){}
    public void obtenirVol(){}
    @Override
    public void obtenirRole (){System.out.println(
                "La personne demandée est Personnel de cabine");
    }
    @Override
    public String toString (){
        return super.toString()+
                "\nQualification : "+qualification;
    }

}
