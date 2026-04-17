public class Personne {
    private String identifiant ;
    private String nom;
    private String adresse;
    private String contact;

    public Personne (){
        identifiant ="";
        nom ="";
        adresse ="";
        contact = "";
    }
    public Personne (String identifiant, String nom,String adresse,String contact){
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.contact = contact;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getContact() {return contact;}
    public String getIdentifiant() {
        return identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setIdentifiant(String identifiant){this.identifiant=identifiant;}

    public void obtenirInfos(){
        System.out.println(
                "Id = " +identifiant+
                ", Nom = "+nom+
                ",adresse = "+adresse+
                ", contact = "+contact);
    }
    @Override
    public String toString(){
        return "Id = " +identifiant+
                ", Nom = "+nom+
                ",adresse = "+adresse+
                ", contact = "+contact;
    }

}
