public class biblio{
	private document[] listdoc;
	private int nb_doc;
	private int capacite;
	
	public biblio (int capacite){
		this.capacite = capacite;
		this.listdoc = new document[capacite];
        this.nb_doc = 0;
	}
	public int getcapacite(){
		return capacite;
	}
	public void ajout_doc(document d){
		if(nb_doc < capacite){
			listdoc[nb_doc]= d;
			nb_doc++;
			boolean permut;
			do {
				permut = false;
				for (int i = 0; i < nb_doc - 1; i++) {
					if (listdoc[i].getid() > listdoc[i+1].getid()) {
						document temp = listdoc[i];
						listdoc[i] = listdoc[i+1];
						listdoc[i+1] = temp;
						permut = true;
					}
				}
			} while (permut);
		}
		else{
			System.out.println("La bibliothèque est pleine.");
		}
	}
	public void supprim_doc(int num){
		int supp = -1;
		for (int i=0; i<nb_doc; i++) {
			if (listdoc[i].getid() == num) {
				supp = i;
				break;
			}
		}
		if (supp != -1) {
			for (int i=supp; i<nb_doc-1; i++) {
				listdoc[i]= listdoc[i + 1];
			}
			listdoc[nb_doc-1] = null;
			nb_doc--;
		} else {
			System.out.println("document non trouvé.");
		}
	}
	public void inventaire_doc() {
        for (int i = 0; i < nb_doc; i++) {
            listdoc[i].edition();
            System.out.println();
        }
    }
	public int getnbdoc(){
		return nb_doc;
	}
	public biblio liste_livre() {
        biblio biblioLivres = new biblio(capacite);
        for (int i=0; i<nb_doc;i++) {
            if (listdoc[i] instanceof livre) {
                biblioLivres.ajout_doc(listdoc[i]);
            }
        }
        return biblioLivres;
    }
	public biblio liste_article() {
		biblio biblioArticles = new biblio(capacite);
		for (int i = 0; i < nb_doc; i++) {
			if(listdoc[i] instanceof article) {
				biblioArticles.ajout_doc(listdoc[i]);
			}
		}
		return biblioArticles;
	}


    public biblio listeDocSimples() {
        biblio biblioDocsSimples = new biblio(capacite);
        for (int i=0; i<nb_doc; i++) {
            if (!(listdoc[i] instanceof article) && !(listdoc[i] instanceof livre) && !(listdoc[i] instanceof periodique)) {
                biblioDocsSimples.ajout_doc(listdoc[i]);
            }
        }
        return biblioDocsSimples;
    }

    public biblio listePeriodique() {
        biblio biblioPeriodiques = new biblio(capacite);
        for (int i = 0; i < nb_doc; i++) {
            if (listdoc[i] instanceof periodique) {
                biblioPeriodiques.ajout_doc(listdoc[i]);
            }
        }
        return biblioPeriodiques;
    }
	
	
	
}