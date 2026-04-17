public class Employe extends Personne{
    private String numeroEmploye;
    private String dateEmbauche;

    public Employe (){
        super();
        numeroEmploye = "";
        dateEmbauche ="";
    }
    public Employe ( String numeroEmploye, String dateEmbauche,String identifiant, String nom,String adresse,String contact){
        super(identifiant, nom, adresse, contact);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    public String getNumeroEmploye(){return numeroEmploye;}
    public String getDateEmbauche(){return dateEmbauche;}
    public void setNumeroEmploye(String numeroEmploye){this.numeroEmploye = numeroEmploye;}
    public void setDateEmbauche(String dateEmbauche){this.dateEmbauche = dateEmbauche;}

    public void obtenirRole(){System.out.println("La personne est un(e) Employé(e)");}

    @Override
    public String toString(){
        return super.toString()+
                "\nNumero de l'employé :  "+numeroEmploye+
                "\nDate de son embauche : " +dateEmbauche;
    }
}
