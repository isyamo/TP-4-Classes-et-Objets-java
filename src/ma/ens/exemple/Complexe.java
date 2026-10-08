package ma.ens.exemple;

public class Complexe {
	
	private int nbReel;
	private int nbImag;

	public Complexe(int nbReel , int nbImag) {
		this.nbReel = nbReel;
		this.nbImag = nbImag;
		
	}

	public Complexe plus (Complexe c2) {

		
		return new Complexe(this.nbReel+c2.nbReel,this.nbImag+c2.nbImag) ;
	}

	public Complexe moins(Complexe c2) {

		return new Complexe(this.nbReel-c2.nbReel,this.nbImag-c2.nbImag) ;
	}

	@Override
	public String toString() {
		
		return nbReel +" + " + nbImag+"i";
	}




}
