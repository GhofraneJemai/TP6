public class document{
	private String titre;
	private int id;
	private int num_pages;
	
	public document(){
		this.titre= "NULL";
		this.id=0;
		this.num_pages=0;
	}
	public document(String titre, int id, int num_pages){
		this.titre=titre;
		this.id = id;
		this.num_pages=num_pages;
	}
	public String gettitre(){
		return titre;	
	}
	public void settitre(String titre){
		this.titre = titre;
	}
	public int getid(){
		return id;	
	}
	public void setid(int id){
		this.id = id;
	}
	public int getnumpages(){
		return num_pages;	
	}
	public void settitre(int num_pages){
		this.num_pages = num_pages;
	}
	public void edition() {
        System.out.println("Type: " + getType());
        System.out.println("Titre: " + titre);
        System.out.println("ID: " + id);
        System.out.println("Nombre de pages: " + num_pages);
    }
    public String getType() {
        return "Document";
    }
}