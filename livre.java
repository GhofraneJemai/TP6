public class livre extends article{
	private String nom_editeur;
	
	public livre(String titre, int id, int num_pages, String nom_auteur, String nom_editeur) {
        super(titre, id, num_pages, nom_auteur);
        this.nom_editeur = nom_editeur;
    }

    public String getediteur() {
        return nom_editeur;
    }
    public void edition() {
        super.edition();
        System.out.println("editeur: " + nom_editeur);
    }
    public String getType() {
        return "Livre";
    }
	
}