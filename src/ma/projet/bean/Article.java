package ma.projet.bean;

public class Article {
	
   public static int compt = 0;
	
   public int id ;
	
   public int code ;
	
   public String designation;
	
   public Categorie categorie;

	public Article(int code, String designation, Categorie categorie) {
		
		this.id =++compt;
		
		this.code = code;
		
		this.designation = designation;
		
		this.categorie = categorie;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return id + "  " + code + "  " + designation ;
	}
	
	
	

}
