package ma.projet.bean;

public class Categorie {
	
	 public static int compt = 0;
	
	 public final int id;
	
	 public String libelle ;
	
	 public String code ;

	public Categorie(String libelle, String code) {
		
		this.id=++compt;
		
		this.libelle = libelle;
		
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", libelle=" + libelle + ", code=" + code + "]";
	} 
	
	
	

}
