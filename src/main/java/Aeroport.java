public class Aeroport {
    private String nom ;
    private String ville ;
    private String description;

    public Aeroport(){
        nom ="";
        ville = "";
        description ="";
    }
    public Aeroport (String nom, String ville, String description){
        this.nom = nom;
        this.ville = ville;
        this.description = description;
    }

    public String getNom(){return nom;}
    public String getVille(){return ville;}
    public String getDescription(){return description;}
    public void setNom(String nom){this.nom= nom;}
    public void setVille(String ville){this.ville=ville;}
    public void setDescription(String description){this.description=description;}

    public void affecterVol(){}
    @Override
    public String toString(){
        return "Nom : "+nom+
                "\nVille : "+ville+
                "\nDescription : "+description;
    }
}
