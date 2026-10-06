package ma.projet.test;

import ma.projet.bean.Article;
import ma.projet.bean.Categorie;

public class TestApp {

	public static void main(String[] args) {
		
		Categorie[] categorie = {

				new Categorie("Ordinateur Portable", "O PR"), new Categorie("Ordinateur Poste", "O PO") };

		Article[] articles = {

				new Article(14,"DELL INSPIRON", categorie[0]), new Article(4, "SONY VAIO", categorie[0]),
				new Article(74,"TERRA", categorie[1]), new Article(785, "HP Compaq", categorie[1])

		};

		for(int i=0;i<categorie.length;i++) {
			
			Categorie cate = categorie[i];

			
			System.out.println(cate.getLibelle() + " :");
			
			for (int j = 0; j < articles.length; j++) {
				
				Article article = articles[j];
				
				if (article.getCategorie().getId() == cate.getId()) {
	            
	                System.out.println("  - " + article.toString());
	            }
	        }
		}
			
		}
	

}


