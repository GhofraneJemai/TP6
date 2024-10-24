public class periodique extends document{
	private String freq;
	
	public periodique(String titre, int id, int num_pages, String freq) {
        super(titre, id, num_pages);
        this.freq = freq;
    }

    public String getfreq() {
        return freq;
    }
    public void edition() {
        super.edition();
        System.out.println("freq: " + freq);
    }
    public String getType() {
        return "periodique";
    }
	
	
}