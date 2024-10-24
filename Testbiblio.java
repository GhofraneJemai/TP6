public class Testbiblio {
    public static void main(String[] args) {
        biblio biblio = new biblio(10);

        document doc1 = new document("document 1", 1, 100);
        article article1 = new article("article 1", 2, 50, "Auteur 1");
        livre livre1 = new livre("livre 1", 3, 200, "Auteur 2", "Éditeur 1");
        periodique periodique1 = new periodique("periodique 1", 4, 30, "Mensuel");

        biblio.ajout_doc(doc1);
        biblio.ajout_doc(article1);
        biblio.ajout_doc(livre1);
        biblio.ajout_doc(periodique1);

        System.out.println("Inventaire complet:");
        biblio.inventaire_doc();

        System.out.println("Nombre de documents: " + biblio.getnbdoc());

        System.out.println("Liste des livres:");
        biblio bibliolivres = biblio.liste_livre();
        bibliolivres.inventaire_doc();

        System.out.println("Liste des articles:");
        biblio biblioarticles = biblio.liste_article();
        biblioarticles.inventaire_doc();

        System.out.println("Liste des documents simples:");
        biblio biblioDocsSimples = biblio.listeDocSimples();
        biblioDocsSimples.inventaire_doc();

        System.out.println("Liste des périodiques:");
        biblio biblioperiodiques = biblio.listePeriodique();
        biblioperiodiques.inventaire_doc();
		
		biblio.supprim_doc(1);
		System.out.println("Inventaire complet:");
        biblio.inventaire_doc();
    }
}
