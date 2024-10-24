public class article extends document{
	private String nom_auteur;
	
	public article(String titre, int id, int num_pages, String nom_auteur) {
        super(titre, id, num_pages );
        this.nom_auteur = nom_auteur;
    }

    public String getauteur() {
        return nom_auteur;
    }
	public void edition() {
        super.edition();
        System.out.println("auteur: " + nom_auteur);
    }
    public String getType() {
        return "article";
    }
	
}